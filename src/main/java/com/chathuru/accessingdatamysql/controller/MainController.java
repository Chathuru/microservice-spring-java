package com.chathuru.accessingdatamysql.controller;

import com.chathuru.accessingdatamysql.model.dto.EmployeeDto;
import com.chathuru.accessingdatamysql.repository.EmployeeRepository;
import com.chathuru.accessingdatamysql.repository.SalariesRepository;
import com.chathuru.accessingdatamysql.model.entity.*;
import com.chathuru.accessingdatamysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/")
public class MainController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private SalariesRepository salariesRepository;

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Employees> getAllUsers() {
		return employeeRepository.findAll();
	}

	@PostMapping(path="/addEmployee")
	public Employees addEmployee(@RequestBody Employees employee){
		return employeeRepository.save(employee);
	}

	@PostMapping(path="/add")
	public EmployeeDto create(@RequestBody EmployeeDto employeeDto) {
		return employeeService.create(employeeDto);
	}

	@GetMapping(path="/count")
	public @ResponseBody Long count() {
		return employeeRepository.count();
	}

	@GetMapping(path="/getEmployee/{id}")
	public @ResponseBody Optional<Employees> getEntry(@PathVariable Integer id) {
		return employeeRepository.findById(id);
	}

	@DeleteMapping(path="/getEmployee/{id}")
	public @ResponseBody Optional<Employees> deleteEmployee(@PathVariable Integer id) {
		Optional<Employees> employees = employeeRepository.findById(id);
		employeeRepository.deleteById(id);
		return employees;
	}

	@GetMapping(path="/getEmployeeId")
	@ResponseBody
	public Optional<Employees> getEntryId(@RequestParam Integer emp_id) {
		return employeeRepository.findById(emp_id);
	}

	@GetMapping(path="/getAllSalary")
	public @ResponseBody Iterable<Salaries> getAllSalary() {
		return salariesRepository.findAll();
	}
}
