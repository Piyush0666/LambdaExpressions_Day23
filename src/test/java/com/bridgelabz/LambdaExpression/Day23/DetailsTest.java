package com.bridgelabz.LambdaExpression.Day23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetailsTest {

    @Test
    public void moodtest() {
        String expectedresult = "HAPPY";
        String actualresult = HappyOrSad.moodanalyze("HAPPY");
        assertEquals(expectedresult, actualresult);
    }


    @Test
    public void firstname() {
        String firstname = "Piyush";
        assertTrue(ValidateDetailsTest.name(firstname));
    }

    @Test
    public void lastname() {
        String lastname = "Verma";
        assertTrue(ValidateDetailsTest.name(lastname));
    }

    @Test
    public void mail() {
        String mail = "Piyushverma08@gmail.com";
        assertTrue(ValidateDetailsTest.mail(mail));
    }

    @Test
    public void phonenumber() {
        String phonenumber = "91 9910936991";
        assertTrue(ValidateDetailsTest.phonenumber(phonenumber));
    }

    @Test
    public void password() {
        String password = "Verma@1234";
        assertTrue(ValidateDetailsTest.password(password));
    }
}