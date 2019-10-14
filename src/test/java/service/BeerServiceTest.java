package service;

import models.Beer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import services.BeerService;
import org.junit.jupiter.api.Test;


public class BeerServiceTest {

    BeerService beerService;

    @BeforeEach
    public void beforeEachTest(){
        beerService = new BeerService();
    }
    @Test
    public void createTest(){

        String expectedName = "brown ale";
        String expectedBrand = "new castle";
        String expectedLocation = "new castle";
        int expectedQuantity = 2;
        float expectedPrice = 4.50f;
        int expectedSize = 1;

        Beer testBeer = beerService.create(expectedName, expectedBrand, expectedLocation, expectedQuantity, expectedPrice);

        int actualId = testBeer.getId();
        String actualName = testBeer.getName();
        String actualBrand = testBeer.getBrand();
        String actualLocation = testBeer.getLocation();
        int actualQuantity = testBeer.getQty();
        float actualPrice = testBeer.getPrice();
        int actualSize = beerService.size();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedLocation, actualLocation);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedSize, actualSize);

    }

    @Test
    public void readTest(){
        Beer newBeer = beerService.create("Harp", "Guiness", "Dublin, Ireland", 20, 10.00f);
        int readId = newBeer.getId();

        Beer actualBeer = beerService.findBeer(readId);

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualBeer.getId()).getClass().getName());
        Assertions.assertEquals("Harp", actualBeer.getName());
        Assertions.assertEquals("Guiness", actualBeer.getBrand());
        Assertions.assertEquals("Dublin, Ireland", actualBeer.getLocation());
        Assertions.assertEquals(20, actualBeer.getQty());
        Assertions.assertEquals(10.00f, actualBeer.getPrice());
        Assertions.assertEquals(1, beerService.size());

    }

    @Test
    public void readAllTest(){
        Beer newBeerA = beerService.create("Harp", "Guiness", "Dublin, Ireland", 20, 10.00f);
        Beer newBeerB = beerService.create("yuengling", "Lager", "PA, USA", 20, 7.00f);

        Beer[] actualArray = beerService.findAll();

        Assertions.assertEquals(actualArray.length, 2);

    }

    @Test
    public void deleteTrueTest(){
        Beer newBeerA = beerService.create("Harp", "Guiness", "Dublin, Ireland", 20, 10.00f);

        Assertions.assertTrue(beerService.delete(newBeerA.getId()));
    }

    @Test
    public void deleteFalseTest(){
        Beer newBeerA = beerService.create("Harp", "Guiness", "Dublin, Ireland", 20, 10.00f);

        Assertions.assertFalse(beerService.delete(Integer.MAX_VALUE));
    }
}
