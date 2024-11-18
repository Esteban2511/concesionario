package co.edu.uniquindio.poo.viewController;

/**
 * Sample Skeleton for 'menuAdministrador.fxml' Controller Class
 */

 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 
 public class MenuAdministradorViewController {
 
     @FXML
     private App app;

     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="btnEmpleados"
     private Button btnEmpleados; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnReportes"
     private Button btnReportes; // Value injected by FXMLLoader
 
     @FXML
     void openGestionEmpleados() {
 
     }
 
     @FXML
     void openGestionReportes() {
 
     }

     @FXML
    /**
     * Método para establecer la aplicación principal para este controlador
     * @param app Aplicación principal a establecer
     */
    public void setApp(App app){
        this.app = app;
    }
 
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert btnEmpleados != null : "fx:id=\"btnEmpleados\" was not injected: check your FXML file 'menuAdministrador.fxml'.";
         assert btnReportes != null : "fx:id=\"btnReportes\" was not injected: check your FXML file 'menuAdministrador.fxml'.";
 
     }
 }
 
