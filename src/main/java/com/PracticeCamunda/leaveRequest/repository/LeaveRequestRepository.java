package com.PracticeCamunda.leaveRequest.repository;

import com.PracticeCamunda.leaveRequest.model.LeaveRequestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRequestRepository extends JpaRepository <LeaveRequestModel,Long>{
}
