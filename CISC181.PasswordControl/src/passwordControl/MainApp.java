package passwordControl;

import java.io.IOException;

import passwordControl.view.PasswordController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private AnchorPane passwordScreen;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Password Control");

		showPasswordScreen();
	}

	private void showPasswordScreen() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/PasswordScreen.fxml"));
			passwordScreen = (AnchorPane) loader.load();


			Scene passwordScene = new Scene(passwordScreen);

			primaryStage.setScene(passwordScene);
			PasswordController controller = loader.getController();
			controller.setMainApp(this);
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
