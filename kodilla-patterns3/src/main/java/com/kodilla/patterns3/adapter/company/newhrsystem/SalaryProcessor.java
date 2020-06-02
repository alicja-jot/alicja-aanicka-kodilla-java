package com.kodilla.patterns3.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.List;

public interface SalaryProcessor {

    BigDecimal calculateSalaries(List<Employee> employees);

}
