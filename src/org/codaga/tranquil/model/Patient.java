package org.codaga.tranquil.model;

import org.codaga.tranquil.model.Person;

public class Patient extends Person {
    private String sickness;

    public Patient(String firstName, String lastName, char gender, String dateOfBirth, String sickness) {
        super(firstName, lastName, gender, dateOfBirth);
        this.sickness = sickness;
    }
}
