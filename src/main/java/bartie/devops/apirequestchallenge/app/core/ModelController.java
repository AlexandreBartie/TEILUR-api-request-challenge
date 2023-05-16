package bartie.devops.apirequestchallenge.app.core;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ModelController<T, L extends ModelList<T>> {

    public ModelHost host;
    
    public ModelController(String route)
    {
        this.host = new ModelHost(route);
    }

    public List<T> getAllItems(Class<L> reference)
    {
        var url = host.getURL();
        RestTemplate rest = new RestTemplate();
        ResponseEntity<L> resp = rest.getForEntity(url, reference);
        return resp.getBody().getItems();
    }
    
}
