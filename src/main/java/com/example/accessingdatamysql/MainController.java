package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
@RequestMapping(path="/")
public class MainController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private SalariesRepository salariesRepository;

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Employees> getAllUsers() {
		return employeeRepository.findAll();
	}

	//@GetMapping(path="/get")
	//public ResponseEntity<List<Employee>> getName() {}

	@GetMapping(path="/count")
	public @ResponseBody Long count() {
		return employeeRepository.count();
	}

	@GetMapping(path="/getEntry/{id}")
	public @ResponseBody Optional<Employees> getEntry(@PathVariable Integer id) {
		return employeeRepository.findById(id);
	}

	@GetMapping(path="/getEntryId")
	@ResponseBody
	public Optional<Employees> getEntryId(@RequestParam Integer emp_id) {
		return employeeRepository.findById(emp_id);
	}

	@GetMapping(path="/getAllSalary")
	public @ResponseBody Iterable<Salaries> getAllSalary() {
		return salariesRepository.findAll();
	}
}
