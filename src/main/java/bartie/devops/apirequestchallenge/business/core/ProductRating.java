package bartie.devops.apirequestchallenge.business.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import bartie.devops.apirequestchallenge.api.service.ProductService;

public class ProductRating 
{

    private ProductService service;

    private List<ProductDTO> products;
    
    public ProductRating()
    {
        this.service = new ProductService();
    }

    public List<ProductDTO> getList(Double rating)
    {
        products = service.getAllProducts();

        // Order the list by rating in ascending order
        Collections.sort(products, Comparator.comparingDouble(ProductDTO::getRating));

        // Remove objects with rating higher than the input value
        products.removeIf(item -> item.getRating() > rating);

        return products;
    }

}
