package com.mockpeoplesoft.rest.model.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Student {

    @JsonProperty("STUDENT_DATA")
    private StudentData studentData;

    @JsonProperty("PROGRAMS")
    private List<Programs> PROGRAMS;

    public Student(StudentData studentData, List<Programs> PROGRAMS) {
        super();
        this.studentData = studentData;
        this.PROGRAMS = PROGRAMS;
    }
}
