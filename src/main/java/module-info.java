module com.example.anneuebungsprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.anneuebungsprojekt to javafx.fxml;
    exports com.example.anneuebungsprojekt;
}