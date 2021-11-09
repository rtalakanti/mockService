package com.mockpeoplesoft.rest.model.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Enrolment {
    @ApiModelProperty(notes = "Name of the Student",name="droppedDate",required=true,value="droppedDate")
    @JsonProperty("SUBJECT_AREA")
    private String subjectArea;

    @JsonProperty("CATALOGUE_NBR")
    private String catalogueNbr;

    @JsonProperty("COURSE_NAME")
    private String courseName;

    @JsonProperty("COURSE_STATUS")
    private String courseStatus;

    @JsonProperty("DROPPED_DATE")
    private String droppedDate;

    @JsonProperty("CRS_CRD_ID")
    private String crsCrdId;

    @JsonProperty("CRS_CRD_GIVEN_NAME")
    private String crsCrdGivenName;

    @JsonProperty("CRS_CRD_FAMILY_NAME")
    private String crsCrdFamilyName;

    @JsonProperty("CRS_CRD_EMAIL")
    private String crsCrdEmail;

    @JsonProperty("TCH_ORG_DEPT")
    private String tchOrgDept;

    @JsonProperty("TCH_ORG_SCHL")
    private String tchOrgSchl;

    @JsonProperty("TCH_ORG_FAC")
    private String tchOrgFac;

    @JsonProperty("CRSE_WEEKS")
    private String crseWeeks;

    public Enrolment(String subjectArea, String catalogueNbr, String courseName, String courseStatus, String droppedDate, String crsCrdId, String crsCrdGivenName, String crsCrdFamilyName, String crsCrdEmail, String tchOrgDept, String tchOrgSchl, String tchOrgFac, String crseWeeks) {
        super();
        this.subjectArea = subjectArea;
        this.catalogueNbr = catalogueNbr;
        this.courseName = courseName;
        this.courseStatus = courseStatus;
        this.droppedDate = droppedDate;
        this.crsCrdId = crsCrdId;
        this.crsCrdGivenName = crsCrdGivenName;
        this.crsCrdFamilyName = crsCrdFamilyName;
        this.crsCrdEmail = crsCrdEmail;
        this.tchOrgDept = tchOrgDept;
        this.tchOrgSchl = tchOrgSchl;
        this.tchOrgFac = tchOrgFac;
        this.crseWeeks = crseWeeks;
    }
}
