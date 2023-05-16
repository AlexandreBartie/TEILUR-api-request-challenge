package bartie.devops.apirequestchallenge.app.core;

public class ModelController extends ModelSettings {

    public String route;
    
    public ModelController(String route)
    {
        this.route = route;
    }

    public String getURL()
    {
        return HostAPI.getURL(route);
    } 

    public String getURL(Integer id)
    {
        return HostAPI.getURL(route, id);
    }

    public String getURLBySearch(String query)
    {
        return HostAPI.getURLBySearch(route, query);
    } 

    public String getURLByDomain(String domain)
    {
        return getURLByDomain(domain, "");
    } 

    public String getURLByDomain(String domain, String subDomain)
    {
        return HostAPI.getURLByDomain(route, domain, subDomain);
    } 

}
