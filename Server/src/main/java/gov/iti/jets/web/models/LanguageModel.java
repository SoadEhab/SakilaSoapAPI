package gov.iti.jets.web.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

public class LanguageModel {
    private Short languageId;
    private String name;
    private Date lastUpdate;
}
