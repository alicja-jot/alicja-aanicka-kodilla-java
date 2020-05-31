package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FacadeTest {

    @Autowired
    private Facade testedFacade;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @BeforeEach
    void init() {
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }

    @Test
    void findEmployeeByName() {
        // given
        employeeDao.save(new Employee("John", "Snow"));
        employeeDao.save(new Employee("Johnny", "Bravo"));
        employeeDao.save(new Employee("Dexter", "Brave"));

        // when
        List<Employee> found = testedFacade.findEmployeeByName("Bra");

        // Then
        assertEquals(2, found.size());
        assertTrue(found.get(0).getLastname().toLowerCase().contains("Bra"));
        assertTrue(found.get(1).getLastname().toLowerCase().contains("Bra"));
    }

    @Test
    void findTaskListByName() {
        // given
        companyDao.save(new Company("Comarch"));
        companyDao.save(new Company("Altcom"));
        companyDao.save(new Company("Google"));

        // when
        List<Company> found = testedFacade.findCompanyByName("com");

        // Then
        assertEquals(2, found.size());
        assertTrue(found.get(0).getName().toLowerCase().contains("com"));
        assertTrue(found.get(1).getName().toLowerCase().contains("com"));
    }
}