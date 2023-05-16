package bartie.devops.apirequestchallenge.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import bartie.devops.apirequestchallenge.app.core.ModelController;

import bartie.devops.apirequestchallenge.api.model.CategoryDTO;
import bartie.devops.apirequestchallenge.api.model.ProductDTO;

import bartie.devops.apirequestchallenge.api.list.CategoryListDTO;
import bartie.devops.apirequestchallenge.api.list.ProductListDTO;

@RestController
@RequestMapping("/products")
public class ProductController extends ModelController {

    public ProductController()
    {
        super("/products");
    }

    @GetMapping("")
    public List<ProductDTO> getAllProducts()
    {
        var url = getURL();
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ProductListDTO> resp = rest.getForEntity(url, ProductListDTO.class);
        return resp.getBody().getProducts();
    }

    @GetMapping("{id}")
    public ProductDTO getProduct(@PathVariable("id") Integer id)
    {
        var url = getURL(id);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ProductDTO> resp = rest.getForEntity(url, ProductDTO.class);
        return resp.getBody();
    }
    
    @GetMapping("{q}")
    public List<ProductDTO> searchProducts(@PathVariable("q") String query)
    {
        var url = getURLBySearch(query);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ProductListDTO> resp = rest.getForEntity(url, ProductListDTO.class);
        return resp.getBody().getProducts();
    }

    @GetMapping("")
    public List<CategoryDTO> getCategories()
    {
        var url = getURLByDomain("categories");
        RestTemplate rest = new RestTemplate();
        ResponseEntity<String[]> resp = rest.getForEntity(url, String[].class);
        
        var list = new CategoryListDTO(resp.getBody());
        
        return list.getCategories() ;
    }

    @GetMapping("{q}")
    public List<ProductDTO> getProductsByCategory(String categoryName)
    {
        var url = getURLByDomain("category", categoryName);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ProductListDTO> resp = rest.getForEntity(url, ProductListDTO.class);
        return resp.getBody().getProducts();
    }
    

}
