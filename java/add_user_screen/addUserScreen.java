package add_user_screen;

import java.net.URL;

import common.stageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class addUserScreen {

public static void showAddUserScreen(){
		
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\Sagar\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\add_user_screen\\AddUser.fxml"));
			stageFactory.stage.setTitle("Add User Screen");
			Scene scene = new Scene(actorGroup);
			stageFactory.stage.setScene(scene);
//			stageFactory.stage.setFullScreen(true);
			stageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
