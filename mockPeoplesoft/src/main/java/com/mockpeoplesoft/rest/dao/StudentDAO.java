package com.mockpeoplesoft.rest.dao;

import com.mockpeoplesoft.rest.model.student.Student;
import com.mockpeoplesoft.rest.model.student.Enrolment;
import com.mockpeoplesoft.rest.model.student.Enrolments;
import com.mockpeoplesoft.rest.model.student.Program;
import com.mockpeoplesoft.rest.model.student.Programs;
import com.mockpeoplesoft.rest.model.student.StudentData;
import com.mockpeoplesoft.rest.model.student.StudentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentDAO
{
    public static final Logger LOG = LoggerFactory.getLogger(StudentDAO.class);
    List<StudentResponse> responses = new ArrayList<StudentResponse>();
    {
        Enrolment enrolment = new Enrolment("MDIA","3310","Business and Economic Statistics","ENRL","15/02/2022",
                "1021234", "Sarah Kate", "Brown", "sarah@brownsville.com","ACCOUNTING","BUSSCH","PROFESSION","18");
        List<Enrolment> enrolmentList = new ArrayList<Enrolment>();
        enrolmentList.add(enrolment);
        Enrolments enrolments = new Enrolments(enrolmentList);

        Program program = new Program("BECBF","B.Economics/B.Finance","3710","2017 Semester 1","33: Secondary " +
                "Education (Aus/OS)","ECONOMICS","ECONOMICS","PROFESSION","5","Active in Program","Satisfactory" );

        Programs programs = new Programs(program, enrolments);
        List<Programs> programsList = new ArrayList<Programs>();
        programsList.add(programs);

        StudentData studentData = new StudentData("123456789Q","Mr","James Brian","Hogsworth","james@thehog.com","08 8272 2829","0419811856","Australia","Australia","English","Domestic");

        Student student = new Student(studentData, programsList);

        StudentResponse studentResponse = new StudentResponse("52145236","4200", student);

        responses.add(studentResponse);

    }

    public StudentResponse  getById(String id) {
        LOG.info("-------------------Getting Student details for : " + id + "------------------------");
        return responses.stream().filter(x -> x.getEmplid().equalsIgnoreCase(id)).collect(Collectors.toList()).get(0);
    }

}
