package com.PracticeCamunda.leaveRequest.controller;


import com.PracticeCamunda.leaveRequest.model.LeaveRequestModel;
import com.PracticeCamunda.leaveRequest.model.LeaveTypeModel;
import com.PracticeCamunda.leaveRequest.repository.LeaveRequestRepository;
import com.PracticeCamunda.leaveRequest.repository.LeaveTypeRepository;
import com.PracticeCamunda.leaveRequest.service.LeaveRequestService;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Component
public class LeaveRequestController {
    @Autowired
    private LeaveRequestService leaveRequestService;
    @Autowired
    private LeaveRequestRepository leaveRequestRepository;

    @Autowired
    private LeaveTypeRepository leaveTypeRepository;


    @JobWorker(type = "add-leave-request")
    public void addLeaveRequest(JobClient client, ActivatedJob job) {
        String employeeName = job.getVariable("employeeName").toString();
//        Date leaveStartDate= (java.sql.Date) job.getVariablesAsMap().get("leaveStartDate");
        int leaveType = Integer.parseInt(job.getVariablesAsMap().get("leaveType").toString());
        System.out.println(employeeName);
        LeaveTypeModel leaveTypeModel = leaveTypeRepository.findById(leaveType)
                .orElseThrow(() -> new RuntimeException("Leave Type dfdfvhj not found"));

        LeaveRequestModel requestModel = leaveRequestRepository.save(new LeaveRequestModel(
                employeeName,
                new Date(),
                new Date(),
                leaveTypeModel,
                "reason"
        ));




        System.out.println(employeeName + " " + requestModel);
        Map<String, Object> variables = new HashMap<>();
        variables.put(employeeName, employeeName);
        variables.put("hellppkeyyyy", "jskjsf");


        client.newCompleteCommand(job.getKey()).variables(variables).send().join();
    }
}



