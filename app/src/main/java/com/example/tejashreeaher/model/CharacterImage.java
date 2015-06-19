package com.example.tejashreeaher.model;

/**
 * Created by tejashree.aher on 16/06/15.
 */
public class CharacterImage {
    public String getCharacter() {
        return character;
    }

    public CharacterImage(String character, String image){
        this.character = character;
        this.image = image;
    }
    public void setCharacter(String character) {
        this.character = character;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String character;
    private String image;

}
