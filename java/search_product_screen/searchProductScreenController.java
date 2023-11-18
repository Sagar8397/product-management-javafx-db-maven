package search_product_screen;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.DbUtils;
import edit_product_screen.EditProductScreen;
import edit_user_screen.EditUserScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management_screen.productManagementScreen;
import userManagement_screen.userManagementScreen;

public class searchProductScreenController {

	@FXML
	private TextField productNameToSearch;
	
	@FXML
	private TextField productName;
	
	@FXML
	private TextField productId;
	
	@FXML
	private TextField productPrice;
	
	@FXML
	private TextField productQuentity;
	
	@FXML
	private TextField productCategory;
	
	@FXML
	private Button closeButton;
	
	@FXML
	private Button deleteButton;
	
	@FXML
	private Button editButton;
	
	@FXML
	private Button searchUser;
	
	public void showCloseButton(ActionEvent event)
	{
		productManagementScreen.showProductManagementScreen();
	}
	public void showDeleteButton(ActionEvent event)
	{
		boolean status = deleteButton(productNameToSearch.getText());
		if(status)
		{
			deleteButton(null);
			return;
		}
		else	
		{
			System.out.println("Product not found");
		}
	}
	public void showEditButton(ActionEvent event)
	{	
		EditProductScreen.showEditUserScreen();
	}

	public void showSearchButton(ActionEvent event) throws SQLException
	{
		boolean status = searchProduct(productNameToSearch.getText());
		if(status)
		{
			searchProduct(null);
		}
		else	
		{
			
		}
	}
	public boolean searchProduct(String userNameToSearch) throws SQLException
	{
		String query = "Select * from Product where ProductName = '"+userNameToSearch+"'";
		
		ResultSet rs = DbUtils.executeQueryGetResult(query);
		
		try
		{
			if(rs.next())
			{
				productName.setText(rs.getString("ProductName"));
				productId.setText(rs.getString("ProductID"));
				productPrice.setText(rs.getString("Price"));
				productQuentity.setText(rs.getString("Quantity"));
				productCategory.setText(rs.getString("Category"));
			}
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteButton(String deleteButton)
	{
		String query = "delete from Product where ProductName = '"+deleteButton+"'";
		
		DbUtils.executeQuery(query);

		int rowDeleted = DbUtils.getRowsDeleted();

		if(rowDeleted > 0) {
			System.out.println("Product " + deleteButton + " has been deleted");
		}
		else {
	        
	    }
		return false;
		
	}
}
