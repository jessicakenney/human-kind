package dao;

import dataModels.Business;
import dataModels.Philanthropic;
import dataModels.SocialEnterprise;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oPhilanthropicDao implements PhilanthropicDao {
    private final Sql2o sql2o;


    public Sql2oPhilanthropicDao (Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Philanthropic philanthropic) {
        String sql = "INSERT INTO philanthropics (name,type,latitude,longitude,charities,annualContribution) VALUES (:name,:type,:latitude,:longitude,:charities,:annualContribution)"; //raw sql
        try (Connection con = sql2o.open()) { //try to open a connection
            int id = (int) con.createQuery(sql) //make a new variable
                    .bind(philanthropic)
                    .executeUpdate()
                    .getKey();
            philanthropic.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Philanthropic> getAll(){
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM philanthropics")
                    .executeAndFetch(Philanthropic.class);
        }
    }

    @Override
    public Philanthropic findById(int id) {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM philanthropics WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Philanthropic.class);
        }
    }




}
