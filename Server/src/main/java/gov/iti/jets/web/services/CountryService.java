package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.Country;
import gov.iti.jets.web.models.CountryModel;
import gov.iti.jets.web.persistence.dao.CountryDao;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class CountryService {
    CountryDao countryDao = new CountryDao();
    ModelMapper modelMapper = new ModelMapper();

    public CountryService() {
    }

    public List<CountryModel> getAllCountries(){
        return modelMapper.map(countryDao.getAll("Country.findAll"), new TypeToken<List<CountryModel>>(){}.getType());
    }

    public CountryModel getCountryById(int id){
        return modelMapper.map(countryDao.getById(Country.class,id), CountryModel.class);
    }

    public CountryModel addCountry(CountryModel countryModel){

        Country country = countryDao.add(modelMapper.map(countryModel, Country.class));
        CountryModel addedCountry = modelMapper.map(country, CountryModel.class);
        return addedCountry;
    }

    public boolean updateCountry(CountryModel countryModel){
        return countryDao.update(modelMapper.map(countryModel, Country.class));
    }

    public boolean deleteCountry(int id){
        return countryDao.deleteById(id, Country.class);
    }

}
