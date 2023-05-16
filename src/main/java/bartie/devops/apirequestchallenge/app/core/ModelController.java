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

    public List<T> getItems(Class<L> list)
    {
        var url = host.getURL();
        RestTemplate rest = new RestTemplate();
        ResponseEntity<L> resp = rest.getForEntity(url, list);
        return resp.getBody().getItems();
    }

    public T getItem(Integer id, Class<T> item)
    {
        var url = host.getURL(id);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<T> resp = rest.getForEntity(url, item);
        return resp.getBody();
    }
    
    public List<T> searchItems(String query, Class<L> list)
    {
        var url = host.getURLBySearch(query);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<L> resp = rest.getForEntity(url, list);
        return resp.getBody().getItems();
    }

    public List<T> getGroup(String domain, Integer id, Class<L> list)
    {
        var url = host.getURLByDomainID(domain, id);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<L> resp = rest.getForEntity(url, list);
        return resp.getBody().getItems();
    }
    
}
