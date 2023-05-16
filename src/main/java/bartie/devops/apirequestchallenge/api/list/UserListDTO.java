package bartie.devops.apirequestchallenge.api.list;

import java.util.List;

import bartie.devops.apirequestchallenge.api.model.UserDTO;
import bartie.devops.apirequestchallenge.app.core.ModelList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserListDTO extends ModelList<UserDTO> {

    private List<UserDTO> users;

    @Override
    public List<UserDTO> getItems() {
        return users;
    }

}
