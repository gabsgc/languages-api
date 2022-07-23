package br.com.alura.apilanguages.controller;

import br.com.alura.apilanguages.domain.dto.LanguageCreateRequest;
import br.com.alura.apilanguages.domain.dto.LanguageResponse;
import br.com.alura.apilanguages.domain.dto.LanguageUpdateRequest;
import br.com.alura.apilanguages.service.LanguageService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {
    private final LanguageService service;

    public LanguageController(LanguageService service) {
        this.service = service;
    }

    @GetMapping("/languages")
    public ResponseEntity<List<LanguageResponse>>  getAll() {
        var result = service.listAll();
        return ResponseEntity.ok(result);
    }

    @PostMapping("/languages")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<LanguageResponse> create(@RequestBody @Valid LanguageCreateRequest request) {
        var result = service.createLanguage(request);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/languages/{id}")
    public ResponseEntity<LanguageResponse> update(
            @PathVariable String id,
            @RequestBody @Valid LanguageUpdateRequest updateRequest) {
        var language = service.updateLanguage(id, updateRequest);
        return ResponseEntity.ok(language);
    }

    @DeleteMapping("/languages/{id}")
    public ResponseEntity<LanguageResponse> delete(@PathVariable String id) {
        var language = service.delete(id);
        return ResponseEntity.ok(language);
    }
}
