package product_management_screen;

import java.net.URL;

import common.stageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class productManagementScreen {

public static void showProductManagementScreen(){
		
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\Sagar\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\product_management_screen\\ProductManagement.fxml"));
			stageFactory.stage.setTitle("Product Management Screen");
			Scene scene = new Scene(actorGroup);
			stageFactory.stage.setScene(scene);
//			stageFactory.stage.setFullScreen(true);
			stageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
