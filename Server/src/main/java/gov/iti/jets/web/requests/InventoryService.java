package gov.iti.jets.web.requests;

import gov.iti.jets.web.entities.Inventory;
import gov.iti.jets.web.models.InventoryModel;
import gov.iti.jets.web.models.RentalModel;
import gov.iti.jets.web.persistence.dao.InventoryDao;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;


public class InventoryService {
    InventoryDao inventoryDao = new InventoryDao();
    ModelMapper modelMapper = new ModelMapper();

    public InventoryService() {
    }

    public List<InventoryModel> getAllInventories() {
        return modelMapper.map(inventoryDao.getAll("Inventory.findAll"), new TypeToken<List<InventoryModel>>() {
        }.getType());
    }

    public InventoryModel getInventoryById(int id) {
        return modelMapper.map(inventoryDao.getById(Inventory.class, id), InventoryModel.class);
    }

    public InventoryModel addInventory(InventoryModel inventoryModel) {

        Inventory inventory = inventoryDao.add(modelMapper.map(inventoryModel, Inventory.class));
        InventoryModel addedInventory = modelMapper.map(inventory, InventoryModel.class);
        return addedInventory;
    }

    public boolean updateInventory(InventoryModel inventoryModel) {
        return inventoryDao.update(modelMapper.map(inventoryModel, Inventory.class));
    }

    public boolean deleteInventory(int id) {
        return inventoryDao.deleteById(id, Inventory.class);
    }

    public List<RentalModel> getInventoryRentals(int inventoryId) {
        return modelMapper.map(inventoryDao.getInventoryRentals(inventoryId), new TypeToken<List<RentalModel>>() {}.getType());
    }
}
