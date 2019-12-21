package org.codaga.tranquil;

import org.codaga.tranquil.model.Practitioner;

import java.sql.Date;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Practitioner coolDoc = new Practitioner("Davis","Ok",'M', Date.valueOf(LocalDate.now()));
        coolDoc.createSQL();

    }
}
