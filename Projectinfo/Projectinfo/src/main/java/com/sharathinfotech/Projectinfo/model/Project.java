package com.sharathinfotech.Projectinfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
public class Project {
    @Id
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
    private Long ccode;//fk
}
