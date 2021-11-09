package com.mockpeoplesoft.rest.model.student;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Program {

    @JsonProperty("PROGRAM")
    private String program;

    @JsonProperty("PROGRAM_NAME")
    private String programName;

    @JsonProperty("PROG_ADMT_TERM")
    private String progAdmtTerm;

    @JsonProperty("PROG_ADMT_TERM_DESCR")
    private String progAdmtTermDescr;

    @JsonProperty("BASIS_ADMISSION")
    private String basisAdmission;

    @JsonProperty("PRG_ORG_DEPT")
    private String prgOrgDept;

    @JsonProperty("PRG_ORG_SCHL")
    private String prgOrgSchl;

    @JsonProperty("PRG_ORG_FAC")
    private String prgOrgfac;

    @JsonProperty("PROGRAM_GPA")
    private String programGpa;

    @JsonProperty("PROGRAM_STATUS")
    private String programStatus;

    @JsonProperty("STD_PROGRESS")
    private String stdProgress;


    public Program(String program, String programName, String progAdmtTerm, String progAdmtTermDescr, String basisAdmission, String prgOrgDept, String prgOrgSchl, String prgOrgfac, String programGpa, String programStatus, String stdProgress) {
        super();
        this.program = program;
        this.programName = programName;
        this.progAdmtTerm = progAdmtTerm;
        this.progAdmtTermDescr = progAdmtTermDescr;
        this.basisAdmission = basisAdmission;
        this.prgOrgDept = prgOrgDept;
        this.prgOrgSchl = prgOrgSchl;
        this.prgOrgfac = prgOrgfac;
        this.programGpa = programGpa;
        this.programStatus = programStatus;
        this.stdProgress = stdProgress;
    }
}
