package bartie.devops.apirequestchallenge.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import bartie.devops.apirequestchallenge.api.model.UserDTO;
import bartie.devops.apirequestchallenge.api.service.UserService;

@TestInstance(Lifecycle.PER_CLASS)
public class UserServiceTest {

    private UserService service;

    public UserServiceTest()
    {
        service = new UserService();
    }

    @Test
    public void getUser() {

        // Arrange

        var input = 1;

        // Act

        UserDTO output = service.getUser(input);

        // Assert

        assertNotNull(output);
        assertEquals(output.getId(), 1);
        assertEquals(output.fullKey(), "Terry Medhurst atuny0@sohu.com");
        

    }

    @Test
    public void getAllUsers() {

        // Arrange


        // Act

        List<UserDTO> output = service.getAllUsers();

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 30);
        assertEquals(output.get(0).fullKey(), "Terry Medhurst atuny0@sohu.com");
        assertEquals(output.get(29).fullKey(), "Maurine Stracke kdulyt@umich.edu");
       

    }

    @Test
    public void searchUsers() {

        // Arrange

        var input = "john";

        // Act

        List<UserDTO> output = service.searchUsers(input);

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 1);
        assertEquals(output.get(0).fullKey(), "Johnathon Predovic xlinster1d@bravesites.com");    

    }

}


