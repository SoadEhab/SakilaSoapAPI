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

}
