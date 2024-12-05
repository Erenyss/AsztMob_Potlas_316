module com.example {
    requires javafx.controls;
    requires transitive javafx.base;
    requires javafx.fxml;

    opens com.example to javafx.fxml;
    exports com.example;
}
