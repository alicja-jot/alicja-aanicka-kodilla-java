package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveCompanyByThreeSigns() {
        // Given
        String threeLetters = "COM";

        Company company1 = companyDao.save(new Company("COMARCH"));
        Company company2 = companyDao.save(new Company("ASSECO"));
        Company company3 = companyDao.save(new Company("COMBIT"));
        Company company4 = companyDao.save(new Company("COMCAT"));
        Company company5 = companyDao.save(new Company("CatCOM"));

        // When
        List<Company> companies = companyDao.retrieveCompanyByThreeSigns(threeLetters);

        // Then
        assertEquals(3, companies.size());

        // CleanUp
        companyDao.deleteById(company1.getId());
        companyDao.deleteById(company2.getId());
        companyDao.deleteById(company3.getId());
        companyDao.deleteById(company4.getId());
        companyDao.deleteById(company5.getId());
    }

    @Test
    public void testRetrieveLastnamedEmployee(){
        // Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Jan", "Nowak");
        Employee employee3 = new Employee("Rafał", "Koń");
        Employee employee4 = new Employee("Ignacy", "Kowal");
        Employee employee5 = new Employee("Pawel", "Kowalski");

        int employeeId1 =  employeeDao.save(employee1).getId();
        int employeeId2 =  employeeDao.save(employee2).getId();
        int employeeId3 =  employeeDao.save(employee3).getId();
        int employeeId4 =  employeeDao.save(employee4).getId();
        int employeeId5 =  employeeDao.save(employee5).getId();

        // When
        List<Employee> resultEmployees = employeeDao.retrieveLastnamedEmployee("Kowalski");
        // Then
        Assert.assertEquals(2, resultEmployees.size());
        //CleanUp
        employeeDao.deleteById(employeeId1);
        employeeDao.deleteById(employeeId2);
        employeeDao.deleteById(employeeId3);
        employeeDao.deleteById(employeeId4);
        employeeDao.deleteById(employeeId5);
    }
}