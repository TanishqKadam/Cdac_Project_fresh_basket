package com.freshbasket.newservice;

import java.util.List;

import com.freshbasket.pojos.Cart;
import com.freshbasket.pojos.CartItem;
import com.freshbasket.pojos.OrderDetails;
import com.freshbasket.pojos.User;

public interface UserService {

	public User Authenticate(String email, String password);

	public User Register(User user);

	public CartItem AddToCart(Integer productid, Integer qty);

	public boolean PlaceOrder(Cart cart, User user);

	public User getUserDetails(Integer userId);

	public List<OrderDetails> getOrder(Integer userId);

}
