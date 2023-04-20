package gov.iti.jets.web.models;

import gov.iti.jets.web.entities.Address;
import gov.iti.jets.web.entities.Country;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class CityModel {

    private Short cityId;

    private String city;

    private Date lastUpdate;

//    private Country countryId;

    public Short getCityId() {
        return cityId;
    }

    public void setCityId(Short cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


}
