package bartie.devops.apirequestchallenge.api.contract;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageInterface 
{
    private Integer limit;
    private Integer skip;
    private String fields;

    public PageInterface(Integer limit, Integer skip, String fields) {
        this.limit = limit;
        this.skip = skip;
        this.fields = fields;
    }

    public String getSelect()
    {
        return this.fields;       
    }
}
