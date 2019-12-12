package org.codaga.tranquil;

import org.codaga.tranquil.model.Practitioner;

public class Main {

    public static void main(String[] args) {
        String SQL = "INSERT INTO practitioner(id, firstname, lastname, gender,dateofbirth) VALUES(?,?,?,?,?)";
        Practitioner coolDoc = new Practitioner("Tim","Hallen",'M',"05012001","Cognitive");
        coolDoc.save(SQL,coolDoc);
    }
}
