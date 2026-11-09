package com.bootforge.employeemgmtsystem.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
public record Employee(
        Long id,
        String name,
        String designation,
        LocalDate joiningDate,
        BigDecimal salary
) {
}
