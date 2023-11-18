package userManagement_screen;

import add_user_screen.addUserScreen;
import edit_user_screen.EditUserScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_user_screen.searchUserScreen;

public class userManagementScreenController {

	@FXML
	private Button addUser;
	
	@FXML
	private Button editUser;
	
	@FXML
	private Button searchUser;
	
	@FXML
	private Button deleteUser;
	
	@FXML
	private Button back;
	
	public void showAddUser(ActionEvent event)
	{
		addUserScreen.showAddUserScreen();
	}
	public void showEditUser(ActionEvent event)
	{
		EditUserScreen.editUserScreen();
	}
	public void showSearchUser(ActionEvent event)
	{
		searchUserScreen.showSearchUserScreen();
	}
	public void showDeleteUser(ActionEvent event)
	{
		searchUserScreen.showSearchUserScreen();
	}
	public void showQuit(ActionEvent event)
	{
		HomeScreen.showHomeScreen();
	}
}
