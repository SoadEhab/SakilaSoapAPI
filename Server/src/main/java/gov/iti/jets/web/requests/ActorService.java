package gov.iti.jets.web.requests;

import gov.iti.jets.web.entities.Actor;
import gov.iti.jets.web.models.ActorModel;
import gov.iti.jets.web.models.FilmModel;
import gov.iti.jets.web.persistence.dao.ActorDao;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class ActorService {
    ActorDao actorDao = new ActorDao();
    ModelMapper modelMapper = new ModelMapper();

    public ActorService() {
    }

    public List<ActorModel> getAllActors(){
        return modelMapper.map(actorDao.getAll("Actor.findAll"), new TypeToken<List<ActorModel>>(){}.getType());
    }

    public ActorModel getActorById(int id){
        return modelMapper.map(actorDao.getById(Actor.class,id), ActorModel.class);
    }

    public List<ActorModel> getActorByFirstName(String fName){
        return modelMapper.map(actorDao.getBy("Actor.findByFirstName","firstName",fName), new TypeToken<List<ActorModel>>(){}.getType());
    }

    public ActorModel addActor(ActorModel actorModel){

        Actor actor = actorDao.add(modelMapper.map(actorModel, Actor.class));
        ActorModel addedActor = modelMapper.map(actor, ActorModel.class);
        return addedActor;
    }

    public boolean updateActor(ActorModel actorModel){
        return actorDao.update(modelMapper.map(actorModel, Actor.class));
    }

    public boolean deleteActor(int id){
        return actorDao.deleteById(id, Actor.class);
    }

    public List<FilmModel> getActorFilms(int actorId){
        return modelMapper.map(actorDao.getActorFilms(actorId), new TypeToken<List<FilmModel>>(){}.getType());
    }
}
