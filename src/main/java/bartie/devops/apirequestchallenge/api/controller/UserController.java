package bartie.devops.apirequestchallenge.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bartie.devops.apirequestchallenge.api.list.UserListDTO;
import bartie.devops.apirequestchallenge.api.model.UserDTO;
import bartie.devops.apirequestchallenge.app.model.ModelController;

@RestController
@RequestMapping("/users")
public class UserController extends ModelController<UserDTO, UserListDTO> {

    public UserController() 
    {
        super("/users");
    }

    @GetMapping("")
    public List<UserDTO> getAllUsers() {
        return getItems(UserListDTO.class);
    }

    @GetMapping("{id}")
    public UserDTO getUser(Integer id) {
        return getItem(id, UserDTO.class);
    }

    @GetMapping("{q}")
    public List<UserDTO> searchUsers(String query) {
        return searchItems(query, UserListDTO.class);
    }
    
}
