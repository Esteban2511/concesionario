package co.edu.uniquindio.poo.viewController;

/**
 * Sample Skeleton for 'gestionCliente.fxml' Controller Class
 */

 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 import javafx.scene.control.TableColumn;
 import javafx.scene.control.TableView;
 import javafx.scene.control.TextField;
 
 public class GestionClienteViewController {

     @FXML
     private App app;
 
     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="columnEdad"
     private TableColumn<?, ?> columnEdad; // Value injected by FXMLLoader
 
     @FXML // fx:id="columnCodigo"
     private TableColumn<?, ?> columnCodigo; // Value injected by FXMLLoader
 
     @FXML // fx:id="txtDireccion"
     private TextField txtDireccion; // Value injected by FXMLLoader
 
     @FXML // fx:id="txtEdad"
     private TextField txtEdad; // Value injected by FXMLLoader
 
     @FXML // fx:id="columnNombre"
     private TableColumn<?, ?> columnNombre; // Value injected by FXMLLoader
 
     @FXML // fx:id="txtCodigo"
     private TextField txtCodigo; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnAgregar"
     private Button btnAgregar; // Value injected by FXMLLoader
 
     @FXML // fx:id="columnDireccion"
     private TableColumn<?, ?> columnDireccion; // Value injected by FXMLLoader
 
     @FXML // fx:id="columnTelefono"
     private TableColumn<?, ?> columnTelefono; // Value injected by FXMLLoader
 
     @FXML // fx:id="txtNombre"
     private TextField txtNombre; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnEliminar"
     private Button btnEliminar; // Value injected by FXMLLoader
 
     @FXML // fx:id="txtTelefono"
     private TextField txtTelefono; // Value injected by FXMLLoader
 
     @FXML // fx:id="tblGestionCliente"
     private TableView<?> tblGestionCliente; // Value injected by FXMLLoader
 
     @FXML
     void agregarCliente() {
 
     }
 
     @FXML
     void eliminarCliente() {
 
     }

     public void setApp(App app) {
        this.app = app;
     }
 
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert columnEdad != null : "fx:id=\"columnEdad\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert columnCodigo != null : "fx:id=\"columnCodigo\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert txtDireccion != null : "fx:id=\"txtDireccion\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert columnNombre != null : "fx:id=\"columnNombre\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert columnDireccion != null : "fx:id=\"columnDireccion\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert columnTelefono != null : "fx:id=\"columnTelefono\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert btnEliminar != null : "fx:id=\"btnEliminar\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert txtTelefono != null : "fx:id=\"txtTelefono\" was not injected: check your FXML file 'gestionCliente.fxml'.";
         assert tblGestionCliente != null : "fx:id=\"tblGestionCliente\" was not injected: check your FXML file 'gestionCliente.fxml'.";
 
     }
 }
 
