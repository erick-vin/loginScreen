package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.dao.DaoFactory;
import model.dao.EmployeeDao;
import model.entities.Employee;

public class ViewRegisterController implements Initializable{
	
	EmployeeDao employeeDao = DaoFactory.createEmployeeDao();	
	
	@FXML
	private Button buttonBackLogin;
	
	@FXML
	private TextField textFieldName;
	@FXML
	private TextField textFieldPassword;
	@FXML
	private TextField textFieldEmail;
	@FXML
	private TextField textFieldNameMother;
	@FXML
	private TextField textFieldNameFather;
	
	@FXML
	private Label labelName;
	@FXML
	private Label labelPassword;
	@FXML
	private Label labelEmail;
	@FXML
	private Label labelNameMother;
	@FXML
	private Label labelNameFather;
	
	@FXML
	private Button buttonRegister;
	
	public void onButtonBackLoginAction() {
		Main.setSceneLogin();
	}
	
	public void onButtonRegisterAction() {
		
		boolean checkoutForRegister = true;
		
		labelName.setText("");
		labelPassword.setText("");
		labelEmail.setText("");
		labelNameMother.setText("");
		labelNameFather.setText("");
		
		String name = textFieldName.getText();
		String password = textFieldPassword.getText();
		String email = textFieldEmail.getText();
		String nameMother = textFieldNameMother.getText();
		String nameFather = textFieldNameFather.getText();
		
		if(name == "") {
			labelName.setText("Unfilled name");
			checkoutForRegister = false;
		}
		if(password == "") {
			labelPassword.setText("Unfilled password");
			checkoutForRegister = false;
		}
		if(email == "") {
			labelEmail.setText("Unfilled email");
			checkoutForRegister = false;
		}
		if(nameMother == "") {
			labelNameMother.setText("Unfilled Name Mother");
			checkoutForRegister = false;
		}
		if(nameFather == "") {
			labelNameFather.setText("Unfilled Name Father");
			checkoutForRegister = false;
		}
		
		if (checkoutForRegister == true) {
			Employee newEmployee = new Employee(null, name, password, email, nameMother, nameFather);
			employeeDao.insert(newEmployee);
			Main.setSceneLogin();
			ViewLoginController.setConfirmationMessage();
		}
	}
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {	
	}

}
