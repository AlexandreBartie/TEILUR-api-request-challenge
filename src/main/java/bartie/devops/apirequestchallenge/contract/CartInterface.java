package bartie.devops.apirequestchallenge.contract;

import java.util.List;

import bartie.devops.apirequestchallenge.api.model.CartDTO;

public interface CartInterface<T extends CartDTO> {

	/*
	 * Get all carts of TestMart
	 * API endpoint to get data: https://dummyjson.com/carts
	 */
	List<T> getAllCarts();

	/*
	 * Get a single cart
	 * API endpoint to get data: https://dummyjson.com/carts/{cartId}
	 */
	T getCart(Integer cartId);

	/*
	 * Get carts of a user
	 * API endpoint to get data: https://dummyjson.com/carts/user/{userIds}
	 */
	List<T> getUserCarts(Integer userId);
}
