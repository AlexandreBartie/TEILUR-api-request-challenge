package bartie.devops.apirequestchallenge.api.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import bartie.devops.apirequestchallenge.api.controller.UserController;
import bartie.devops.apirequestchallenge.api.model.UserDTO;
import bartie.devops.apirequestchallenge.app.exceptions.RequiredObjectIsNullException;

@Service
public class UserService
{

	private UserController controller;

	private Logger logger;

    public UserService() {
		controller = new UserController();
		logger = Logger.getLogger(UserService.class.getName());
    }

	public List<UserDTO> getAllUsers() 
	{
		var list = controller.getAllUsers();

		if (list == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Get All Users! >> %s items", list.size()));

		return list; 
	}

	public UserDTO getUser(Integer UserId)
	{ 

		var User = controller.getUser(UserId);

		if (User == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Get User! >> %s", User.fullKey()));

		logger.info("Get User! >> " + User.fullKey());
	
		return User; 
	}
	
	public List<UserDTO> searchUsers(String query)
	{ 

		var list = controller.searchUsers(query);

		if (list == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Search Users like '%s' >> %s items", query, list.size()));
	
		return list; 

	}

}
