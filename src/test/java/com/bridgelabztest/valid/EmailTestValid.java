package com.bridgelabztest.valid;


import com.bridgelabz.Email;
import org.junit.Assert;
import org.junit.Test;

public class EmailTestValid {
    Email emailValid = new Email();

    @Test
    public void givenEmail_WhenValid_ThenReturnTrue_One() {
        String email = "abc@yahoo.com";
        boolean emailID = emailValid.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmail_WhenValid_ThenReturnTrue_Two() {
        String email = "abc-100@yahoo.com";
        boolean emailID = emailValid.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmail_WhenValid_ThenReturnTrue_Three() {
        String email = "abc.100@yahoo.com";
        boolean emailID = emailValid.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmail_WhenValid_ThenReturnTrue_Four() {
        String email = "abc111@abc.com";
        boolean emailID = emailValid.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmail_WhenValid_ThenReturnTrue_Five() {
        String email = "abc-100@abc.net";
        boolean emailID = emailValid.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmail_WhenValid_ThenReturnTrue_Six() {
        String email = "abc@1.com";
        boolean emailID = emailValid.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmail_WhenValid_ThenReturnTrue_Seven() {
        String email = "ladnilesh1994@gmail.com";
        boolean emailID = emailValid.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmail_WhenValid_ThenReturnTrue_Eight() {
        String email = "abc@gmail.com.com";
        boolean emailID = emailValid.isValidEmail(email);
        Assert.assertTrue(emailID);
    }

    @Test
    public void givenEmail_WhenValid_ThenReturnTrue_Nine() {
        String email = "abc+100@gmail.com";
        boolean emailID = emailValid.isValidEmail(email);
        Assert.assertTrue(emailID);
    }
}
