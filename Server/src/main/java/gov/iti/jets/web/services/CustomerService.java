package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.Customer;
import gov.iti.jets.web.entities.Film;
import gov.iti.jets.web.models.CustomerModel;
import gov.iti.jets.web.persistence.dao.CustomerDao;
import gov.iti.jets.web.persistence.dao.SakilaContext;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

@WebService
public class CustomerService {
    SakilaContext sakilaContext = new SakilaContext(new CustomerDao());
    ModelMapper modelMapper = new ModelMapper();

    public CustomerService() {
    }

    public List<CustomerModel> getAllCustomer(){
        sakilaContext.getAll("Customer.findAll");
        return modelMapper.map(sakilaContext.getAll("Customer.findAll"), new TypeToken<List<CustomerModel>>(){}.getType());
    }

    public CustomerModel getCustomerById(int id){
        return modelMapper.map(sakilaContext.getById(Customer.class,id), CustomerModel.class);
    }

    public List<CustomerModel> getCustomerByEmail(String email){
        return modelMapper.map(sakilaContext.getBy("Customer.findByEmail","email",email), new TypeToken<List<CustomerModel>>(){}.getType());
    }
    public CustomerModel addCustomer(CustomerModel customerModel){

        Customer customer = sakilaContext.add(modelMapper.map(customerModel, Customer.class));
        CustomerModel addedCustomer = modelMapper.map(customer, CustomerModel.class);
        return addedCustomer;
    }

    public boolean updateCustomer(CustomerModel customerModel){
        return sakilaContext.update(modelMapper.map(customerModel, Film.class));
    }

    public boolean deleteCustomer(int id){
        return sakilaContext.deleteById(id, Customer.class);
    }

}
