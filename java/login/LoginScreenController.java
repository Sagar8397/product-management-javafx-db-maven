package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.DbUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginScreenController {

	@FXML
	private TextField LoginName;
	
	@FXML
	private TextField Password;
	
	@FXML
	private Button LoginButton;
	
	public void Login(ActionEvent event) throws Exception
	{	
		boolean loginStatus = LoginScreenController.validateUserAndPassword(LoginName.getText(), Password.getText());
		
		if(loginStatus)
		{
			HomeScreen.showHomeScreen();
		}
		else
		{
			System.out.println("login unsuccessfull");
		}
	}
	
	public static boolean validateUserAndPassword(String LoginName, String password) throws Exception
	{
		String query = "select * from User where LoginName='"+LoginName+"' and password='"+password+"' ";
			
		ResultSet rs = DbUtils.executeQueryGetResult(query);
		
		try
		{
			if(rs.next())
			{
				return true;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
