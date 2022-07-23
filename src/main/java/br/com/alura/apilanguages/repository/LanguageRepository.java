package br.com.alura.apilanguages.repository;

import br.com.alura.apilanguages.model.Language;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface LanguageRepository  extends MongoRepository<Language, String> {
}
