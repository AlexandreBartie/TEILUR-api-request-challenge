package bartie.devops.apirequestchallenge.api.list;

import java.util.List;
import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode()
@ToString
public class ProductListDTO {


    private List<ProductDTO> products;

    private Integer total;
    private Integer skip;
    private Integer limit;  

}
