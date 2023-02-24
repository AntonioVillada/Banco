module co.edu.uniquindio.unibanco.aplicacion {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.unibanco.aplicacion to javafx.fxml;
    exports co.edu.uniquindio.unibanco.aplicacion;
    
    opens co.edu.uniquindio.unibanco.controllers to javafx.fxml;
    exports co.edu.uniquindio.unibanco.controllers;
    
    opens co.edu.uniquindio.unibanco.Exception to javafx.fxml;
    exports co.edu.uniquindio.unibanco.Exception;
    
    opens co.edu.uniquindio.unibanco.model to javafx.fxml;
    exports co.edu.uniquindio.unibanco.model;
    
    
    
}
