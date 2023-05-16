package bartie.devops.apirequestchallenge.api.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode()
@ToString
public class CategoryDTO {

    private String name;

    public CategoryDTO(String name)
    {
        this.name = name;
    }
    
}
