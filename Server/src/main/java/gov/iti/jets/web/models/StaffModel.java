package gov.iti.jets.web.models;

import gov.iti.jets.web.entities.Address;
import gov.iti.jets.web.entities.Payment;
import gov.iti.jets.web.entities.Rental;
import gov.iti.jets.web.entities.Store;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class StaffModel {
    private Short staffId;
    private String firstName;
    private String lastName;
    private byte[] picture;
    private String email;
    private boolean active;
    private String username;
    private String password;
    private Date lastUpdate;
    private Address addressId;
    private Store storeId;
    private Store store;

}
