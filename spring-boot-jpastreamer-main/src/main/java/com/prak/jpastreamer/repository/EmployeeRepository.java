package com.prak.jpastreamer.repository;

import com.prak.jpastreamer.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
