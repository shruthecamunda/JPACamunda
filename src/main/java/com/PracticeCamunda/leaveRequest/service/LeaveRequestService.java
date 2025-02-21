package com.PracticeCamunda.leaveRequest.service;

import com.PracticeCamunda.leaveRequest.model.LeaveRequestModel;
import com.PracticeCamunda.leaveRequest.repository.LeaveRequestRepository;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveRequestService
{
    @Autowired
    private LeaveRequestRepository leaveRequestRepository;

//    @JobWorker(type = "getAll")
    private List<LeaveRequestModel> Leave(){
        System.out.println(leaveRequestRepository.findAll());
        return leaveRequestRepository.findAll();
    }
}
