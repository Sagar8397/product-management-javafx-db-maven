package search_product_screen;

import java.net.URL;

import common.stageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class searchProductScreen {

	public static void showSearchProductScreen()
	{
		try
		{
			Parent actorgroup = FXMLLoader.load(new URL("file:///C:\\Users\\Sagar\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\search_product_screen\\searchProduct.fxml"));
			stageFactory.stage.setTitle("Search Product Screen");
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
