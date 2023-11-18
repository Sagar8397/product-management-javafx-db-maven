package shop_management_main;

import common.stageFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import login.LoginScreen;

public class ApplicationMain extends Application{
	
	public static void main(String args[])
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stageFactory.stage = stage;
		LoginScreen.showLoginScreen();
	}
}
