package org.codaga.tranquil;

import org.codaga.tranquil.model.Practitioner;

import java.sql.Date;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        String SQL = "INSERT INTO practitioner(firstname, lastname, gender,dateofbirth) VALUES(?,?,?,?)";
        Practitioner coolDoc = new Practitioner("Tim","Hallen",'M', Date.valueOf(LocalDate.now()), "Cognitive");
        coolDoc.save(SQL,coolDoc);
    }
}
