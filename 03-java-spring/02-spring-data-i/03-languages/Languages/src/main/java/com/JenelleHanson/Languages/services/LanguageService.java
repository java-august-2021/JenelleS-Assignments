package com.JenelleHanson.Languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.JenelleHanson.Languages.models.Language;
import com.JenelleHanson.Languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository langRepo;

	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}
	
	 public List<Language> allLanguages() {
	        return langRepo.findAll();
    }
	 
    // creates a lang
    public Language createLanguage(Language l) {
        return langRepo.save(l);
    }
    
    // retrieves a lang
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = langRepo.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    
    public Language updateLanguage(Language l) {
    	return langRepo.save(l);
    }
    
    public void deleteLanguage(Long id) {
    	langRepo.deleteById(id);
    }
}
