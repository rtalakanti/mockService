package com.mockpeoplesoft.rest.model.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StudentRequest {

    @JsonProperty("EMPLID")
    private String emplId;

    @JsonProperty("STRM")
    private String strm;

}
