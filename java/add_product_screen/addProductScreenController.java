package add_product_screen;

import db_operation.DbUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management_screen.productManagementScreen;

public class addProductScreenController {

	@FXML
	private TextField productName;
	
	@FXML
	private TextField productId;
	
	@FXML
	private TextField productCategory;
	
	@FXML
	private TextField productPrice;
	
	@FXML
	private TextField productQuentity;
	
	@FXML
	private Button cancelButton;
	
	@FXML
	private Button saveButton;
	
	public void showCancelButton(ActionEvent event)
	{
		productManagementScreen.showProductManagementScreen();
	}
	public void showSaveButton(ActionEvent event)
	{
		productName.getText();
		productId.getText();
		productCategory.getText();
		productPrice.getText();
		productQuentity.getText();
		
		String query = "Insert into Product(ProductName, ProductID, Price, Quantity, Category) values ('"+productName.getText()+"', '"+productId.getText()+"', '"+productPrice.getText()+"', '"+productQuentity.getText()+"', '"+productCategory.getText()+"')";
		
		DbUtils.executeQuery(query);
	}
}
