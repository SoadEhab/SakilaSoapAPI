package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.Film;
import gov.iti.jets.web.models.ActorModel;
import gov.iti.jets.web.models.CategoryModel;
import gov.iti.jets.web.models.FilmModel;
import gov.iti.jets.web.models.InventoryModel;
import gov.iti.jets.web.persistence.dao.FilmDao;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

@WebService
public class FilmService {
    FilmDao filmDao = new FilmDao();
    ModelMapper modelMapper = new ModelMapper();

    public FilmService() {
    }

    public List<FilmModel> getAllFilms(){
        return modelMapper.map(filmDao.getAll("Film.findAll"), new TypeToken<List<FilmModel>>(){}.getType());
    }

    public FilmModel getFilmById(int id){
        return modelMapper.map(filmDao.getById(Film.class,id), FilmModel.class);
    }

    public List<FilmModel> getFilmByTitle(int id){
        return modelMapper.map(filmDao.getBy("Film.findByTitle","title",id), new TypeToken<List<FilmModel>>(){}.getType());
    }

    public FilmModel addFilm(FilmModel filmModel){

        Film film = filmDao.add(modelMapper.map(filmModel, Film.class));
        FilmModel addedFilm = modelMapper.map(film, FilmModel.class);
        return addedFilm;
    }

    public boolean updateFilm(FilmModel filmModel){
        return filmDao.update(modelMapper.map(filmModel, Film.class));
    }

    public boolean deleteFilm(int id){
        return filmDao.deleteById(id, Film.class);
    }


    public List<FilmModel> getFilmsByLanguage(int langId) {
        return modelMapper.map(filmDao.getFilmsByLanguage(langId), new TypeToken<List<FilmModel>>(){}.getType());
    }

    public List<FilmModel> getFilmsByOriginalLanguage(int langId) {
        return modelMapper.map(filmDao.getFilmsByOriginalLanguage(langId), new TypeToken<List<FilmModel>>(){}.getType());
    }

    public List<FilmModel> getFilmsByActorName(String name) {
        return modelMapper.map(filmDao.getFilmsByActorName(name), new TypeToken<List<FilmModel>>(){}.getType());
    }

    public List<FilmModel> getFilmsByCategory(int categoryId) {
        return modelMapper.map(filmDao.getFilmsByCategory(categoryId), new TypeToken<List<FilmModel>>(){}.getType());
    }

    public List<CategoryModel> getFilmCategories(int filmId) {
        return modelMapper.map(filmDao.getFilmCategories(filmId), new TypeToken<List<CategoryModel>>(){}.getType());
    }

    public List<ActorModel> getFilmActors(int filmId) {
        return modelMapper.map(filmDao.getFilmActors(filmId), new TypeToken<List<ActorModel>>(){}.getType());
    }

    public List<InventoryModel> getFilmInventories(int filmId) {
        return modelMapper.map(filmDao.getFilmInventories(filmId), new TypeToken<List<InventoryModel>>(){}.getType());
    }
}
