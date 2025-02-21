package com.PracticeCamunda.leaveRequest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.Map;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;




@Entity
@Table(name = "leave_request")
public class LeaveRequestModel implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long employeeId;
    private String employeeName;
    private Date startDate;
    private Date endDate;
    private String reason;

    @ManyToOne
    @JoinColumn(name="leaveType_id",referencedColumnName = "id",nullable = false)//Foreign Key
    private LeaveTypeModel leaveTypeModel;

    public LeaveRequestModel(String employeeName, Date startDate, Date endDate, LeaveTypeModel leaveTypeModel, String reason) {
        this.employeeName = employeeName;
        this.startDate = startDate;
        this.endDate = endDate;
      this.leaveTypeModel = leaveTypeModel;
        this.reason = reason;
    }

}
