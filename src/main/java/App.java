import com.google.gson.Gson;
import dao.Sql2oPhilanthropicDao;
import dataModels.Business;
import dataModels.Philanthropic;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {


        Sql2oPhilanthropicDao philanthropicDao;
        Connection conn;
        Gson translater = new Gson();

        String connectionString = "jdbc:h2:~/humankind.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";

        Sql2o sql2o = new Sql2o(connectionString, "", "");
        philanthropicDao = new Sql2oPhilanthropicDao(sql2o);
        conn = sql2o.open();

        //Post new Philanthropic Business data to API endpoint
        post("/philanthropics/new", "application/json" ,(req, res) -> {
        Philanthropic philanthropic = translater.fromJson(req.body(), Philanthropic.class);
        philanthropicDao.add(philanthropic);
        res.status(201);
        return translater.toJson(philanthropic);
        });

        //Get all Philanthropic Business data to API endpoint
        get("/philanthropics", "application/json", (req,res) -> {
            return translater.toJson(philanthropicDao.getAll());

        });

        //Get specific Philanthropic Business data to API endpoint
        get("/philanthropics/:id", "application/json", (req, res) -> {
            int philanthropicId = Integer.parseInt(req.params("id"));
            Philanthropic philanthropic = philanthropicDao.findById(philanthropicId);
//            if (philanthropic == null){
//                throw new ApiException(404, String.format("No restaurant with id: %d exists", restaurantId));
//            }
            return translater.toJson(philanthropic);
        });




        //Filter
    after((req,res)->{
        res.type("application/json");

        });


//
    }
}
