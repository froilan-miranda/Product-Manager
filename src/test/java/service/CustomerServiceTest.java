package service;

import models.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.CustomerService;

public class CustomerServiceTest {
    CustomerService customerService;

    @BeforeEach
    public void beforeEachTest(){
        customerService = new CustomerService();
    }
    @Test
    public void createTest(){

        String expectedName = "Orroro";
        String expectedUserName = "storm";
        String expectedPassword = "skull";
        String expectedEmail = "alwayskillingit@xmen.com";
        int expectedSize = 1;

        Customer customer = customerService.create(expectedName, expectedUserName, expectedPassword, expectedEmail);

        int actualId = customer.getId();
        String actualName = customer.getName();
        String actualUserName = customer.getUsername();
        String actualPassword = customer.getPassword();
        String actualEmail = customer.getEmail();
        int actualSize = customerService.size();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedUserName, actualUserName);
        Assertions.assertEquals(expectedPassword, actualPassword);
        Assertions.assertEquals(expectedEmail, actualEmail);
        Assertions.assertEquals(expectedSize, actualSize);

    }

    @Test
    public void readTest(){
        Customer newCustomer = customerService.create("Raven Darkholme", "Mystique", "xmen", "assassinslife@aol.com");
        int readId = newCustomer.getId();

        Customer actualCustomer = customerService.findBeer(readId);

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualCustomer.getId()).getClass().getName());
        Assertions.assertEquals("Raven Darkholme", actualCustomer.getName());
        Assertions.assertEquals("Mystique", actualCustomer.getUsername());
        Assertions.assertEquals("xmen", actualCustomer.getPassword());
        Assertions.assertEquals("assassinslife@aol.com", actualCustomer.getEmail());
        Assertions.assertEquals(1, customerService.size());
    }

    @Test
    public void readAllTest(){
        Customer newBeerA = customerService.create("Raven Darkholme", "Mystique", "xmen", "assassinslife@aol.com");
        Customer newBeerB = customerService.create("Richard Rider", "Nova", "1234", "RRider@NovaCorps.com");

        Customer[] actualArray = customerService.findAll();

        Assertions.assertEquals(actualArray.length, 2);
    }

    @Test
    public void deleteTrueTest(){
        Customer newBeerA = customerService.create("Raven Darkholme", "Mystique", "xmen", "assassinslife@aol.com");

        Assertions.assertTrue(customerService.delete(newBeerA.getId()));
    }

    @Test
    public void deleteFalseTest(){
        Customer newBeerA = customerService.create("Raven Darkholme", "Mystique", "xmen", "assassinslife@aol.com");

        Assertions.assertFalse(customerService.delete(Integer.MAX_VALUE));
    }

}
