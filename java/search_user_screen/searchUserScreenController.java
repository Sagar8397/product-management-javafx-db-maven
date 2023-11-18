package search_user_screen;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.DbUtils;
import edit_user_screen.EditUserScreen;
import edit_user_screen.EditUserScreenController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import userManagement_screen.userManagementScreen;

public class searchUserScreenController {

	@FXML
	private TextField userNameToSearch;
	
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
	
	@FXML
	private Button closeButton;
	
	@FXML
	private Button deleteButton;
	
	@FXML
	private Button editButton;
	
	@FXML
	private Button searchUser;
	
	public void showCloseButton(ActionEvent event)
	{
		userManagementScreen.showUserManagementScreen();
	}
	public void showDeleteButton(ActionEvent event)
	{
		boolean status = deleteButton(userNameToSearch.getText());
		if(status)
		{
			deleteButton(null);
		}
		else	
		{
			
		}
	}
	public void showEditButton(ActionEvent event)
	{	
		EditUserScreen.editUserScreen();
	}

	public void showSearchButton(ActionEvent event) throws SQLException
	{
		boolean status = searchUser(userNameToSearch.getText());
		if(status)
		{
			searchUser(null);
		}
		else	
		{
			
		}
	}
	public boolean searchUser(String userNameToSearch) throws SQLException
	{
		String query = "Select * from User where userName = '"+userNameToSearch+"'";
		
		ResultSet rs = DbUtils.executeQueryGetResult(query);
		
		try
		{
			if(rs.next())
			{
				userName.setText(rs.getString("userName"));
				loginName.setText(rs.getString("loginname"));
				password.setText(rs.getString("password"));
				confirm.setText(rs.getString("confirmPassword"));
				role.setText(rs.getString("UserRole"));
			}
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteButton(String deleteButton)
	{
		String query = "delete from User where Username = '"+deleteButton+"'";
		
		DbUtils.executeQuery(query);

		int rowDeleted = DbUtils.getRowsDeleted();

		if(rowDeleted > 0) {
			System.out.println("User " + deleteButton + " has been deleted");
		}
		else {
	        
	    }
		return false;
		
	}
}
