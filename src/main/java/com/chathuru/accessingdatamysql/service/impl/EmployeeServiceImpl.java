package com.chathuru.accessingdatamysql.service.impl;

import com.chathuru.accessingdatamysql.model.dto.EmployeeDto;
import com.chathuru.accessingdatamysql.repository.EmployeeRepository;
import com.chathuru.accessingdatamysql.model.entity.Employees;
import com.chathuru.accessingdatamysql.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto create(EmployeeDto employeeDto) {
        Employees employeeEntity = new Employees();
        BeanUtils.copyProperties(employeeDto, employeeEntity);
        employeeEntity = employeeRepository.save(employeeEntity);
        BeanUtils.copyProperties(employeeEntity, employeeDto);
        return employeeDto;
    }
}
