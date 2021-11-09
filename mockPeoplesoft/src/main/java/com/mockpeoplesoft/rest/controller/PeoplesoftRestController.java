package com.mockpeoplesoft.rest.controller;

import java.util.List;

import com.mockpeoplesoft.rest.dao.EmployeeDAO;
import com.mockpeoplesoft.rest.dao.StudentDAO;
import com.mockpeoplesoft.rest.model.employee.Employee;
import com.mockpeoplesoft.rest.model.student.StudentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mockpeoplesoft.rest.model.employee.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "PeoplesoftRestController", description = "REST Apis related to Student Entity!!!!")
@RestController
public class PeoplesoftRestController {
	public static final Logger LOG = LoggerFactory.getLogger(PeoplesoftRestController.class);
	@Autowired
	private EmployeeDAO employeeDao;
	@Autowired
	private StudentDAO studentDAO;
	/*@Autowired
	private TermReferenceDataResponse termReferenceDataResponse;*/


	@ApiOperation(value = "Get Student by ID ",response = Student.class,tags="Student")
	@RequestMapping(value = "/getStudent/{employeeId}", method= RequestMethod.GET, produces =
			MediaType.APPLICATION_JSON_VALUE)
	public StudentResponse getStudentById(@PathVariable(value ="employeeId") String id) {
		return studentDAO.getById(id);
	}

	@ApiOperation(value = "Get All employees in the System ",response = Student.class,tags="Person")
	@RequestMapping(value = "/getPerson", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployees()
	{
		return employeeDao.getAllEmployees();
	}

	@ApiOperation(value = "Get employee by ID ",response = Student.class,tags="Person")
	@RequestMapping(value = "/getPerson/{employeeId}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeById(@PathVariable(value ="employeeId") String id) {
		return employeeDao.getById(id);
	}

}
