package com.sharathinfotech.Projectinfo.controller;

import com.sharathinfotech.Projectinfo.dto.Projectdto;
import com.sharathinfotech.Projectinfo.model.Project;
import com.sharathinfotech.Projectinfo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class Projectcontroller {

    @Autowired
    private ProjectService projectService;
    @PostMapping("/addproject")
    public ResponseEntity<Project> addproject(@RequestBody Projectdto project){
        return new ResponseEntity<>(projectService.addproject(project), HttpStatus.CREATED);
    }
    @GetMapping("/project/{ccode}")
    public ResponseEntity<List<Project>> getproject(@PathVariable Long ccode){
        return  ResponseEntity.ok(projectService.getProjectByCcode(ccode));
    }

}
