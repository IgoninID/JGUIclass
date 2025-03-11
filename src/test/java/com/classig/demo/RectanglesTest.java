package com.classig.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanglesTest {

    private Rectangles rec;

    @BeforeEach
    void SetUp()
    {
        rec = new Rectangles();
    }

    @Test
    void testDefConstr()
    {
        assertEquals(1, rec.getSide1());
        assertEquals(1, rec.getSide2());
    }

    @Test
    void testParamConstr()
    {
        Rectangles recT = new Rectangles(5, 6);
        assertEquals(5, recT.getSide1());
        assertEquals(6, recT.getSide2());
    }

    @Test
    void setallsides()
    {
        rec.setallsides(5, 8);
        assertEquals(5, rec.getSide1());
        assertThrows(RuntimeException.class, () -> rec.setallsides(1, 1));
        assertEquals(8, rec.getSide2());
        assertThrows(RuntimeException.class, () -> rec.setallsides(1, 1));
    }

    @Test
    void getSide1()
    {
        assertEquals(1, rec.getSide1());
        rec.setallsides(5, 6);
        assertEquals(5, rec.getSide1());
    }

    @Test
    void getSide2()
    {
        assertEquals(1, rec.getSide2());
        rec.setallsides(5, 6);
        assertEquals(6, rec.getSide2());
    }

    @Test
    void calcperim()
    {
        assertEquals(4, rec.calcperim());
        rec.setallsides(5, 6);
        assertEquals(22, rec.calcperim());
    }

    @Test
    void calcarea()
    {
        assertEquals(1, rec.calcarea());
        rec.setallsides(5, 6);
        assertEquals(30, rec.calcarea());
    }

    @Test
    void testToString()
    {
        String s = "Sides: 1.0 ; 1.0 ; 1.0 ; 1.0" + "\n" +
                "Perim: 4.0"  + "\n" +
                "Area: 1.0";
        assertEquals(s, rec.toString());
        String s2 = "Sides: 5.0 ; 6.0 ; 5.0 ; 6.0" + "\n" +
                "Perim: 22.0"  + "\n" +
                "Area: 30.0";
        rec.setallsides(5, 6);
        assertEquals(s2, rec.toString());
    }
}