package br.com.alura.apilanguages.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LanguageResponse {
    private String id;
    private String title;
    private String image;
    private Integer ranking;
}
