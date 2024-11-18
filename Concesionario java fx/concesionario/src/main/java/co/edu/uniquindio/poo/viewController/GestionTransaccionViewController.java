package co.edu.uniquindio.poo.viewController;

/**
 * Sample Skeleton for 'gestionTransaccion.fxml' Controller Class
 */



 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 
 public class GestionTransaccionViewController {

     @FXML
     private App app;

     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="btnAlquiler"
     private Button btnAlquiler; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnCompra"
     private Button btnCompra; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnVenta"
     private Button btnVenta; // Value injected by FXMLLoader
 
     @FXML
     void openGestionAlquiler() {
 
     }
 
     @FXML
     void openGestionCompra() {
 
     }
 
     @FXML
     void openGestionVenta() {
 
     }

     /**
     * Método para establecer la aplicación principal para este controlador
     * @param app Aplicación principal a establecer
     */
    public void setApp(App app){
        this.app = app;
    }
 
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert btnAlquiler != null : "fx:id=\"btnAlquiler\" was not injected: check your FXML file 'gestionTransaccion.fxml'.";
         assert btnCompra != null : "fx:id=\"btnCompra\" was not injected: check your FXML file 'gestionTransaccion.fxml'.";
         assert btnVenta != null : "fx:id=\"btnVenta\" was not injected: check your FXML file 'gestionTransaccion.fxml'.";
 
     }
 }
 
