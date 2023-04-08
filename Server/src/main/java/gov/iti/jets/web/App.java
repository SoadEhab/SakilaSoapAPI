package gov.iti.jets.web;

import gov.iti.jets.web.entities.Customer;
import gov.iti.jets.web.entities.Film;
import gov.iti.jets.web.entities.FilmCategory;
import gov.iti.jets.web.entities.Language;
import gov.iti.jets.web.persistence.dao.CustomerDao;
import gov.iti.jets.web.persistence.dao.SakilaContext;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SakilaContext sakilaContext = new SakilaContext(new CustomerDao());

//        List<Film> film = sakilaContext.getAll("Film.findAll");
//        System.out.println(film.get(20).getFilmCategoryList().size() + "--> " +film.get(2).getTitle());

        Film addfilm = new Film((short) 1,"ACADEMY", (short)2, BigDecimal.valueOf(0.9), BigDecimal.valueOf(2.99), new Date(22, 2,2));

        addfilm.setLanguageId((Language)sakilaContext.getAll("Language.findAll").get(1));
        System.out.println(addfilm.getLanguageId().getLanguageId()+"///id");

//        Film newFilm = sakilaContext.addFilm(addfilm);

        System.out.println(sakilaContext.update(addfilm,2,Film.class));

        System.out.println("added   " + addfilm.getRentalDuration()) ;


//        Customer customer = sakilaContext.getBy("Customer.findByFirstName", "firstName", "MARY");
//        System.out.println(customer.getCustomerId() + "--> " +customer.getLastName());

    }
}
