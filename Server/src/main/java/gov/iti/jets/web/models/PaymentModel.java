package gov.iti.jets.web.models;

import gov.iti.jets.web.entities.Customer;
import gov.iti.jets.web.entities.Rental;
import gov.iti.jets.web.entities.Staff;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentModel {
    private Short paymentId;

    private BigDecimal amount;

    private Date paymentDate;

    private Date lastUpdate;

    private Customer customerId;

    private Rental rentalId;

    private Staff staffId;
}
