package bartie.devops.apirequestchallenge.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import bartie.devops.apirequestchallenge.api.model.CartDTO;
import bartie.devops.apirequestchallenge.api.service.CartService;

@TestInstance(Lifecycle.PER_CLASS)
public class CartServiceTest {

    private CartService service;

    public CartServiceTest()
    {
        service = new CartService();
    }

    @Test
    public void getCart() {

        // Arrange

        var input = 1;

        // Act

        CartDTO output = service.getCart(input);

        // Assert

        assertNotNull(output);
        assertEquals(output.getId(), 1);
        assertEquals(output.fullValue(), "2328.0 5.0 10.0");
        

    }

    @Test
    public void getAllCarts() {

        // Arrange


        // Act

        List<CartDTO> output = service.getAllCarts();

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 20);
        assertEquals(output.get(0).fullValue(), "2328.0 5.0 10.0");
        assertEquals(output.get(19).fullValue(), "315.0 5.0 8.0");
       

    }

    @Test
    public void getUserCarts() {

        // Arrange

        var input = 1;

        // Act

        List<CartDTO> output = service.getUserCarts(input);

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 1);
        assertEquals(output.get(0).fullValue(), "1129.0 5.0 9.0");    

    }

}


