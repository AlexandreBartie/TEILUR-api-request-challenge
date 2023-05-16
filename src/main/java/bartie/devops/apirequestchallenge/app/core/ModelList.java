package bartie.devops.apirequestchallenge.app.core;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode()
@ToString
public abstract class ModelList<T> {

    private Integer total;
    private Integer skip;
    private Integer limit;

    public abstract List<T> getItems();
    
}
