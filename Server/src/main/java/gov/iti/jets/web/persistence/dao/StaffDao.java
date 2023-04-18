package gov.iti.jets.web.persistence.dao;

import gov.iti.jets.web.entities.*;

import java.util.List;

public class StaffDao extends ISakila {

    public List<Rental> getStaffRentals(int staffId) {
        Staff staff = getById(Staff.class, staffId);
        return staff.getRentalList().stream().toList();
    }

    public List<Payment> getStaffPayments(int staffId) {
        Staff staff = getById(Staff.class, staffId);
        return staff.getPaymentList().stream().toList();
    }

}
