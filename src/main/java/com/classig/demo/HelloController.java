package com.classig.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class HelloController {

    @FXML
    public TextField Side1Text;
    @FXML
    public TextField Side2Text;
    @FXML
    public TextField PerimText;
    @FXML
    public TextField AreaText;

    @FXML
    protected void onHelloButtonClick()
    {

            try
            {
                Side1Text.setStyle("-fx-background-color: white;");
                Side2Text.setStyle("-fx-background-color: white;");
                Rectangles Rec = new Rectangles(Double.parseDouble(Side1Text.getText()), Double.parseDouble(Side2Text.getText()));
                PerimText.setText(Double.toString(Rec.calcperim()));
                AreaText.setText(Double.toString(Rec.calcarea()));
            }
            catch (NumberFormatException ex)
            {
                Side1Text.setStyle("-fx-background-color: pink;");
                Side2Text.setStyle("-fx-background-color: pink;");
            }
    }
}