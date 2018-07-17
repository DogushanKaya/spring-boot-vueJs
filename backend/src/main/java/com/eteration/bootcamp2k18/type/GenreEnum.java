package com.eteration.bootcamp2k18.type;

public enum GenreEnum {

    ROCK("rock"),POP("pop"),CLASSIC("classic"),FOLK("folk"),ELECKTRONIC("electronic");

    String description;

    GenreEnum(String description){
        this.description = description;
    }


    public String getDescription(){
        return this.description;
    }
}
