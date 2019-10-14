package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    Sneaker testSneaker;

    @BeforeEach
    public void beforeEachTest(){
        testSneaker = new Sneaker(6, "Stan Smith", "Adidas", "Tennis", 10, 80.00f);
    }

    @Test
    public void constructorTest(){
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedQty,expectedPrice);

        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }

    @Test
    public void setNameTest(){
        String expected = "OZWEEGO";
        testSneaker.setName(expected);
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setBrandTest(){
        String expected = "Nike";
        testSneaker.setBrand(expected);
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setSportTest(){
        String expected = "Nike";
        testSneaker.setSport(expected);
        Assertions.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setQtyTest(){
        int expected = 100;
        testSneaker.setQty(expected);
        Assertions.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest(){
        float expected = 100;
        testSneaker.setPrice(expected);
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }

}
