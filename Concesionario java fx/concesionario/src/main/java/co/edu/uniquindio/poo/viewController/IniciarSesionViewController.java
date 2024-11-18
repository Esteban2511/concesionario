package co.edu.uniquindio.poo.viewController;

/**
 * Sample Skeleton for 'iniciarSecion.fxml' Controller Class
 */

 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
 
 public class IniciarSesionViewController {

    
 
     @FXML
     private App app;

     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="btnIniciarSesion"
     private Button btnIniciarSesion; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnRecuperarClave"
     private Button btnRecuperarClave; // Value injected by FXMLLoader
 
     @FXML // fx:id="txtCodigoUsuario"
     private TextField txtEmailUsuario; // Value injected by FXMLLoader
 
     @FXML // fx:id="lblClaveUsuario"
     private Label lblClaveUsuario; // Value injected by FXMLLoader
 
     @FXML // fx:id="lblCodigoUsuario"
     private Label lblCodigoUsuario; // Value injected by FXMLLoader
 
     @FXML // fx:id="txtClaveUsuario"
     private TextField txtClaveUsuario; // Value injected by FXMLLoader
 
     @FXML
     void accionIniciarSesion() {
        app.openMenuSesion();

     }
    
 
     @FXML
     void accionRecuperarClave() {
 
     }
 
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert btnIniciarSesion != null : "fx:id=\"btnIniciarSesion\" was not injected: check your FXML file 'iniciarSecion.fxml'.";
         assert btnRecuperarClave != null : "fx:id=\"btnRecuperarClave\" was not injected: check your FXML file 'iniciarSecion.fxml'.";
         assert txtEmailUsuario != null : "fx:id=\"txtCodigoUsuario\" was not injected: check your FXML file 'iniciarSecion.fxml'.";
         assert lblClaveUsuario != null : "fx:id=\"lblClaveUsuario\" was not injected: check your FXML file 'iniciarSecion.fxml'.";
         assert lblCodigoUsuario != null : "fx:id=\"lblCodigoUsuario\" was not injected: check your FXML file 'iniciarSecion.fxml'.";
         assert txtClaveUsuario != null : "fx:id=\"txtClaveUsuario\" was not injected: check your FXML file 'iniciarSecion.fxml'.";
 
     }

     public void setApp(App app) {
        this.app = app;
     }
 }
 