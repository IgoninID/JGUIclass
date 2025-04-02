package com.classig.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Контроллер для окна
 */
public class RectangleController {

    /**
     *  Текстовое поле для длины
     */
    @FXML
    public TextField Side1Text;

    /**
     * Текстовое поле для ширины
     */
    @FXML
    public TextField Side2Text;

    /**
     * Текстовое поле для периметра
     */
    @FXML
    public TextField PerimText;

    /**
     * Текстовое поле для площади
     */
    @FXML
    public TextField AreaText;

    /**
     * Создаем объект класса Rectangle
     */
    public Rectangles Rec = new Rectangles();

    /**
     * Обработчик события при нажатии на кнопку Calc
     */
    @FXML
    protected void onCalcButtonClick()
    {
        final String noerr = "-fx-background-color: white;"; // цвет поля по умолчанию без ошибок
        final String errnonum = "-fx-background-color: pink;"; // цвет поля для невозможности преобразования введенного значения
        final String errzeroorminus = "-fx-background-color: red;"; // цвет поля для отрицательного или нулевого введенного числа

        Side1Text.setStyle(noerr); // меняем цвет полей на белый
        Side2Text.setStyle(noerr);
        Double side1 = 1.0; // длина
        Double side2 = 1.0; // ширина
        try
        {
            side1 = Double.parseDouble(Side1Text.getText()); // пробуем преобразовать введенную пользователем длину
        }
        catch (NumberFormatException ex) // если невозможно преобразовать символ в поле в число double
        {
            Side1Text.setStyle(errnonum); // меняем цвет полей на розовый
            return;
        }
        try
        {
            side2 = Double.parseDouble(Side2Text.getText()); // пробуем преобразовать введенную пользователем ширину
        }
        catch (NumberFormatException ex)
        {
            Side2Text.setStyle(errnonum); // меняем цвет полей на розовый
            return;
        }
        try
        {
            Rec.setallsides(side1, side2); // пробуем создать прямоугольник с введенными сторонами
        }
        catch (RuntimeException ex) // если пользователь ввел отрицательное число или 0
        {
            Side1Text.setStyle(errzeroorminus); // меняем цвет полей на красный
            Side2Text.setStyle(errzeroorminus);
            return;
        }
        PerimText.setText(Double.toString(Rec.calcperim())); // вывод периметра
        AreaText.setText(Double.toString(Rec.calcarea())); // вывод площади
    }
}