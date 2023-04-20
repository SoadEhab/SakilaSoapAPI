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
//    private Address addressId;
//    private Staff managerStaffId;

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

}
