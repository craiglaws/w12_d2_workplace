package com.codeclan.example.WorkplaceLab.repositories;

import com.codeclan.example.WorkplaceLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
