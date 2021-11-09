package com.mockpeoplesoft.rest.model.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Programs {

    @JsonProperty("PROGRAM")
    private Program program;

    @JsonProperty("ENROLMENTS")
    private Enrolments enrolments;

    public Programs(Program program, Enrolments enrolments) {
        super();
        this.program = program;
        this.enrolments = enrolments;
    }
}
