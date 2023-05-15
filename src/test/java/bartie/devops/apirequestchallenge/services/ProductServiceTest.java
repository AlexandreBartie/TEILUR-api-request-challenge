package bartie.devops.apirequestchallenge.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import bartie.devops.apirequestchallenge.api.service.ProductService;

@TestInstance(Lifecycle.PER_CLASS)
public class ProductServiceTest {

    private Integer input;

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
    public void GetProduct() {

        // Arrange

        input = 1;

        // Act

        ProductDTO output = service.getProduct(input);

        // Assert

        assertNotNull(output);
        assertEquals(output.getId(), 1);
        assertEquals(output.getTitle(), "iPhone 9");
        

    }

    @Test
    public void GetProducts() {

        // Arrange

        input = 1;

        // Act

        List<ProductDTO> output = service.getAllProducts();

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 30);
       

    }

}


