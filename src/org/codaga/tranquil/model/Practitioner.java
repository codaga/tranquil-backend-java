package org.codaga.tranquil.model;

import org.codaga.tranquil.utils.Validator;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Practitioner extends Person {
    private int id;
    private PreparedStatement preparedStatement;

    public Practitioner() {

    }

    public Practitioner(String firstName, String lastName, char gender, Date dateOfBirth) {
        super(firstName, lastName, gender, dateOfBirth);
    }

    public boolean validate(Date dateOfBirth) {
        return Validator.validateDateOfBirth(dateOfBirth);
    }

    public void createSQL() {
        String SQL = "INSERT INTO practitioner(firstname, lastname, gender,dateofbirth) VALUES(?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, getFirstName());
            preparedStatement.setString(2, getLastName());
            preparedStatement.setString(3, String.valueOf(getGender()));
            preparedStatement.setDate(4, getDateOfBirth());
            save(preparedStatement);
    } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
