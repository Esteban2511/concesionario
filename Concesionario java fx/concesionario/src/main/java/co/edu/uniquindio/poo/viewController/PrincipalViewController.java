package co.edu.uniquindio.poo.viewController;

 
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class PrincipalViewController {

    @FXML
    private App app;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="panePrincipal"
    private AnchorPane panePrincipal; // Value injected by FXMLLoader

    @FXML // fx:id="btnIngresar"
    private Button btnIngresar; // Value injected by FXMLLoader

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
        assert panePrincipal != null : "fx:id=\"panePrincipal\" was not injected: check your FXML file 'principal.fxml'.";
        assert btnIngresar != null : "fx:id=\"btnIngresar\" was not injected: check your FXML file 'principal.fxml'.";
    }
}

 