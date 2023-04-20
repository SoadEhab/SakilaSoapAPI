package gov.iti.jets.web.requests;

import gov.iti.jets.web.entities.Store;
import gov.iti.jets.web.models.CustomerModel;
import gov.iti.jets.web.models.InventoryModel;
import gov.iti.jets.web.models.StaffModel;
import gov.iti.jets.web.models.StoreModel;
import gov.iti.jets.web.persistence.dao.StoreDao;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class StoreService {

    StoreDao storeDao = new StoreDao();
    ModelMapper modelMapper = new ModelMapper();

    public StoreService() {
    }

    public List<StoreModel> getAllStores() {
        return modelMapper.map(storeDao.getAll("Store.findAll"), new TypeToken<List<StoreModel>>() {
        }.getType());
    }

    public StoreModel getStoreById(int id) {
        return modelMapper.map(storeDao.getById(Store.class, id), StoreModel.class);
    }

    public StoreModel addStore(StoreModel storeModel) {

        Store store = storeDao.add(modelMapper.map(storeModel, Store.class));
        StoreModel addedStore = modelMapper.map(store, StoreModel.class);
        return addedStore;
    }

    public boolean updateStore(StoreModel storeModel) {
        return storeDao.update(modelMapper.map(storeModel, Store.class));
    }

    public boolean deleteStore(int id) {
        return storeDao.deleteById(id, Store.class);
    }

    public List<InventoryModel> getStoreInventories(int storeId) {
        return modelMapper.map(storeDao.getStoreInventories(storeId), new TypeToken<List<InventoryModel>>() {
        }.getType());
    }

    public List<CustomerModel> getStoreCustomers(int storeId) {
        return modelMapper.map(storeDao.getStoreCustomers(storeId), new TypeToken<List<CustomerModel>>() {
        }.getType());
    }

    public List<StaffModel> getStoreStaff(int storeId) {
        return modelMapper.map(storeDao.getStoreStaff(storeId), new TypeToken<List<StaffModel>>() {
        }.getType());
    }
}
