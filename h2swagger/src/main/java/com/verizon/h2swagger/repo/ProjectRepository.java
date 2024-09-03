package com.verizon.h2swagger.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verizon.h2swagger.entity.Project;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
    
}
