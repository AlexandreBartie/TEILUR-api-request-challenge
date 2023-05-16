package bartie.devops.apirequestchallenge.business.view;

import java.util.List;

import bartie.devops.apirequestchallenge.api.model.CartDTO;
import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import bartie.devops.apirequestchallenge.business.core.CartRanking;
import bartie.devops.apirequestchallenge.business.core.ProductRating;
import bartie.devops.apirequestchallenge.contract.AppFeaturesInterface;

public class AppFeatures implements AppFeaturesInterface<ProductDTO, CartDTO> {

    @Override
    public void getProductTitlesByWorseRating(double rating) {

        getProductListByWorseRating(rating);
        
    }

    public List<ProductDTO> getProductListByWorseRating(double rating) 
    {

        var calc = new ProductRating();

        var list = calc.getList(rating);

        // Loop through the filtered list and write objects to the console
        for (ProductDTO product : list) 
            System.out.println(product.fullRating());       

        return list;
    }


    @Override
    public CartDTO getCartWithLowestTotal() {
        
        var calc = new CartRanking();

        return calc.getCartWithLowestTotal();
    }

    @Override
    public CartDTO getCartWithHighestTotal() {
        
        var calc = new CartRanking();

        return calc.getCartWithHighestTotal();
    }

    @Override
    public List<ProductDTO> addProductImagesToUserCart(Integer userId) {
        
        return null;
    }



    
}
