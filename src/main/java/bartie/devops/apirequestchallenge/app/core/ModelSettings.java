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

}