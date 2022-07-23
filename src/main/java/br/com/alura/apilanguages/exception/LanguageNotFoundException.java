package br.com.alura.apilanguages.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class LanguageNotFoundException extends RuntimeException {
    public LanguageNotFoundException() {
        super("Language not found.");
    }
}
