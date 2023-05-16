package bartie.devops.apirequestchallenge.business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import bartie.devops.apirequestchallenge.business.view.AppFeatures;

@TestInstance(Lifecycle.PER_CLASS)

public class AppFeaturesTest 
{

    private AppFeatures app = new AppFeatures();
    
    @Test
    public void getProductListByWorseRating() {

        // Arrange

        var input = 4.4;

        // Act

        List<ProductDTO> output = app.getProductListByWorseRating(input);

        // Assert

        assertNotNull(output);
        assertEquals(output.size(), 9);
        assertEquals(output.get(0).fullRating(), "Brown Perfume - 4.0");
        assertEquals(output.get(8).fullRating(), "OPPOF19 - 4.3");        

    }

}
