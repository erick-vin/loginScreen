package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewLoginController implements Initializable {

	@FXML
	private Button buttonLogin;
	@FXML
	private Button buttonRegister;

	@FXML
	private TextField textFieldName;
	@FXML
	private TextField textFieldPassword;
	
	@FXML
	private Label labelName;
	@FXML
	private Label labelPassword;
	@FXML
	private static Label labelRegistrationConfirmed;


	@FXML
	private void onButtonRegister() {
		Main.setRegisterScene();
	}
	
	@FXML
	private void onButtonLogin() {
		
		
		labelName.setText("");
		labelPassword.setText("");
		
		String name = textFieldName.getText();
		String password = textFieldPassword.getText();
		
		if(name == "") {
			labelName.setText("Unfilled name");
			
		}
		if(password == "") {
			labelPassword.setText("Unfilled password");
			
		}
		
	}
		
	public static void setConfirmationMessage() {
		labelRegistrationConfirmed.setText("registration performed successfully");
		System.out.println("teste");
	}
	

	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

}
