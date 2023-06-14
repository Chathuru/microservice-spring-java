package com.chathuru.accessingdatamysql.repository;

import com.chathuru.accessingdatamysql.model.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

}
