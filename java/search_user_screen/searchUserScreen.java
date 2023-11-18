package search_user_screen;

import java.net.URL;

import common.stageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class searchUserScreen {

	public static void showSearchUserScreen()
	{
		try
		{
			Parent actorgroup = FXMLLoader.load(new URL("file:///C:\\Users\\Sagar\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\search_user_screen\\SearchUser.fxml"));
			stageFactory.stage.setTitle("Search User Screen");
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
