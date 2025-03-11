package com.classig.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class RectangleApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RectangleApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 517, 236);
        stage.setTitle("Rectangle"); // имя главного окна
        stage.setScene(scene);
        stage.show();
    }

    /**
     * точка входа
     * public - позволяет вызывать метод из за пределов класса
     * static - позволяет вызывать метод без создания объекта
     * launch() - метод для запуска приложения
     * @param args позволяет вызывать процедуру с несколькими аргументами
     */
    public static void main(String[] args) {
        launch();
    }
}