package org.sathya.producer.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer/employee")
@Log4j2
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/email")
    public Employee findByEmail(@RequestBody Employee employee) {
        log.info("Fetching the employee details for the employee : {} ", employee.getEmail());
        return employeeService.findByEmail(employee.getEmail());
    }
}
