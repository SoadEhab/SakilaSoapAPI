package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.City;
import gov.iti.jets.web.models.CityModel;
import gov.iti.jets.web.persistence.dao.CityDao;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

@WebService
public class CityService {
    CityDao cityDao = new CityDao();
    ModelMapper modelMapper = new ModelMapper();

    public CityService() {
    }

    public List<CityModel> getAllCities(){
        return modelMapper.map(cityDao.getAll("City.findAll"), new TypeToken<List<CityModel>>(){}.getType());
    }

    public CityModel getCityById(int id){
        return modelMapper.map(cityDao.getById(City.class,id), CityModel.class);
    }

    public CityModel addCity(CityModel cityModel){

        City city = cityDao.add(modelMapper.map(cityModel, City.class));
        CityModel addedCity = modelMapper.map(city, CityModel.class);
        return addedCity;
    }

    public boolean updateCity(CityModel cityModel){
        return cityDao.update(modelMapper.map(cityModel, City.class));
    }

    public boolean deleteCity(int id){
        return cityDao.deleteById(id, City.class);
    }
}
