package gov.iti.jets.web.services;

import gov.iti.jets.web.entities.Language;
import gov.iti.jets.web.models.LanguageModel;
import gov.iti.jets.web.persistence.dao.LanguageDao;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.util.List;

public class LanguageService {

    LanguageDao languageDao = new LanguageDao();
    ModelMapper modelMapper = new ModelMapper();

    public LanguageService() {
    }

    public List<LanguageModel> getAllLanguages(){
        return modelMapper.map(languageDao.getAll("Language.findAll"), new TypeToken<List<LanguageModel>>(){}.getType());
    }

    public LanguageModel getLanguageById(int id){
        return modelMapper.map(languageDao.getById(Language.class,id), LanguageModel.class);
    }

    public LanguageModel addLanguage(LanguageModel languageModel){

        Language language = languageDao.add(modelMapper.map(languageModel, Language.class));
        LanguageModel addedLanguage = modelMapper.map(language, LanguageModel.class);
        return addedLanguage;
    }

    public boolean updateLanguage(LanguageModel languageModel){
        return languageDao.update(modelMapper.map(languageModel, Language.class));
    }

    public boolean deleteLanguage(int id){
        return languageDao.deleteById(id, Language.class);
    }
}
