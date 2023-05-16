package bartie.devops.apirequestchallenge.app.core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode()
@ToString
public class ModelList {

    private Integer total;
    private Integer skip;
    private Integer limit;  
    
}
