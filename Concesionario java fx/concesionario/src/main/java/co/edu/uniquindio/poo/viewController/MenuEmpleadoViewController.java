package co.edu.uniquindio.poo.viewController;
    

/**
 * Sample Skeleton for 'menuEmpleado.fxml' Controller Class
 */

 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 
 public class MenuEmpleadoViewController {
 
     @FXML
      private App app;

     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="btnVehiculos"
     private Button btnVehiculos; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnTransacciones"
     private Button btnTransacciones; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnClientes"
     private Button btnClientes; // Value injected by FXMLLoader
 
     @FXML
     void openGestionClientes() {
        if (app != null) {
            app.openGestionClientes();
        }
     }
 
     @FXML
     void openGestionTransacciones() {
        if (app != null) {
            app.openGestionTramsacciones();
        }
     }
 
     @FXML
     void openGestionVehiculos() {
        if (app != null) {
            app.openGestionVehiculos();
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
         assert btnVehiculos != null : "fx:id=\"btnVehiculos\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
         assert btnTransacciones != null : "fx:id=\"btnTransacciones\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
         assert btnClientes != null : "fx:id=\"btnClientes\" was not injected: check your FXML file 'menuEmpleado.fxml'.";
 
     }
 }
 