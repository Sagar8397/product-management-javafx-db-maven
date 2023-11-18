package edit_product_screen;

import java.net.URL;

import common.stageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditProductScreen {

	public static void showEditUserScreen()
	{
		try
		{
			Parent actorgroup = FXMLLoader.load(new URL("file:///C:\\Users\\Sagar\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\edit_product_screen\\editProduct.fxml"));
			stageFactory.stage.setTitle("Edit Product Screen");
			Scene scene = new Scene(actorgroup);
			stageFactory.stage.setScene(scene);
//			stageFactory.stage.setFullScreen(true);
			stageFactory.stage.show();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
