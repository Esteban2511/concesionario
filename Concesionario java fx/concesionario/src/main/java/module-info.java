module co.edu.uniquindio.poo {

    requires java.base; // Este está implícito, pero es bueno mencionarlo
    requires java.mail; // Asegúrate de añadir esta línea
    requires javafx.controls;
    requires javafx.fxml;
        
    // Exporta tus paquetes según sea necesario
     exports co.edu.uniquindio.poo.model;
     exports co.edu.uniquindio.poo.viewController;
    
    // Si usas reflection, asegúrate de abrir los paquetes relevantes
    opens co.edu.uniquindio.poo.viewController to javafx.fxml;

    opens co.edu.uniquindio.poo to javafx.fxml;
    exports co.edu.uniquindio.poo;
}
