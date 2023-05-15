package bartie.devops.apirequestchallenge.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import bartie.devops.apirequestchallenge.model.ProductDTO;

@RestController
@RequestMapping("/products")
public class ProductController {

    // private ProductService<ProductDTO, CategoryDTO> productService;

    // public ProductController(ProductService<ProductDTO, CategoryDTO> productService)
    // {
    //     this.productService = productService;
    // }

    @GetMapping("{id}")
    public ProductDTO getProduct(@PathVariable("id") Integer id)
    {
        var url = String.format("https://dummyjson.com/products/%s", id);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ProductDTO> resp = rest.getForEntity(url, ProductDTO.class);
        return resp.getBody();
    }
    
}
