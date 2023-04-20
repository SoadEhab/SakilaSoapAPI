package gov.iti.jets.web.requests;

import gov.iti.jets.web.entities.Address;
import gov.iti.jets.web.models.AddressModel;
import gov.iti.jets.web.persistence.dao.AddressDao;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class AddressService {

    AddressDao addressDao = new AddressDao();
    ModelMapper modelMapper = new ModelMapper();

    public AddressService() {
    }

    public List<AddressModel> getAllAddresses(){
        return modelMapper.map(addressDao.getAll("Address.findAll"), new TypeToken<List<AddressModel>>(){}.getType());
    }

    public AddressModel getAddressById(int id){
        return modelMapper.map(addressDao.getById(Address.class,id), AddressModel.class);
    }

    public AddressModel addAddress(AddressModel addressModel){

        Address address = addressDao.add(modelMapper.map(addressModel, Address.class));
        AddressModel addedAddress = modelMapper.map(address, AddressModel.class);
        return addedAddress;
    }

    public boolean updateAddress(AddressModel addressModel){
        return addressDao.update(modelMapper.map(addressModel, Address.class));
    }

    public boolean deleteAddress(int id){
        return addressDao.deleteById(id, Address.class);
    }

}
