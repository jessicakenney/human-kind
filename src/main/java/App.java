import com.google.gson.Gson;
import dataModels.Business;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        Gson translater = new Gson();




        post("/homepage", "application/json" ,(request, response) -> {
        Business thisOne = translater.fromJson(request.body(), Business.class);
        response.status(201);
        response.type("application/json");
        return translater.toJson(thisOne);
        });
    }
}
