package com.sharathinfotech.Employeeinfo.repository;

import com.sharathinfotech.Employeeinfo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Employeerepository extends JpaRepository<Employee,Long> {
    Optional<Employee> findByCcode(Long ccode);
}
