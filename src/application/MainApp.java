package application;

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private Stage secondStage;
    private AnchorPane rootLayout;
    private AnchorPane segundapantalla;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("My GitHub Profile");

        initRootLayout();

       // showPersonOverview();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            rootLayout = (AnchorPane) loader.load();
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            RootLayoutController controller = loader.getController();
            controller.setMainApp(this);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
/**
 * 
 * Launch the application
 */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void mostrarVentanaSecundaria() {
        try {
        	FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("SegundaPantalla.fxml"));
            segundapantalla = (AnchorPane) loader.load();
            // Show the scene containing the root layout.
            Scene scene = new Scene(segundapantalla);
            secondStage.setScene(scene);
            secondStage.show();
 
        } catch (Exception e) {
            //tratar la excepción
        }
    }
    
    
}