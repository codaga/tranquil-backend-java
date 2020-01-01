package org.codaga.tranquil.model;
import java.sql.Date;

public class Patient extends Person {

    public Patient(String firstName, String lastName, char gender, Date dateOfBirth) {
        super(firstName, lastName, gender, dateOfBirth);
    }

}
