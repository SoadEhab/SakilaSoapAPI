package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.Rental;
import gov.iti.jets.web.models.PaymentModel;
import gov.iti.jets.web.models.RentalModel;
import gov.iti.jets.web.persistence.dao.RentalDao;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

@WebService
public class RentalService {

    RentalDao rentalDao = new RentalDao();
    ModelMapper modelMapper = new ModelMapper();

    public RentalService() {
    }

    public List<RentalModel> getAllRentals() {
        return modelMapper.map(rentalDao.getAll("Rental.findAll"), new TypeToken<List<RentalModel>>() {
        }.getType());
    }

    public RentalModel getRentalById(int id) {
        return modelMapper.map(rentalDao.getById(Rental.class, id), RentalModel.class);
    }

    public RentalModel addRental(RentalModel rentalModel) {

        Rental rental = rentalDao.add(modelMapper.map(rentalModel, Rental.class));
        RentalModel addedRental = modelMapper.map(rental, RentalModel.class);
        return addedRental;
    }

    public boolean updateRental(RentalModel rentalModel) {
        return rentalDao.update(modelMapper.map(rentalModel, Rental.class));
    }

    public boolean deleteRental(int id) {
        return rentalDao.deleteById(id, Rental.class);
    }

    public List<PaymentModel> getRentalPayments(int rentalID) {
        return modelMapper.map(rentalDao.getRentalPayments(rentalID), new TypeToken<List<PaymentModel>>() {}.getType());
    }
}
