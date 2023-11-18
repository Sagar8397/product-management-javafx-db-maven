package edit_user_screen;

import java.net.URL;

import common.stageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditUserScreen {

	public static void editUserScreen()
	{
		try
		{
			Parent actorgroup = FXMLLoader.load(new URL("file:///C:\\Users\\Sagar\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\edit_user_screen\\editUser.fxml"));
			stageFactory.stage.setTitle("Edit User Screen");
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
