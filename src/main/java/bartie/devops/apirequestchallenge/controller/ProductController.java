package bartie.devops.apirequestchallenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bartie.devops.apirequestchallenge.model.CategoryDTO;
import bartie.devops.apirequestchallenge.model.ProductDTO;
import bartie.devops.apirequestchallenge.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService<ProductDTO, CategoryDTO> productService;

    public ProductController(ProductService<ProductDTO, CategoryDTO> productService)
    {
        this.productService = productService;
    }

    @GetMapping("{id}")
    public ProductDTO getProduct(@PathVariable("id") Integer id)
    {
        return productService.getProduct(id);
    }
    
}
