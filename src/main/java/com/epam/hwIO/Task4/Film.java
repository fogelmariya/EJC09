package com.epam.hwIO.Task4;

import java.io.Serializable;

public class Film implements Serializable {
    String name;
    String actor;
    String role;

    public Film(String name, String actor, String role) {
        this.name = name;
        this.actor = actor;
        this.role = role;
    }
}