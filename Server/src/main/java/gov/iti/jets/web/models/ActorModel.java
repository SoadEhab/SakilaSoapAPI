package gov.iti.jets.web.models;

import gov.iti.jets.web.entities.FilmActor;

import java.util.Date;
import java.util.List;

public class ActorModel {
    private Short actorId;

    private String firstName;

    private String lastName;

    private Date lastUpdate;
    private List<FilmActor> filmActorList;//one to many --> mapped by actor

    public Short getActorId() {
        return actorId;
    }

    public void setActorId(Short actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<FilmActor> getFilmActorList() {
        return filmActorList;
    }

    public void setFilmActorList(List<FilmActor> filmActorList) {
        this.filmActorList = filmActorList;
    }
}
