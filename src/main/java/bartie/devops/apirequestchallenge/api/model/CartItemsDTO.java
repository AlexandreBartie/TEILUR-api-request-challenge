package bartie.devops.apirequestchallenge.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode()
@ToString
public class CartItemsDTO {
    
    private Integer id;
    private String title;
    private Double price;
    private Integer quantity;
    private Integer total;
    private Double discountPercentage;
    private Double discountedPrice;
}
