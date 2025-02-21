package com.PracticeCamunda.leaveRequest.repository;

import com.PracticeCamunda.leaveRequest.model.LeaveTypeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveTypeRepository extends JpaRepository<LeaveTypeModel,Integer> {

}
