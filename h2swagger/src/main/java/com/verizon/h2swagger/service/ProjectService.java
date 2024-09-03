package com.verizon.h2swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.h2swagger.entity.Project;
import com.verizon.h2swagger.repo.ProjectRepository;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    public Optional<Project> findById(Integer id){
        return projectRepository.findById(id);
    }

    public void save(Project project){
        projectRepository.save(project);
    }

    public void update(Integer id, Project project){
        projectRepository.save(project);
    }

    public void deleteById(Integer id){
        projectRepository.deleteById(id);
    }
}
