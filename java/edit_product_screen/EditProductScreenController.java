package edit_product_screen;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.DbUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management_screen.productManagementScreen;

public class EditProductScreenController {

	@FXML
	private TextField newProductName;
	
	@FXML
	private TextField newProductId;
	
	@FXML
	private TextField newProductPrice;
	
	@FXML
	private TextField newProductQuentity;
	
	@FXML
	private TextField newProductCategory;

	@FXML
	private TextField productToEditProduct;
	
	@FXML
	private Button closeButton;
	
	@FXML
	private Button saveButton;
	
	@FXML
	private Button searchButton;
	
	public void showCloseButton(ActionEvent event)
	{
		productManagementScreen.showProductManagementScreen();
	}
	public void showSaveButton(ActionEvent event)
	{
		boolean status = editProduct(productToEditProduct.getText());
		if(status)
		{
			editProduct(null);
		}
		else	
		{
			
		}
	}
	public void showSearchButton(ActionEvent event)
	{
		boolean status = editButton(productToEditProduct.getText());
		if(status)
		{
			editButton(null);
		}
		else	
		{
			
		}
	}
	public boolean editButton(String productToEditProduct) {
		String query = "SELECT * FROM Product WHERE ProductName = '"+productToEditProduct+"'";
	    
		ResultSet rs = DbUtils.executeQueryGetResult(query);
		try {
			if(rs.next()) {
				System.out.println("Product found");
				}else {
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean editProduct(String productToEditProduct)
	{
		String Query = "UPDATE Product SET ProductName = '"+newProductName.getText()+"', "
			    + "ProductID = '" + newProductId.getText() + "', " 
			    + "Price = '"+newProductPrice.getText()+"', "
			    + "Quantity = '"+newProductQuentity.getText()+"',"
			    + "Category = '"+newProductCategory.getText()+"' where ProductName = '"+productToEditProduct+"'";
		
		DbUtils.executeQuery(Query);
		return false;
	}
}
