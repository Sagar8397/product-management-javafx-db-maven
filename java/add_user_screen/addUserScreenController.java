package add_user_screen;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.DbUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import userManagement_screen.userManagementScreen;

public class addUserScreenController {

	@FXML
	private TextField userName;
	
	@FXML
	private TextField loginName;
	
	@FXML
	private TextField password;
	
	@FXML
	private TextField confirm;

	@FXML
	private TextField role;
	
	
	public void showCancelButton(ActionEvent event)
	{
		userManagementScreen.showUserManagementScreen();
	}
	public void showSaveButton(ActionEvent event)
	{
		userName.getText();
		loginName.getText();
		password.getText();
		confirm.getText();
		role.getText();
		
		String query = "Insert into User(Username, loginname, password, confirmPassword, UserRole) values ('"+userName.getText()+"', '"+loginName.getText()+"', '"+password.getText()+"', '"+confirm.getText()+"', '"+role.getText()+"')";
		
		DbUtils.executeQuery(query);
	}
}
