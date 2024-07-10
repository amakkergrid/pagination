package com.griddynamics.paginationsorting.repository;

import com.griddynamics.paginationsorting.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmpId(Long id);
    List<Employee> deleteByDesignation(String designation);
    Employee findTopByDesignationOrderBySalaryDesc(String designation);
}
