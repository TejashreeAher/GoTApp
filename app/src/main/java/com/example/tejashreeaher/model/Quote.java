package com.example.tejashreeaher.model;

/**
 * Created by tejashree.aher on 16/06/15.
 */
public class Quote {
    private int id;
    private String character;
    private String quote;

    public Quote(String series, String character, String quote){
        this.series = series;
        this.character = character;
        this.quote = quote;
    }
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    private String series;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
