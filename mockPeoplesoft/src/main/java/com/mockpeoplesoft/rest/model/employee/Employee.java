package com.mockpeoplesoft.rest.model.employee;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Employee {

    @JsonProperty("EMPLID")
    private String id;
    @JsonProperty("STUDENT")
    private Student student;

    public Employee(String id, Student student) {
        super();
        this.id = id;
        this.student =  student;
    }
}
