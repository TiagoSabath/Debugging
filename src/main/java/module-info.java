module com.example.debugging {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.debugging to javafx.fxml;
    exports com.example.debugging;
}