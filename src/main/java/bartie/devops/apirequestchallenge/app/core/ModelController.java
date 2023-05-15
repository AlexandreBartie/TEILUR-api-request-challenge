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
   
}
