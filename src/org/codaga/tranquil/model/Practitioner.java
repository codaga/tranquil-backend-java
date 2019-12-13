package org.codaga.tranquil.model;

import java.sql.Date;

public class Practitioner extends Person {
    private String speciality;
    private int id;

    public Practitioner(String firstName, String lastName, char gender, Date dateOfBirth, String speciality) {
        super(firstName, lastName, gender, dateOfBirth);
        this.speciality = speciality;
    }


}
