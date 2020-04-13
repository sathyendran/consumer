package org.sathya.producer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "${employee.producer.url}")
public interface EmployeeClient {

    @PostMapping("/employee/email")
    public Employee findByEmail(Employee employee);
}
