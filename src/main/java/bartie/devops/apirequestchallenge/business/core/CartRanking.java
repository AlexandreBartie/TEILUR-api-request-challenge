package bartie.devops.apirequestchallenge.business.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bartie.devops.apirequestchallenge.api.model.CartDTO;
import bartie.devops.apirequestchallenge.api.service.CartService;

public class CartRanking 
{

    private CartService service;

    private List<CartDTO> carts;
    
    public CartRanking()
    {
        this.service = new CartService();

        SortCartList();
    }

    private void SortCartList()
    {
        carts = service.getAllCarts();

        // Order the list by rating in ascending order
        Collections.sort(carts, Comparator.comparingDouble(CartDTO::getTotal).reversed());

    }

    public CartDTO getCartWithLowestTotal()
    {
        return carts.get(carts.size()-1);
    }

    public CartDTO getCartWithHighestTotal()
    {
        return carts.get(0);
    }


}
