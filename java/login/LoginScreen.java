package login;

import java.net.URL;

import common.stageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginScreen {

public static void showLoginScreen() throws Exception {
		
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\Sagar\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\login\\LoginScreen.fxml"));
			stageFactory.stage.setTitle("Customer login");
			Scene scene = new Scene(actorGroup);
			stageFactory.stage.setScene(scene);
//			stageFactory.stage.setFullScreen(true);
			stageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
