package com.codeclan.example.WorkplaceLab.controllers;

import com.codeclan.example.WorkplaceLab.models.Department;
import com.codeclan.example.WorkplaceLab.models.Project;
import com.codeclan.example.WorkplaceLab.repositories.DepartmentRepository;
import com.codeclan.example.WorkplaceLab.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/projects")
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @GetMapping(value = "/projects/{id}")
    public Optional<Project> getProject(@PathVariable Long id){
        return projectRepository.findById(id);
    }
}
