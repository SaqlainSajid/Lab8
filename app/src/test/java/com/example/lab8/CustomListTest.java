package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * *createamocklistformycitylist
     * *@return */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * *getthesizeofthelist
     * *increasethelistbyaddinganewcity
     * *checkifourcurrentsizematchestheinitialsize
     * plusone */
    @Test
    public void addCityTest(){
        list=MockCityList();
        int listSize=list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    void testHasCity(){
        list = MockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    void testDeleteCity(){
        list = MockCityList();
        //make sure only 1 city has been added (Edmonton)
        int listSize=list.getCount();

        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);

        assertEquals(1, list.getCount());

        list.deleteCity(city);
        assertEquals(listSize, list.getCount());
        assertFalse(list.hasCity(city));

    }

}
