package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.Film;
import gov.iti.jets.web.models.FilmModel;
import gov.iti.jets.web.persistence.dao.FilmDao;
import gov.iti.jets.web.persistence.dao.SakilaContext;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

@WebService
public class FilmServices {
    SakilaContext sakilaContext = new SakilaContext(new FilmDao());
    ModelMapper modelMapper = new ModelMapper();

    public FilmServices() {
    }

    public List<FilmModel> getAllFilms(){
        sakilaContext.getAll("Film.findAll");
        return modelMapper.map(sakilaContext.getAll("Film.findAll"), new TypeToken<List<FilmModel>>(){}.getType());
    }

    public FilmModel getFilmById(int id){
        return modelMapper.map(sakilaContext.getBy("Film.findByFilmId","filmId",id), FilmModel.class);
    }

    public FilmModel addFilm(FilmModel filmModel){

        Film film = sakilaContext.add(modelMapper.map(filmModel, Film.class));
        FilmModel addedFilm = modelMapper.map(film, FilmModel.class);
        return addedFilm;
    }

    public boolean updateFilm(FilmModel filmModel){
        return sakilaContext.update(modelMapper.map(filmModel, Film.class));
    }

}
