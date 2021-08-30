package application;
	
import java.util.Locale;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Stage stage;
	private static Scene mainSceneLogin;
	private static Scene mainSceneRegister;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			stage = primaryStage;
			Parent sceneLogin = FXMLLoader.load(getClass().getResource("/gui/ViewLogin.fxml"));
			mainSceneLogin = new Scene(sceneLogin);
			
			Parent sceneRegister = FXMLLoader.load(getClass().getResource("/gui/ViewRegister.fxml"));
			mainSceneRegister = new Scene(sceneRegister);
			
			stage.setScene(mainSceneLogin);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void setSceneLogin() {
		stage.setScene(mainSceneLogin);
	}
	
	public static void setRegisterScene() {
		stage.setScene(mainSceneRegister);
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		launch(args);
	}
}
