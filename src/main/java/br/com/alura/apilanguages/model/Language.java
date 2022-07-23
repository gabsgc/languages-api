package br.com.alura.apilanguages.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "languages")
public class Language {

    @Id
    private String id;
    private String title;
    private String image;
    private Integer ranking;

    public Language() {
    }

    public Language(String id, String title, String image, Integer ranking) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getRanking() {
        return ranking;
    }
}
