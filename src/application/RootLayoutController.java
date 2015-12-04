package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * 
 * @author Santos Garcia
 *
 */
public class RootLayoutController {
	
	private MainApp primaryStage;
	private MainApp secondStage;
	private MainApp mainApp;

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	@FXML
    private void nuevaVentana(ActionEvent event) {
		secondStage.mostrarVentanaSecundaria();
    }

	@FXML
	private void handleExit() {
		System.exit(0);
	}

}
