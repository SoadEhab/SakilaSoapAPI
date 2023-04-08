package gov.iti.jets.web.persistence.dao;

import java.util.List;

public class SakilaContext extends ISakila{
    public ISakila iSakila;
    public SakilaContext(ISakila sakila){
        this.iSakila = sakila;
    }

}
