package bartie.devops.apirequestchallenge.api.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import bartie.devops.apirequestchallenge.api.controller.CartController;
import bartie.devops.apirequestchallenge.api.model.CartDTO;
import bartie.devops.apirequestchallenge.app.exceptions.RequiredObjectIsNullException;

@Service
public class CartService
{

	private CartController controller;

	private Logger logger;

    public CartService() {
		controller = new CartController();
		logger = Logger.getLogger(CartService.class.getName());
    }

	public List<CartDTO> getAllCarts() 
	{
		var list = controller.getAllCarts();

		if (list == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Get All Carts! >> %s items", list.size()));

		return list; 
	}

	public CartDTO getCart(Integer CartId)
	{ 

		var Cart = controller.getCart(CartId);

		if (Cart == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Get Cart! >> %s", Cart.fullValue()));

		logger.info("Get Cart! >> " + Cart.fullValue());
	
		return Cart; 
	}
	
	public List<CartDTO> getUserCarts(Integer userId)
	{ 

		var list = controller.getUserCarts(userId);

		if (list == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Search Carts of user '%s' >> %s items", userId.toString(), list.size()));
	
		return list; 

	}

}
