package org.codaga.tranquil.utils;

import java.sql.Date;

abstract public class Validator {
    public static boolean validateDateOfBirth(Date dateOfBirth) {
        if (dateOfBirth != null)
            return true;
        else
            return false;
    }
}
