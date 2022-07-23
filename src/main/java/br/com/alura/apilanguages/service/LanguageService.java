package br.com.alura.apilanguages.service;

import br.com.alura.apilanguages.domain.dto.LanguageCreateRequest;
import br.com.alura.apilanguages.domain.dto.LanguageResponse;
import br.com.alura.apilanguages.domain.dto.LanguageUpdateRequest;
import br.com.alura.apilanguages.domain.entity.Language;
import br.com.alura.apilanguages.exception.LanguageNotFoundException;
import br.com.alura.apilanguages.repository.LanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LanguageService {
    private final LanguageRepository repository;

    public LanguageService(LanguageRepository repository) {
        this.repository = repository;
    }

    public List<LanguageResponse> listAll() {
        var result = repository.findAll();

        return result.stream().map(language -> new LanguageResponse(
                language.getId(),
                language.getTitle(),
                language.getImage(),
                language.getRanking()
        )).collect(Collectors.toList());
    }

    public LanguageResponse createLanguage(LanguageCreateRequest request) {
        var newLanguage = new Language();
        newLanguage.setTitle(request.getTitle());
        newLanguage.setImage(request.getImage());
        newLanguage.setRanking(request.getRanking());
        var saveLanguage = repository.save(newLanguage);

        return new LanguageResponse(
                saveLanguage.getId(),
                saveLanguage.getTitle(),
                saveLanguage.getImage(),
                saveLanguage.getRanking()
        );
    }

    public LanguageResponse updateLanguage(String id, LanguageUpdateRequest request) {
        var result = repository.findById(id);

        if(result.isEmpty()) {
            throw new LanguageNotFoundException();
        }

        var language = result.get();
        language.setImage(request.getImage());
        language.setRanking(request.getRanking());
        var saveLanguage = repository.save(language);

        return new LanguageResponse(
                saveLanguage.getId(),
                saveLanguage.getTitle(),
                saveLanguage.getImage(),
                saveLanguage.getRanking()
        );
    }

    public LanguageResponse delete(String id) {
        var result = repository.findById(id);

        if(result.isEmpty()) {
            throw new LanguageNotFoundException();
        }

        Language language = result.get();
        repository.delete(language);

        return new LanguageResponse(
                language.getId(),
                language.getTitle(),
                language.getImage(),
                language.getRanking()
        );
    }
}
