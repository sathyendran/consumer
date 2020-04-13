package org.sathya.producer.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeClient employeeClient;

    @Override
    public Employee findByEmail(String email) {
        log.info("Consuming the employee by Email : {}", email);
        Employee employee = new Employee();
        employee.setEmail(email);
        return employeeClient.findByEmail(employee);
    }
}
