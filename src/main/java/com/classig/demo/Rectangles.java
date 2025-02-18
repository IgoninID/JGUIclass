package com.classig.demo;

/**
 * Класс прямоугольник
 * поля: длина, ширина
 * правило ввода: поле не может быть меньше 0
 * методы: set для полей по отдельности, get для полей, общий set для всех полей
 *         конструктор с параметрами и без
 *         вычисление периметра и площади
 *         переопределенный метод toString
 */
public class Rectangles
{
    /**
     * поле длина
     */
    private double Side1;

    /**
     * поле ширина
     */
    private double Side2;

    /**
     * метод set для длины
     */
    private void setSide1(double length)
    {
        Side1 = length;
    }

    /**
     * метод set для ширины
     */
    private void setSide2(double length)
    {
        Side2 = length;
    }

    /**
     * конструктор без параметров, прямоугольник размером 1 на 1
     */
    public Rectangles()
    {
        setallsides(1, 1);
    }

    /**
     * конструктор с параметрами
     * side1 - длина
     * side2 - ширина
     */
    public Rectangles(double side1, double side2)
    {
        try
        {
            setallsides(side1, side2);
        } catch (RuntimeException e) {

        }
    }

    /**
     * метод set для 2 полей: длина и ширина
     * length_s1 - длина
     * length_s2 - ширина
     * правило ввода: длина и ширина не могут быть меньше 0
     */
    public void setallsides(double length_s1, double length_s2)
    {
        if ((length_s1 > 0)&&(length_s2 > 0))
        {
            setSide1(length_s1);
            setSide2(length_s2);
        }
        else
        {
            throw new RuntimeException();
        }
    }

    /**
     * метод get для длины
     * возвращает значение длины прямоугольника
     */
    public double getSide1()
    {
        return Side1;
    }

    /**
     * метод get для ширины
     * возвращает значение ширины прямоугольника
     */
    public double getSide2()
    {
        return Side2;
    }

    /**
     * метод вычисления периметра
     * возвращает периметр прямоугольника
     */
    public double calcperim()
    {
        return 2 * (Side1 + Side2);
    }

    /**
     * метод вычисления площади
     * возвращает площадь прямоугольника
     */
    public double calcarea()
    {
        return Side1 * Side2;
    }

    /**
     * переопределенный метод toString
     * возвращает строку с информацией о прямоугольнике: длины сторон, периметр и площадь
     */
    @Override
    public String toString() {
        return "Sides: " + Side1 + " ; " +
                + Side2 + " ; " +
                + Side1 + " ; " +
                + Side2 + " ; " +
                "Perim: " + calcperim() + "\n" +
                "Area: " + calcarea();
    }
}
