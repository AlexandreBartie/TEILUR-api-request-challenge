package bartie.devops.apirequestchallenge.api.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode()
@ToString
public class CartDTO 
{
    private Integer id;
    private Integer userId;

    private List<CartItemsDTO> products;

    private Double total;
    private Double discountedTotal;

    private Double totalProducts;
    private Double totalQuantity;

    public String fullValue()
    { return total.toString() + " " + totalProducts.toString() + " " + totalQuantity.toString()  ; } 
        
}


