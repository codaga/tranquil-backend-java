package org.codaga.tranquil.model;

import org.codaga.tranquil.utils.PostgresConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataObject {
//    private String SQL = "INSERT INTO practitioner(firstname, lastname, gender,dateofbirth) VALUES(?,?,?,?)";

    public void save(String SQL, Person person) {
        PostgresConnection postConn = new PostgresConnection();
        try (PreparedStatement pstmt = postConn.getConnection().prepareStatement(SQL)) {
            pstmt.setInt(1, 10);
            pstmt.setString(2, person.getFirstName());
            pstmt.setString(3, person.getLastName());
            pstmt.setString(4, String.valueOf(person.getGender()));
            pstmt.setString(5, person.getDateOfBirth());
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
