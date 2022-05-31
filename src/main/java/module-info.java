module com.example.licenta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.licenta to javafx.fxml;
    exports com.example.licenta;
}