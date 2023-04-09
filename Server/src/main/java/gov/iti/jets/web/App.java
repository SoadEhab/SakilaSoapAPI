package gov.iti.jets.web;

import gov.iti.jets.web.entities.*;
import gov.iti.jets.web.models.FilmModel;
import gov.iti.jets.web.persistence.dao.CustomerDao;
import gov.iti.jets.web.persistence.dao.FilmDao;
import gov.iti.jets.web.persistence.dao.SakilaContext;
import gov.iti.jets.web.services.FilmServices;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FilmServices filmServices = new FilmServices();
        SakilaContext sakilaContext = new SakilaContext(new CustomerDao());

//        List<FilmModel> film = filmServices.getAllFilms();
//        System.out.println(film.get(20).getFilmCategoryList().size() + "--> " +film.get(2).getTitle());

//
//        Film addFilm = new Film((short) 1,"ACADEMY", (short)10, BigDecimal.valueOf(0.9), BigDecimal.valueOf(2.99), new Date());
//        addFilm.setLanguageId((Language)sakilaContext.getAll("Language.findAll").get(1));
//
//        ModelMapper modelMapper = new ModelMapper();
//
//        System.out.println(addFilm.getLanguageId().getLanguageId()+"///id");
//
//        FilmModel filmModel = modelMapper.map(addFilm, FilmModel.class);
//        Film orderDTO = modelMapper.map(filmModel, Film.class);
////        Film newFilm = sakilaContext.add(addFilm);
//
//        System.out.println(filmServices.updateFilm(filmModel));
//
////      System.out.println("added   " + filmModel.getRentalDuration()) ;

//        System.out.println(filmServices.getFilmById(2).getDescription()+ "--> " +filmServices.getFilmById(2).getRating());

//
//        Customer customer = sakilaContext.getBy("Customer.findByFirstName", "firstName", "MARY");
//        System.out.println(customer.getCustomerId() + "--> " +customer.getLastName());

    }
}
