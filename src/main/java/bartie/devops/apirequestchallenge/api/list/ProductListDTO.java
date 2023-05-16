package bartie.devops.apirequestchallenge.api.list;

import java.util.List;
import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import bartie.devops.apirequestchallenge.app.core.ModelList;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper=true)
@ToString
public class ProductListDTO extends ModelList {


    private List<ProductDTO> products;

}
