package com.classig.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс тестирующий методы класса Rectangle
 */
class RectanglesTest {

    /**
     * поле типа Rectangles, используется в последующих тестах
     */
    private Rectangles rec;

    /**
     * BeforeEach - метод используется перед каждым тестом
     * Метод создающий объект Rectangles
     */
    @BeforeEach
    void SetUp()
    {
        rec = new Rectangles();
    }

    /**
     * Test - тествый метод
     * Метод проверяющий коструктор без параметров
     */
    @Test
    void testDefConstr()
    {
        // assertEquals - проверяет равны ли значения (ожидаемое значение, проверяемый метод)
        assertEquals(1, rec.getSide1());
        assertEquals(1, rec.getSide2());
    }

    /**
     * Test - тествый метод
     * Метод проверяющий коструктор с параметрами
     */
    @Test
    void testParamConstr()
    {
        Rectangles recT = new Rectangles(5, 6);
        // assertEquals - проверяет равны ли значения (ожидаемое значение, проверяемый метод)
        assertEquals(5, recT.getSide1());
        assertEquals(6, recT.getSide2());
    }

    /**
     * Test - тествый метод
     * Метод проверяющий метод для задания длины и ширины прямоугольника
     */
    @Test
    void setallsides()
    {
        rec.setallsides(5, 8);
        // assertEquals - проверяет равны ли значения (ожидаемое значение, проверяемый метод)
        // assertThrows - проверяет выброшенное исключение (ожидаемый тип исключения, код выполняемый c вызовом исключения)
        assertEquals(5, rec.getSide1());
        assertEquals(8, rec.getSide2());
        rec.setallsides(10, 11);
        assertEquals(10, rec.getSide1());
        assertEquals(11, rec.getSide2());
        assertThrows(RuntimeException.class, () -> rec.setallsides(0, 0));
        assertThrows(RuntimeException.class, () -> rec.setallsides(-4,  -5));
    }

    /**
     * Test - тествый метод
     * Метод проверяющий get для получения длины прямоугольника
     */
    @Test
    void getSide1()
    {
        // assertEquals - проверяет равны ли значения (ожидаемое значение, проверяемый метод)
        assertEquals(1, rec.getSide1());
        rec.setallsides(5, 6);
        assertEquals(5, rec.getSide1());
    }

    /**
     * Test - тествый метод
     * Метод проверяющий get для получения ширины прямоугольника
     */
    @Test
    void getSide2()
    {
        // assertEquals - проверяет равны ли значения (ожидаемое значение, проверяемый метод)
        assertEquals(1, rec.getSide2());
        rec.setallsides(5, 6);
        assertEquals(6, rec.getSide2());
    }

    /**
     * Test - тествый метод
     * Метод проверяющий метод вычисления периметра прямоугольника
     */
    @Test
    void calcperim()
    {
        // assertEquals - проверяет равны ли значения (ожидаемое значение, проверяемый метод)
        assertEquals(4, rec.calcperim());
        rec.setallsides(5, 6);
        assertEquals(22, rec.calcperim());
    }

    /**
     * Test - тествый метод
     * Метод проверяющий метод вычисления площади прямоугольника
     */
    @Test
    void calcarea()
    {
        // assertEquals - проверяет равны ли значения (ожидаемое значение, проверяемый метод)
        assertEquals(1, rec.calcarea());
        rec.setallsides(5, 6);
        assertEquals(30, rec.calcarea());
    }

    /**
     * Test - тествый метод
     * Метод проверяющий метод toString
     */
    @Test
    void testToString()
    {
        String s = "Sides: 1.0 ; 1.0 ; 1.0 ; 1.0" + "\n" +
                "Perim: 4.0"  + "\n" +
                "Area: 1.0";
        // assertEquals - проверяет равны ли значения (ожидаемое значение, проверяемый метод)
        assertEquals(s, rec.toString());
        String s2 = "Sides: 5.0 ; 6.0 ; 5.0 ; 6.0" + "\n" +
                "Perim: 22.0"  + "\n" +
                "Area: 30.0";
        rec.setallsides(5, 6);
        assertEquals(s2, rec.toString());
    }
}