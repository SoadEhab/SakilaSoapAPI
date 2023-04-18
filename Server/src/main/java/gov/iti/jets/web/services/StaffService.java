package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.Staff;
import gov.iti.jets.web.models.PaymentModel;
import gov.iti.jets.web.models.RentalModel;
import gov.iti.jets.web.models.StaffModel;
import gov.iti.jets.web.persistence.dao.StaffDao;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

@WebService
public class StaffService {

    StaffDao staffDao = new StaffDao();
    ModelMapper modelMapper = new ModelMapper();

    public StaffService() {
    }

    public List<StaffModel> getAllStaffs() {
        return modelMapper.map(staffDao.getAll("Staff.findAll"), new TypeToken<List<StaffModel>>() {
        }.getType());
    }

    public StaffModel getStaffById(int id) {
        return modelMapper.map(staffDao.getById(Staff.class, id), StaffModel.class);
    }

    public StaffModel addStaff(StaffModel staffModel) {

        Staff staff = staffDao.add(modelMapper.map(staffModel, Staff.class));
        StaffModel addedStaff = modelMapper.map(staff, StaffModel.class);
        return addedStaff;
    }

    public boolean updateStaff(StaffModel staffModel) {
        return staffDao.update(modelMapper.map(staffModel, Staff.class));
    }

    public boolean deleteStaff(int id) {
        return staffDao.deleteById(id, Staff.class);
    }

    public List<PaymentModel> getStaffPayments(int staffId) {
        return modelMapper.map(staffDao.getStaffPayments(staffId), new TypeToken<List<PaymentModel>>() {}.getType());
    }

    public List<RentalModel> getStaffRentals(int rentalID) {
        return modelMapper.map(staffDao.getStaffRentals(rentalID), new TypeToken<List<RentalModel>>() {}.getType());
    }

}
