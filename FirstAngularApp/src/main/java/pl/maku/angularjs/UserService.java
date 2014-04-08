package pl.maku.angularjs;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Maciek
 * Date: 07.04.14
 * Time: 22:17
 * To change this template use File | Settings | File Templates.
 */
@Path("/users")
public class UserService {


    @GET
    public List<User> getUsers() {

        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1,"maciek","maku17"));
        users.add(new User(2,"janek","janek@mail.com"));
        users.add(new User(3,"tomek","tomek@mail.com"));
        users.add(new User(4,"romek","romek@mail.com"));
        return users;

    }

    @GET
    @Path("/{id}")
    public User getUser(@PathParam("id") long id) {
        return new User(1,"maciek","maku17");
    }


    @GET
    @Path("/ping")
    public String ping() {

        return "hello";
    }



}
