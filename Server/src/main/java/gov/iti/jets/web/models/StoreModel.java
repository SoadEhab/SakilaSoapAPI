package gov.iti.jets.web.models;

import gov.iti.jets.web.entities.Address;
import gov.iti.jets.web.entities.Customer;
import gov.iti.jets.web.entities.Inventory;
import gov.iti.jets.web.entities.Staff;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class StoreModel {

    private Short storeId;
    private Date lastUpdate;
    private List<Staff> staffList;
    private Address addressId;
    private Staff managerStaffId;

    public Short getStoreId() {
        return storeId;
    }

    public void setStoreId(Short storeId) {
        this.storeId = storeId;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public Staff getManagerStaffId() {
        return managerStaffId;
    }

    public void setManagerStaffId(Staff managerStaffId) {
        this.managerStaffId = managerStaffId;
    }
}
