package org.codaga.tranquil.model;

import org.codaga.tranquil.utils.PostgresConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataObject {

    public void save(String SQL, Person person) {
        PostgresConnection postConn = new PostgresConnection();
        try (PreparedStatement pstmt = postConn.getConnection().prepareStatement(SQL)) {
            pstmt.setString(1, person.getFirstName());
            pstmt.setString(2, person.getLastName());
            pstmt.setString(3, String.valueOf(person.getGender()));
            pstmt.setDate(4, person.getDateOfBirth());
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
