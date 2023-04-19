package gov.iti.jets.web.models;

import gov.iti.jets.web.entities.City;
import jakarta.persistence.*;

import java.util.Date;

public class AddressModel {
    private Short addressId;

    private String address;
    private String address2;

    private String district;

    private String postalCode;

    private String phone;

    private byte[] location;

    private Date lastUpdate;

    private City cityId;
}
