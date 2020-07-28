package com.codeclan.example.WorkplaceLab.repositories;

import com.codeclan.example.WorkplaceLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
