package passwordControl.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import passwordControl.MainApp;

public class PasswordController {
	
	private MainApp mainApp;
	
	@FXML
	private PasswordField passwordField;
	@FXML
	private Button okButton;
	@FXML
	private Button helpButton;
	
	
	public PasswordController() {		
	}
	
	@FXML
	public void initialize() {
		
	}
	
	@FXML
	private void handleOkButton() {
		String passwordAttempt = passwordField.getText();
		
		if (new String(passwordAttempt).equals("bugaboo")){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Correct!");
			alert.setHeaderText("Correct password!");
	        alert.setContentText("Press ok to continue.");
	        alert.showAndWait();
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Incorrect");
			alert.setHeaderText("Incorrect password!");
	        alert.setContentText("Please try again. Press ok to continue.");
	        alert.showAndWait();		
		}
		
	}
	
	@FXML
	private void handleHelpButton(){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Help");
		alert.setHeaderText("Need Help?");
        alert.setContentText("Help was clicked.");
        alert.showAndWait();
	}
	
	

	public void setMainApp(MainApp main) {
		this.mainApp = main;	
	}
}
