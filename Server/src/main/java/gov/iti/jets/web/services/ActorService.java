package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.Actor;
import gov.iti.jets.web.entities.Film;
import gov.iti.jets.web.models.ActorModel;
import gov.iti.jets.web.models.FilmModel;
import gov.iti.jets.web.persistence.dao.ActorDao;
import gov.iti.jets.web.persistence.dao.SakilaContext;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class ActorService {
    SakilaContext sakilaContext = new SakilaContext(new ActorDao());
    ModelMapper modelMapper = new ModelMapper();

    public ActorService() {
    }

    public List<ActorModel> getAllActors(){
        sakilaContext.getAll("Actor.findAll");
        return modelMapper.map(sakilaContext.getAll("Actor.findAll"), new TypeToken<List<ActorModel>>(){}.getType());
    }

    public ActorModel getActorById(int id){
        return modelMapper.map(sakilaContext.getById(Actor.class,id), ActorModel.class);
    }

    public List<ActorModel> getActorByFirstName(String fName){
        return modelMapper.map(sakilaContext.getBy("Actor.findByFirstName","firstName",fName), new TypeToken<List<ActorModel>>(){}.getType());
    }

    public ActorModel addActor(ActorModel actorModel){

        Actor actor = sakilaContext.add(modelMapper.map(actorModel, Actor.class));
        ActorModel addedActor = modelMapper.map(actor, ActorModel.class);
        return addedActor;
    }

    public boolean updateActor(ActorModel actorModel){
        return sakilaContext.update(modelMapper.map(actorModel, Actor.class));
    }

    public boolean deleteActor(int id){
        return sakilaContext.deleteById(id, Actor.class);
    }

}
