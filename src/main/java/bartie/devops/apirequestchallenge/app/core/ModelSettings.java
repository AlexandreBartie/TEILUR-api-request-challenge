package bartie.devops.apirequestchallenge.app.core;

public class ModelSettings {
    
    public HostApiSettings HostAPI = new HostApiSettings();

}

class HostApiSettings {
    
    private String root = "https://dummyjson.com";

    public String getURL(String route)
    {
        return root + route;
    } 

    public String getURL(String route, Integer id)
    {
        return String.format(getURL(route)+"/%s", id);
    } 

    public String getURLBySearch(String route, String query)
    {
        return String.format(getURL(route)+"/search?q=%s", query);
    }

    public String getURLByDomain(String route, String domain, String subDomain)
    {
        var complement = domain;

        if (subDomain != "")
        complement += "/" + subDomain;
        
        return getURL(route) + "/" + complement;
    }
    
    public String getURLByPage(String route, Integer limit, Integer skip, String select)
    {
        return String.format(getURL(route)+"?limit=%s&skip=%s&select=%s", limit, skip, select);
    } 

}