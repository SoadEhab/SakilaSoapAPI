package gov.iti.jets.web.models;

import gov.iti.jets.web.entities.FilmCategory;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class CategoryModel {
    private Short categoryId;

    private String name;

    private Date lastUpdate;


    public Short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
