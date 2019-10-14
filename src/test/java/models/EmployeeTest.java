package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    Employee testEmp;

    @BeforeEach
    public void beforeEachTest(){
        testEmp = new Employee(4, "Bruce Banner", "hulk", "12345");
    }


    @Test
    public void constructorTest(){
        int expectedId = 4;
        String expectedName = "Bruce Banner";
        String expectedUser = "hulk";
        String expectedPass = "12345";

        Assertions.assertEquals(expectedId, testEmp.getId());
        Assertions.assertEquals(expectedName, testEmp.getName());
        Assertions.assertEquals(expectedUser, testEmp.getUsername());
        Assertions.assertEquals(expectedPass, testEmp.getPassword());
    }

    @Test
    public void setNameTest(){
        String expected = "BB Banner";
        testEmp.setName(expected);
        Assertions.assertEquals(expected, testEmp.getName());
    }

    @Test
    public void setUserNameTest(){
        String expected = "grey hulk";
        testEmp.setUsername(expected);
        Assertions.assertEquals(expected, testEmp.getUsername());
    }

    @Test
    public void setPasswordTest(){
        String expected = "54321";
        testEmp.setPassword(expected);
        Assertions.assertEquals(expected, testEmp.getPassword());
    }
}
