package bartie.devops.apirequestchallenge.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bartie.devops.apirequestchallenge.api.list.CartListDTO;
import bartie.devops.apirequestchallenge.api.model.CartDTO;
import bartie.devops.apirequestchallenge.app.model.ModelController;

@RestController
@RequestMapping("/users")
public class CartController extends ModelController<CartDTO, CartListDTO> {

    public CartController() 
    {
        super("/carts");
    }

    @GetMapping("")
    public List<CartDTO> getAllCarts() {
        return getItems(CartListDTO.class);
    }

    @GetMapping("{id}")
    public CartDTO getCart(Integer id) {
        return getItem(id, CartDTO.class);
    }

    @GetMapping("{userId}")
    public List<CartDTO> getUserCarts(@PathVariable("userId") Integer userId) {
        return getGroup("user", userId, CartListDTO.class);
    }
    
}
