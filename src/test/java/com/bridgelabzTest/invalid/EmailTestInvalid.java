package com.bridgelabzTest.invalid;

import com.bridgelabz.Email;
import org.junit.Assert;
import org.junit.Test;

public class EmailTestInvalid {
    Email emailInValid = new Email();

    @Test
    public void givenEmailName_whenInvalid_thenReturn_One() {
        String email = "abc";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_Two() {
        String email = "abc@.com.my";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_Three() {
        String email = "abc123@gmail.a";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_Four() {
        String email = "abc123@.com";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_Five() {
        String email = "abc123@.com.com";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_sex() {
        String email = ".abc123@gmail.com";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_seven() {
        String email = "abc()*@gmail.com";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_Eight() {
        String email = "abc@%*.com";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_Nine() {
        String email = "abc..2002@gmail.com";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_Ten() {
        String email = "abc.@gmail.com";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_Eleven() {
        String email = "abc@abc@gmail.com";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_Twelve() {
        String email = "abc.@gmail.com.1a";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }

    @Test
    public void givenEmailName_whenInvalid_thenReturn_Thirteen() {
        String email = "abc.@gmail.com.aa.au";
        boolean emailID = emailInValid.isValidEmail(email);
        Assert.assertFalse(emailID);
    }
}
