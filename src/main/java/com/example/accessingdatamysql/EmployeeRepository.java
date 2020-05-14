package com.example.accessingdatamysql;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
	//List<Employees> findAllByFirst_name(String name);
}
