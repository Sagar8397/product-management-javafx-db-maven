package edit_user_screen;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.DbUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import userManagement_screen.userManagementScreen;

public class EditUserScreenController {

	@FXML
	private TextField newUserName;
	
	@FXML
	private TextField newLoginName;
	
	@FXML
	private TextField newPassword;
	
	@FXML
	private TextField newConfirm;
	
	@FXML
	private TextField newRole;

	@FXML
	private TextField userToEditUser;
	
	@FXML
	private Button closeButton;
	
	@FXML
	private Button saveButton;
	
	@FXML
	private Button searchButton;
	
	public void showCloseButton(ActionEvent event)
	{
		userManagementScreen.showUserManagementScreen();
	}
	public void showSaveButton(ActionEvent event) throws SQLException
	{
		boolean status = editUser(userToEditUser.getText());
		if(status)
		{
			editUser(null);
		}
		else	
		{
			
		}
	}
	
	public void showSearchButton(ActionEvent event)
	{
		boolean status = editButton(userToEditUser.getText());
		if(status)
		{
			editButton(null);
		}
		else	
		{
			
		}
	}
	
	public boolean editButton(String userToEditUser) {
		String query = "SELECT * FROM User WHERE Username = '"+userToEditUser+"'";
	    
		ResultSet rs = DbUtils.executeQueryGetResult(query);
		try {
			if(rs.next()) {
				System.out.println("user found");
				}else {
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean editUser(String userToEditUser)
	{
		String Query = "UPDATE User SET Username = '"+newUserName.getText()+"', "
			    + "loginname = '" + newLoginName.getText() + "', " 
			    + "password = '"+newPassword.getText()+"', "
			    + "confirmPassword = '"+newConfirm.getText()+"',"
			    + "UserRole = '"+newRole.getText()+"' where Username = '"+userToEditUser+"'";
		
		DbUtils.executeQuery(Query);
		return false;
	}
}
