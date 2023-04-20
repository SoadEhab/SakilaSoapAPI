package gov.iti.jets.web.models;

import gov.iti.jets.web.entities.Address;
import gov.iti.jets.web.entities.Payment;
import gov.iti.jets.web.entities.Rental;
import gov.iti.jets.web.entities.Store;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class CustomerModel {
    private Short customerId;

    private String firstName;

    private String lastName;

    private String email;

    private boolean active;

    private Date createDate;

    private Date lastUpdate;

//    private Address addressId;
//
//    private Store storeId;

    public Short getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
