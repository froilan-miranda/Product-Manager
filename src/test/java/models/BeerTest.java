package models;

import models.Beer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeerTest {

    Beer testBeer = null;

    @BeforeEach
    public void beforeAllTest(){
        testBeer = new Beer(1,"brown ale", "new castle",
                "new castle", 2, 4.50f);
    }

    @Test
    public void constructorTest(){

        int expectedId = 1;
        String expectedName = "brown ale";
        String expectedBrand = "new castle";
        String expectedLocation = "new castle";
        int expectedQuantity = 2;
        float expectedPrice = 4.50f;

        //Moved to @BeforeAll
        //models.Beer testBeer = new models.Beer(expectedId, expectedName, expectedBrand,
        //      expectedLocation, expectedQuantity, expectedPrice);

        int actualId = testBeer.getId();
        String actualName = testBeer.getName();
        String actualBrand = testBeer.getBrand();
        String actualLocation = testBeer.getLocation();
        int actualQuantity = testBeer.getQty();
        float actualPrice = testBeer.getPrice();

        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedLocation, actualLocation);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void setNameTest(){
        String expected = "philly ipa";
        testBeer.setName(expected);
        Assertions.assertEquals(expected, testBeer.getName());
    }

    @Test
    public void seBrandTest(){
        String expected = "Philly Brew Co.";
        testBeer.setBrand(expected);
        Assertions.assertEquals(expected, testBeer.getBrand());
    }

    @Test
    public void setLocationTest(){
        String expected = "Philly";
        testBeer.setLocation(expected);
        Assertions.assertEquals(expected, testBeer.getLocation());
    }

    @Test
    public void setQtyTest(){
        int expected = 10;
        testBeer.setQty(expected);
        Assertions.assertEquals(expected, testBeer.getQty());
    }

    @Test
    public void setPriceTest(){
        float expected = 5.75f;
        testBeer.setPrice(expected);
        Assertions.assertEquals(expected, testBeer.getPrice());
    }

}
