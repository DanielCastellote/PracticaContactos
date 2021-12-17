module com.example.practicacontactos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicacontactos to javafx.fxml;
    exports com.example.practicacontactos;
}