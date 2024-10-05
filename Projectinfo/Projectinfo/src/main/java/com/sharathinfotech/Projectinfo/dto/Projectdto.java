package com.sharathinfotech.Projectinfo.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projectdto {
    private long projectId;
    @NotNull(message = "Project name cannot be null")
    private String projectName;
    @NotNull(message = "Project description cannot be null")
    @Size(min = 10, max = 500, message = "Project description must be between 10 and 500 characters")
    private String projectDescription;
    @NotBlank(message = "Project manager cannot be blank")
    private String projectManager;
    @Min(value = 2, message = "Team members must be at least 1")
    @Max(value = 200, message = "Team members cannot exceed 200")
    private int teamMembers;
    @Pattern(regexp = "^(InProgress|Completed)$", message = "Invalid project status")
    private String projectStatus;
    private String projectStartDate;
    private String projectEndDate;
    @Min(value = 1000, message = "Project budget must be at least 1000")
    private double projectBudget;
    @NotBlank(message = "Company name cannot be blank")
    private String companyName;
    private Long ccode;
}
