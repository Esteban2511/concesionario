package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.viewController.GestionClienteViewController;
import co.edu.uniquindio.poo.viewController.IniciarSesionViewController;
import co.edu.uniquindio.poo.viewController.MenuAdministradorViewController;
import co.edu.uniquindio.poo.viewController.MenuEmpleadoViewController;
import co.edu.uniquindio.poo.viewController.PrincipalViewController;
import co.edu.uniquindio.poo.viewController.MenuSesionViewController;


public class App extends Application {


    private Stage principalStage;
    public static Concesionario concesionario = new Concesionario("carros UQ");

    @Override
    public void start(@SuppressWarnings("exports") Stage principalStage) throws IOException {
        this.principalStage = principalStage;
        this.principalStage.setTitle("Concesionario");
        openViewPrincipal();

    }


/**
     * Metodo para inicializar la interfaz principal
     */
    private void openViewPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("principal.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            PrincipalViewController principalViewController = loader.getController();
            principalViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            principalStage.setScene(scene);
            principalStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }  




    public void openIniciarSesion(){

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("iniciarSesion.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            IniciarSesionViewController iniciarSesionViewController = loader.getController();
            iniciarSesionViewController.setApp(this);
        

            Scene scene = new Scene(rootLayout);
            principalStage.setScene(scene);
            principalStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }  

    public void openMenuSesion() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("menuSesion.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            MenuSesionViewController menuSesionViewController = loader.getController();
            menuSesionViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            principalStage.setScene(scene);
            principalStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public void openMenuEmpleado() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("menuEmpleado.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            MenuEmpleadoViewController menuEmpleadoViewController = loader.getController();
            menuEmpleadoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            principalStage.setScene(scene);
            principalStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public void openMenuAdministrador() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("menuEmpleado.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            MenuAdministradorViewController menuAdministradorViewController = loader.getController();
            menuAdministradorViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            principalStage.setScene(scene);
            principalStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    } 

    
    public void openGestionClientes() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("gestionCliente.fxml"));
            javafx.scene.layout.Pane rootLayout = (javafx.scene.layout.Pane) loader.load();
            GestionClienteViewController gestionClienteViewController = loader.getController();
            gestionClienteViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            principalStage.setScene(scene);
            principalStage.show();
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo FXML: " + e.getMessage());
            e.printStackTrace();
        }
    }
    


    public void openGestionTramsacciones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openGestionTramsacciones'");
    }


    public void openGestionVehiculos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openGestionVehiculos'");
    }

/**
     * Metodo principal que inicia la aplicacion
     * @param args Argumentos de la linea de comandos que recibe el programa
     */
    public static void main(String[] args) {
        launch();
    }

}