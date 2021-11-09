package com.mockpeoplesoft.rest.model.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StudentData {
    @JsonProperty("USI")
    private String usi;

    @JsonProperty("TITLE")
    private String title;

    @JsonProperty("GIVEN_NAMES")
    private String givenNames;

    @JsonProperty("FAMILY_NAME")
    private String familyName;

    @JsonProperty("EMAIL")
    private String email;

    @JsonProperty("HOME_PHONE")
    private String homePhone;

    @JsonProperty("MOBILE_PHONE")
    private String mobilePhone;

    @JsonProperty("RES_COUNTRY")
    private String resCountry;

    @JsonProperty("HOME_COUNTRY")
    private String homeCountry;

    @JsonProperty("LANGUAGES")
    private String languages;

    @JsonProperty("DOM_INTL")
    private String domIntl;

    public StudentData(String usi, String title, String givenNames, String familyName, String email, String homePhone, String mobilePhone, String resCountry, String homeCountry, String languages, String domIntl) {
        super();
        this.usi = usi;
        this.title = title;
        this.givenNames = givenNames;
        this.familyName = familyName;
        this.email = email;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.resCountry = resCountry;
        this.homeCountry = homeCountry;
        this.languages = languages;
        this.domIntl = domIntl;
    }
}
