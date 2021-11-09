package com.mockpeoplesoft.rest.model.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StudentResponse {
    @JsonProperty("EMPLID")
    private String emplid;

    @JsonProperty("STRM")
    private String strm;

    @JsonProperty("STUDENT")
    private Student student;

    public StudentResponse(String emplid, String strm, Student student) {
        super();
        this.emplid = emplid;
        this.strm = strm;
        this.student = student;
    }
}
