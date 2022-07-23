package br.com.alura.apilanguages.repository;

import br.com.alura.apilanguages.domain.entity.Language;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepository  extends MongoRepository<Language, String> {
}
