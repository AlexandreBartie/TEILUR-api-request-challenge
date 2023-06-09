package bartie.devops.apirequestchallenge.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import bartie.devops.apirequestchallenge.api.model.CategoryDTO;
import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import bartie.devops.apirequestchallenge.api.service.ProductService;
import bartie.devops.apirequestchallenge.contract.PageInterface;

@TestInstance(Lifecycle.PER_CLASS)
public class ProductServiceTest {

    private ProductService service;

    public ProductServiceTest()
    {
        service = new ProductService();
    }

    @BeforeEach
    public void setUp() {
        // service = new ProductService<ProductDTO, CategoryDTO>();
    }

    @Test
    public void getProduct() {

        // Arrange

        var input = 1;

        // Act

        ProductDTO output = service.getProduct(input);

        // Assert

        assertNotNull(output);
        assertEquals(output.getId(), 1);
        assertEquals(output.getTitle(), "iPhone 9");
        

    }

    @Test
    public void getAllProducts() {

        // Arrange


        // Act

        List<ProductDTO> output = service.getAllProducts();

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 30);
       

    }

    @Test
    public void getPageProducts() {

        // Arrange

        var input = new PageInterface(10, 10, "title,price,description");

        // Act

        List<ProductDTO> output = service.getAllProducts(input.getLimit(), input.getSkip(), input.getSelect());

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 10);
       

    }

    @Test
    public void searchProducts() {

        // Arrange

        var input = "phone";

        // Act

        List<ProductDTO> output = service.searchProducts(input);

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 4);    

    }

    @Test
    public void getCategories() {

        // Arrange


        // Act

        List<CategoryDTO> output = service.getCategories();

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 20);    

    }

    @Test
    public void getProductsByCategory() {

        // Arrange
        var input = "smartphones";

        // Act

        List<ProductDTO> output = service.getProductsByCategory(input);

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 5);    

    }


}


