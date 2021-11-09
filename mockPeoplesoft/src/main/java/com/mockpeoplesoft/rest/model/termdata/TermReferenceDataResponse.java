package com.mockpeoplesoft.rest.model.termdata;

import  lombok.Data;

@Data
public class TermReferenceDataResponse {
    private String TERM;
    private Terms[] TERMS;

}
