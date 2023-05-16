package bartie.devops.apirequestchallenge.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bartie.devops.apirequestchallenge.api.model.UserDTO;
import bartie.devops.apirequestchallenge.app.core.ModelController;

@RestController
@RequestMapping("/users")
public class UserController extends ModelController {

    public UserController(String route) {
        super("users");
    }

    @GetMapping("")
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @GetMapping("{id}")
    public UserDTO getUser(Integer id) {
        return null;
    }

    @GetMapping("{q}")
    public List<UserDTO> searchUsers(String query) {
        return null;
    }
    
}
