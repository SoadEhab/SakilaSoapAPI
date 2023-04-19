package gov.iti.jets.web.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

public class CountryModel {
    private Short countryId;
    private String country;
    private Date lastUpdate;
}
