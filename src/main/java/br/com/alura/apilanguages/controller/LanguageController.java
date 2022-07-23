package br.com.alura.apilanguages.controller;

import br.com.alura.apilanguages.model.Language;
import br.com.alura.apilanguages.repository.LanguageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {
    private final LanguageRepository repository;

    public LanguageController(LanguageRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/languages")
    public List<Language> getAll() {
        return repository.findAll();
    }

    @PostMapping("/languages")
    @ResponseStatus(HttpStatus.CREATED)
    public Language createLanguage(@RequestBody Language language) {
        return repository.save(language);
    }
}
