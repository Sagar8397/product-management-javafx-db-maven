package product_management_screen;

import add_product_screen.addProductScreen;
import edit_product_screen.EditProductScreen;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_product_screen.searchProductScreen;

public class productManagementScreenController {

	@FXML
	private Button addProduct;
	
	@FXML
	private Button editProduct;
	
	@FXML
	private Button searchProduct;
	
	@FXML
	private Button deleteProduct;
	
	@FXML
	private Button back;
	
	public void showAddProduct(ActionEvent event)
	{
		addProductScreen.showAddProductScreen();
	}
	public void showEditProduct(ActionEvent event)
	{
		EditProductScreen.showEditUserScreen();
	}
	public void showSearchProduct(ActionEvent event)
	{
		searchProductScreen.showSearchProductScreen();
	}
	public void showDeleteProduct(ActionEvent event)
	{
		searchProductScreen.showSearchProductScreen();
	}
	public void showQuit(ActionEvent event)
	{
		HomeScreen.showHomeScreen();
	}
}
