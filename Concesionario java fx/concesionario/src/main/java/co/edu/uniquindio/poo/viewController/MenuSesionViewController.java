package co.edu.uniquindio.poo.viewController;

/**
 * Sample Skeleton for 'menuSesion.fxml' Controller Class
 */

 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 
 public class MenuSesionViewController {
 

     @FXML
     private App app;

     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="btnEmpleado"
     private Button btnEmpleado; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnAdministrador"
     private Button btnAdministrador; // Value injected by FXMLLoader
 
     @FXML
     void openMenuEmpleado(ActionEvent event) {
        if (app != null) {
            app.openMenuEmpleado();
        }
     }
 
     @FXML
     void openMenuAdministrador(ActionEvent event) {
        if (app != null) {
            app.openMenuAdministrador();
        }
     }

     @FXML
    /**
     * Método para establecer la aplicación principal para este controlador
     * @param app Aplicación principal a establecer
     */
    public void setApp(App app){
        this.app = app;
    }

    @FXML
    /**
     * Método para manejar la acción de abrir el menú de inicio de sesión
     */
    void onOpenMenu(ActionEvent event) {
        if (app != null) {
            app.openIniciarSesion();
        }
    }
 
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert btnEmpleado != null : "fx:id=\"btnEmpleado\" was not injected: check your FXML file 'menuSesion.fxml'.";
         assert btnAdministrador != null : "fx:id=\"btnAdministrador\" was not injected: check your FXML file 'menuSesion.fxml'.";
 
     }


 }
 