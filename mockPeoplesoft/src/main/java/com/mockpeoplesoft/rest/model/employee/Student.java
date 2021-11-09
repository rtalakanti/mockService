package com.mockpeoplesoft.rest.model.employee;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Student {
	@ApiModelProperty(notes = "Name of the Student",name="STUDENT_DATA",required=true,value="STUDENT_DATA")
	@JsonProperty("STUDENT_DATA")
	private StudentData studentData;

	public Student(StudentData studentData) {
		super();
		this.studentData = studentData;
	}

}
