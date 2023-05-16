package bartie.devops.apirequestchallenge.api.list;

import java.util.ArrayList;
import java.util.List;

import bartie.devops.apirequestchallenge.api.model.CategoryDTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode()
@ToString
public class CategoryListDTO {

    private List<CategoryDTO> categories;

    public CategoryListDTO(String[] list)
    {
        
        categories = new ArrayList<>();

        for (String string : list) {

            var item = new CategoryDTO(string);

            categories.add(item);
        }
    }

}
