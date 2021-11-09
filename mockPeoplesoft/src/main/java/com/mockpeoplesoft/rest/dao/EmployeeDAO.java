package com.mockpeoplesoft.rest.dao;

import com.mockpeoplesoft.rest.model.employee.Employee;
import com.mockpeoplesoft.rest.model.employee.Student;
import com.mockpeoplesoft.rest.model.employee.StudentData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class EmployeeDAO 
{
    public static final Logger LOG = LoggerFactory.getLogger(EmployeeDAO.class);
    List<Employee> employeeList = new ArrayList<Employee>();
    {
        StudentData studentData = new StudentData("Fred", "Cosmossert", "fred@cosmos.com");
        Student student = new Student(studentData);
        employeeList.add(new Employee("1600001", student));

        studentData = new StudentData("Alex", "Kolenchiskey", "Alex@gmail.com");
        student = new Student(studentData);
        employeeList.add(new Employee("1600002", student));

        studentData = new StudentData("David", "Kameron", "David@gmail.com");
        student = new Student(studentData);
        employeeList.add(new Employee("1600003", student));
    }

    public List<Employee> getAllEmployees()
    {
        return employeeList;
    }

    public Employee getById(String id) {
        LOG.info("-------------------Getting employees List for : " + id + "------------------------");
        Optional<Employee> employees = Optional.ofNullable(employeeList.stream()
                .filter(x -> x.getId() != null)
                .filter(x -> !x.getId().isEmpty())
                .filter(x -> x.getId().equalsIgnoreCase(id))
                .collect(Collectors.toList()).get(0));

        if (employees.isPresent())
            return employees.get();
        else
            LOG.info("-------------------returning null for " + id + "------------------------");
            return null;

    }

}
