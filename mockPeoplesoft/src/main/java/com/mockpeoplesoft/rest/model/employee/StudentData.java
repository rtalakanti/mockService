package com.mockpeoplesoft.rest.model.employee;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@Data

public class StudentData {
        @ApiModelProperty(notes = "Name of the Student",name="givenName",required=true,value="familyName")
        @JsonProperty("GIVEN_NAME")
        private String givenName;
        @ApiModelProperty(notes = "Class of the Student",name="familyName",required=true,value="familyName")
        @JsonProperty("FAMILY_NAME")
        private String familyName;
        @ApiModelProperty(notes = "Country of the Student",name="email",required=true,value="email")
        @JsonProperty("EMAIL")
        private String email;

        public StudentData(String name, String cls, String country) {
            super();
            this.givenName = name;
            this.familyName = cls;
            this.email = country;
        }
    }
