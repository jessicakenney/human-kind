package dao;

import dataModels.Philanthropic;

import java.util.List;

public interface PhilanthropicDao {

    //Create
    void add(Philanthropic philanthropic);

    //Read
    Philanthropic findById(int id);
    List<Philanthropic> getAll();
    //List<Philanthropic> getAllObjectsByAnIdOfSomething(int id);

    //Update
    //void update(int id, Type1 var1, Type2 var2);

    //Delete
    //void deleteById(int id);
  }
