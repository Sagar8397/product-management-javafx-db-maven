package userManagement_screen;

import java.net.URL;

import common.stageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class userManagementScreen {

public static void showUserManagementScreen(){
		
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\Sagar\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\userManagement_screen\\UserManagement_add.fxml"));
			stageFactory.stage.setTitle("User Management Screen");
			Scene scene = new Scene(actorGroup);
			stageFactory.stage.setScene(scene);
//			stageFactory.stage.setFullScreen(true);
			stageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
