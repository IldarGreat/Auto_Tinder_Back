package ru.ssau.autotinderback.model.entitie;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Role {
    USUAL("USUAL"),
    PLUS("PLUS"),
    GOLD("GOLD"),
    PLATINUM("PLATINUM"),
    ADMIN("ADMIN");
    private String value;
     Role(String value){this.value=value;}
}
