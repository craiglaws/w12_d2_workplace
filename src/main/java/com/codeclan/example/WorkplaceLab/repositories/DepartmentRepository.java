package com.codeclan.example.WorkplaceLab.repositories;

import com.codeclan.example.WorkplaceLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
