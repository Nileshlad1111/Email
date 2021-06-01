package com.bridgelabz.main;

import java.util.regex.Pattern;

public class Email {
    //email pattern
    String emailPattern = "^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

    public static void main(String[] args) {
        System.out.println("Welcome Email valid and invalid problem");
    }

    //email method
    public boolean isValidEmail(String Email) {
        return Pattern.matches(emailPattern,Email);
    }
}
