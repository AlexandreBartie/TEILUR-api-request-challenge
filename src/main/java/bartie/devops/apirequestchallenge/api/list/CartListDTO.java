package bartie.devops.apirequestchallenge.api.list;

import java.util.List;

import bartie.devops.apirequestchallenge.api.model.CartDTO;
import bartie.devops.apirequestchallenge.app.model.ModelList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartListDTO extends ModelList<CartDTO> {

    private List<CartDTO> carts;

    @Override
    public List<CartDTO> getItems() {
        return carts;
    }

}