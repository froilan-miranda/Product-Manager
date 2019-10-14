package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer testCust;

    @BeforeEach
    public void beforeEachTest(){
        testCust = new Customer(10, "Nick Fury", "shield", "36912", "nfury@yahoo.com");
    }


    @Test
    public void constructorTest(){
        int expectedId = 10;
        String expectedName = "Nick Fury";
        String expectedUser = "shield";
        String expectedPass = "36912";
        String expectedEmail = "nfury@yahoo.com";

        Assertions.assertEquals(expectedId, testCust.getId());
        Assertions.assertEquals(expectedName, testCust.getName());
        Assertions.assertEquals(expectedUser, testCust.getUsername());
        Assertions.assertEquals(expectedPass, testCust.getPassword());
        Assertions.assertEquals(expectedEmail, testCust.getEmail());
    }

    @Test
    public void setNameTest(){
        String expected = "Black Widow";
        testCust.setName(expected);
        Assertions.assertEquals(expected, testCust.getName());
    }

    @Test
    public void setUserNameTest(){
        String expected = "spygirl1";
        testCust.setUsername(expected);
        Assertions.assertEquals(expected, testCust.getUsername());
    }

    @Test
    public void setPasswordTest(){
        String expected = "00000";
        testCust.setPassword(expected);
        Assertions.assertEquals(expected, testCust.getPassword());
    }

    @Test
    public void setEmailTest(){
        String expected = "blackwidow@gmail.com";
        testCust.setEmail(expected);
        Assertions.assertEquals(expected, testCust.getEmail());
    }

}
