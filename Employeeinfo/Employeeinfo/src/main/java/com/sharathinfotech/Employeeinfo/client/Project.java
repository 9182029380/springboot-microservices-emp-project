package com.sharathinfotech.Employeeinfo.client;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private long projectId;
    private String projectName;
    private String projectDescription;
    private String projectManager;
    private int teamMembers;
    private String projectStatus;
    private String projectStartDate;
    private String projectEndDate;
    private double projectBudget;
    private String companyName;
    private Long ccode;
}
