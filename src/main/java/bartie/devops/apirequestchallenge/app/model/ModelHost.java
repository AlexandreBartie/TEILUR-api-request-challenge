package bartie.devops.apirequestchallenge.app.model;

public class ModelHost extends ModelSettings {

    public String route;
    
    public ModelHost(String route)
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

    public String getURLByDomainID(String domain, Integer id)
    {
        return getURLByDomain(domain, id.toString());
    } 

    public String getURLByPage(Integer limit, Integer skip, String select)
    {
        return HostAPI.getURLByPage(route, limit, skip, select);
    } 

}
