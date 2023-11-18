package home_screen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import login.LoginScreen;
import product_management_screen.productManagementScreen;
import userManagement_screen.userManagementScreen;

public class HomeScreenController {

	@FXML
	private Button UserManagement;
	
	@FXML
	private Button ProductManagemnt;
	
	@FXML
	private Button Quit;
	
	public void showUserManagement(ActionEvent event)
	{
		userManagementScreen.showUserManagementScreen();
	}
	public void showProductManagement(ActionEvent event)
	{
		productManagementScreen.showProductManagementScreen();
	}
	public void showQuitButton(ActionEvent event) throws Exception
	{
		LoginScreen.showLoginScreen();
	}
}
