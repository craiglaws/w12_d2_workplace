package com.codeclan.example.WorkplaceLab;

import com.codeclan.example.WorkplaceLab.models.Department;
import com.codeclan.example.WorkplaceLab.models.Employee;
import com.codeclan.example.WorkplaceLab.models.Project;
import com.codeclan.example.WorkplaceLab.repositories.DepartmentRepository;
import com.codeclan.example.WorkplaceLab.repositories.EmployeeRepository;
import com.codeclan.example.WorkplaceLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class WorkplaceLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployeeDepartment(){
		Department department1 = new Department("Finance");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Dave", "Jones", 123, department1);
		employeeRepository.save(employee1);


	}

	@Test
	public void canAddEmployeeProjects(){
		Department department1 = new Department("Finance");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Frank", "Turner", 321, department1);
		employeeRepository.save(employee1);

		Project project1 = new Project("project1", 5);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}

}
