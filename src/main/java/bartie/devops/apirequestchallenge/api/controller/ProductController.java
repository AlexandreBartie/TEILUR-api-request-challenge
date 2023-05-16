package bartie.devops.apirequestchallenge.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import bartie.devops.apirequestchallenge.app.core.ModelController;

import bartie.devops.apirequestchallenge.api.model.CategoryDTO;
import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import bartie.devops.apirequestchallenge.api.list.CategoryListDTO;
import bartie.devops.apirequestchallenge.api.list.ProductListDTO;

@RestController
@RequestMapping("/products")
public class ProductController extends ModelController<ProductDTO, ProductListDTO> {

    public ProductController()
    {
        super("/products");
    }

    @GetMapping("")
    public List<ProductDTO> getAllProducts()
    {
        return getItems(ProductListDTO.class);
    }

    @GetMapping("")
    public List<ProductDTO> getAllProducts(
        @RequestParam(name = "limit", defaultValue = "10") int limit,
        @RequestParam(name = "skip", defaultValue = "0") int skip,
        @RequestParam(name = "select", defaultValue = "") String select)
        {      
        var url = host.getURLByPage(limit, skip, select);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ProductListDTO> resp = rest.getForEntity(url, ProductListDTO.class);
        return resp.getBody().getProducts();
    }

    @GetMapping("{id}")
    public ProductDTO getProduct(@PathVariable("id") Integer id)
    {
        return getItem(id, ProductDTO.class);
    }
    
    @GetMapping("{q}")
    public List<ProductDTO> searchProducts(@PathVariable("q") String query)
    {
        return searchItems(query, ProductListDTO.class);
    }

    @GetMapping("")
    public List<CategoryDTO> getCategories()
    {
        var url = host.getURLByDomain("categories");
        RestTemplate rest = new RestTemplate();
        ResponseEntity<String[]> resp = rest.getForEntity(url, String[].class);
        
        var list = new CategoryListDTO(resp.getBody());
        
        return list.getCategories() ;
    }

    @GetMapping("")
    public List<ProductDTO> getProductsByCategory(String categoryName)
    {
        var url = host.getURLByDomain("category", categoryName);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ProductListDTO> resp = rest.getForEntity(url, ProductListDTO.class);
        return resp.getBody().getProducts();
    }

  

}
