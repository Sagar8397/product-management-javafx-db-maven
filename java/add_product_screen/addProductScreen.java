package add_product_screen;

import java.net.URL;

import common.stageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class addProductScreen {

public static void showAddProductScreen(){
		
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\Users\\Sagar\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\add_product_screen\\AddProduct.fxml"));
			stageFactory.stage.setTitle("Add Product Screen");
			Scene scene = new Scene(actorGroup);
			stageFactory.stage.setScene(scene);
//			stageFactory.stage.setFullScreen(true);
			stageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
