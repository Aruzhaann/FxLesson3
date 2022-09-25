module com.example.lesson_3fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson_3fx to javafx.fxml;
    exports com.example.lesson_3fx;
}