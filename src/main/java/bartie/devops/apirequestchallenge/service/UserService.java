package bartie.devops.apirequestchallenge.service;
// Note: the generic type parameter U is used to represent the type of the user.

import java.util.List;

public interface UserService<U> {

	/*
	 * Get all users of TestMart
	 * API endpoint to get data: https://dummyjson.com/users
	 */
	List<U> getAllUsers();

	/*
	 * Get a single user
	 * API endpoint to get data: https://dummyjson.com/users/{userId}
	 */
	U getUser(Integer userId);

	/*
	 * Search users
	 * API endpoint to get data: https://dummyjson.com/users/search?q={query}
	 */
	List<U> searchUsers(String query);
}
