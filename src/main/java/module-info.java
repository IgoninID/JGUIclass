module com.classig.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.classig.demo to javafx.fxml;
    exports com.classig.demo;
}