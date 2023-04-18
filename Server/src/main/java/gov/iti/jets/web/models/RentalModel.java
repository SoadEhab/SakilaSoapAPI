package gov.iti.jets.web.models;

import gov.iti.jets.web.entities.Customer;
import gov.iti.jets.web.entities.Inventory;
import gov.iti.jets.web.entities.Staff;
import jakarta.persistence.*;

import java.util.Date;

public class RentalModel {
    private Integer rentalId;

    private Date rentalDate;

    private Date returnDate;

    private Date lastUpdate;

    private Customer customerId;

    private Inventory inventoryId;

    private Staff staffId;
}
