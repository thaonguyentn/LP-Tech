package com.vti.controller;

import com.vti.entity.SalaryEmployee;
import com.vti.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/employee")
@CrossOrigin("*")
public class SalaryController {
    @Autowired
    private ISalaryService service;

    @GetMapping(value = "/totalSalary", produces = MediaType.APPLICATION_JSON_VALUE)
    public SalaryEmployee getCollateralCustomer() {
        return service.getAllSalaryEm();
    }
}
