package bartie.devops.apirequestchallenge.api.list;

import java.util.List;
import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import bartie.devops.apirequestchallenge.app.core.ModelList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductListDTO extends ModelList {

    private List<ProductDTO> products;

}
