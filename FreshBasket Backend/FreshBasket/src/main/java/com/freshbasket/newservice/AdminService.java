package com.freshbasket.newservice;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.freshbasket.pojos.Category;
import com.freshbasket.pojos.Farmer;
import com.freshbasket.pojos.OrderDetails;
import com.freshbasket.pojos.StockDetails;
import com.freshbasket.pojos.User;

public interface AdminService {

	public Farmer GetFarmerDetails(Integer farmerid);

	public Farmer AddFarmer(Farmer farmer);

	public boolean RemoveFarmer(Integer farmerid);

	public boolean UpdateFarmer(Farmer farmer);

	public StockDetails GetProductDetails(Integer productid);

	public boolean AddProduct(Integer farmerid, StockDetails product);

	public boolean RemoveProduct(Integer productid);

	public StockDetails UpdateProduct(StockDetails product);

	public Category GetCategory(Integer catid);

	public Category SetCategory(String category);

	public boolean RemoveCategory(Integer catid);

	public List<Category> getAllCategory();

	public List<OrderDetails> getAllOrders();

	public List<User> getAllUser();

	User UpdateUser(User user);

	String saveImage(Integer productId, MultipartFile imgFile) throws IOException;

	byte[] restoreImage(Integer empId) throws IOException;

	byte[] restoreImageAgain(String productName) throws IOException;
}
