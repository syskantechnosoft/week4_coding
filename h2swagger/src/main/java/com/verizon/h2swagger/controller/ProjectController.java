package com.verizon.h2swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.h2swagger.entity.Project;
import com.verizon.h2swagger.service.ProjectService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> findAll() {
        return projectService.findAll();
    }

    @GetMapping("/{id}")
    public Project findById(@PathVariable Integer id) {
        return projectService.findById(id).orElse(null);
    }

    @PostMapping
    public void save(@RequestBody Project project) {
        projectService.save(project);
    }

    @PutMapping("/{id}")
    public void save(@PathVariable Integer id, @RequestBody Project project) {
        projectService.update(id, project);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        projectService.deleteById(id);
    }
}
