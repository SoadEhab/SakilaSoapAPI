package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.Customer;
import gov.iti.jets.web.models.CustomerModel;
import gov.iti.jets.web.models.PaymentModel;
import gov.iti.jets.web.models.RentalModel;
import gov.iti.jets.web.persistence.dao.CustomerDao;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

@WebService
public class CustomerService {
    CustomerDao customerDao = new CustomerDao();
    ModelMapper modelMapper = new ModelMapper();

    public CustomerService() {
    }

    public List<CustomerModel> getAllCustomer() {
        return modelMapper.map(customerDao.getAll("Customer.findAll"), new TypeToken<List<CustomerModel>>() {
        }.getType());
    }

    public CustomerModel getCustomerById(int id) {
        return modelMapper.map(customerDao.getById(Customer.class, id), CustomerModel.class);
    }

    public List<CustomerModel> getCustomerByEmail(String email) {
        return modelMapper.map(customerDao.getBy("Customer.findByEmail", "email", email), new TypeToken<List<CustomerModel>>() {}.getType());
    }

    public CustomerModel addCustomer(CustomerModel customerModel) {

        Customer customer = customerDao.add(modelMapper.map(customerModel, Customer.class));
        CustomerModel addedCustomer = modelMapper.map(customer, CustomerModel.class);
        return addedCustomer;
    }

    public boolean updateCustomer(CustomerModel customerModel) {
        return customerDao.update(modelMapper.map(customerModel, Customer.class));
    }

    public boolean deleteCustomer(int id) {
        return customerDao.deleteById(id, Customer.class);
    }

    public List<RentalModel> getCustomerRentals(int customerId){
        return modelMapper.map(customerDao.getCustomerRentals(customerId), new TypeToken<List<RentalModel>>() {}.getType());
    }

    public List<PaymentModel> getCustomerPayments(int customerId){
        return modelMapper.map(customerDao.getCustomerPayments(customerId), new TypeToken<List<PaymentModel>>() {}.getType());
    }

}
