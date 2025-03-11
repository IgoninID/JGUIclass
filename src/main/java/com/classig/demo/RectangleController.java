package com.classig.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


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
    Rectangles Rec = new Rectangles();

    /**
     * Обработчик события при нажатии на кнопку Calc
     */
    @FXML
    protected void onCalcButtonClick()
    {
            try
            {
                Side1Text.setStyle("-fx-background-color: white;"); // меняе цвет полей на белый
                Side2Text.setStyle("-fx-background-color: white;");
                Rec.setallsides(Double.parseDouble(Side1Text.getText()), Double.parseDouble(Side2Text.getText()));
                PerimText.setText(Double.toString(Rec.calcperim()));
                AreaText.setText(Double.toString(Rec.calcarea()));
            }
            catch (NumberFormatException ex) // если невозможно преобразовать символ в поле в число double
            {
                Side1Text.setStyle("-fx-background-color: pink;"); // меняе цвет полей на розовый
                Side2Text.setStyle("-fx-background-color: pink;");
            }
            catch (RuntimeException ex) // если пользователь ввел отрицательное число или 0
            {
                Side1Text.setStyle("-fx-background-color: pink;"); // меняе цвет полей на розовый
                Side2Text.setStyle("-fx-background-color: pink;");
            }
    }
}