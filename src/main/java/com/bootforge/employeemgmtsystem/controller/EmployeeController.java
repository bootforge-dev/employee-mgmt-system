package com.bootforge.employeemgmtsystem.controller;

import com.bootforge.employeemgmtsystem.dto.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(listEmployees());
    }

    private static List<Employee> listEmployees() {
        return List.of(
                Employee.builder().id(1L).name("Madhav").designation("Developer").joiningDate(LocalDate.of(2022, 6, 20)).salary(new BigDecimal("50000.00")).build(),
                Employee.builder().id(2L).name("Indu").designation("HR").joiningDate(LocalDate.of(2019, 9, 19)).salary(new BigDecimal("70000.00")).build(),
                Employee.builder().id(3L).name("Vedha").designation("Manager").joiningDate(LocalDate.of(2015, 4, 10)).salary(new BigDecimal("100000.00")).build()
        );
    }

}
