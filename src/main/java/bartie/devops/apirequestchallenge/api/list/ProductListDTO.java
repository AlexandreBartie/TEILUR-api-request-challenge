package bartie.devops.apirequestchallenge.api.list;

import java.util.List;
import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import bartie.devops.apirequestchallenge.app.core.ModelList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductListDTO extends ModelList<ProductDTO> {

    private List<ProductDTO> products;

    @Override
    public List<ProductDTO> getItems() {
        return products;
    }

}
