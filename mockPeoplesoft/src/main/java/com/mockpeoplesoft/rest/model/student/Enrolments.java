package com.mockpeoplesoft.rest.model.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Enrolments {

    @JsonProperty("ENROLMENT")
    private List<Enrolment> enrolment;

    public Enrolments(List<Enrolment> enrolment) {
        super();
        this.enrolment = enrolment;
    }
}
