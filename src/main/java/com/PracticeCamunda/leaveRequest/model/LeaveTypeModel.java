package com.PracticeCamunda.leaveRequest.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "leave_type")
public class LeaveTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String type;
    Boolean isActive;

    public LeaveTypeModel(){

    }
    public LeaveTypeModel(String type,Boolean isActive) {

        this.type=type;
        this.isActive=isActive;
    }
}
