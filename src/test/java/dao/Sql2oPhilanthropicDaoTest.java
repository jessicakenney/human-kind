package dao;

import dataModels.Philanthropic;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Sql2oPhilanthropicDaoTest {

  private Sql2oPhilanthropicDao philanthropicDao;
  private Connection conn;

  public Philanthropic getTestPhilanthropic() {
    String name = "ChaChaCha";
    String type = "Restaurant";
    double latitude = 45.50;
    double longitude = -122.644;
    String charities = "Yes";
    double annualContribution = .04;
    return new Philanthropic(name, type, latitude, longitude, charities, annualContribution);
  }


  public Philanthropic getTestPhilanthropic2() {
    String name = "place2";
    String type = "hobbystore";
    double latitude = 45.00;
    double longitude = -123.333;
    String charities = "Maybe";
    double annualContribution = .06;
    return new Philanthropic(name, type, latitude, longitude, charities, annualContribution);
  }


  @Before
  public void setUp() throws Exception {
    String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
    Sql2o sql2o = new Sql2o(connectionString, "", "");
    philanthropicDao = new Sql2oPhilanthropicDao(sql2o);
    conn = sql2o.open();
  }

  @After
  public void tearDown() throws Exception {
    conn.close();
  }

  @Test
  public void addingEventSetsId() throws Exception {
    Philanthropic philanthropic = getTestPhilanthropic();
    philanthropicDao.add(philanthropic);
    assertEquals(1, philanthropic.getId());
  }

  @Test
  public void existingPhilanthropicsCanBeFoundById() throws Exception {
    Philanthropic philanthropic = getTestPhilanthropic();
    philanthropicDao.add(philanthropic);
    Philanthropic foundPhilanthropic = philanthropicDao.findById(philanthropic.getId());
    assertEquals(philanthropic, foundPhilanthropic);
  }

  @Test
  public void getAll_allPhilanthropicsAreFound() throws Exception {
    Philanthropic philanthropic = getTestPhilanthropic();
    Philanthropic anotherPhilanthropic = getTestPhilanthropic2();
    philanthropicDao.add(philanthropic);
    System.out.println("DEBUG-->"+philanthropic.getLatitude());
    philanthropicDao.add(anotherPhilanthropic);
    System.out.println("DEBUG-->"+anotherPhilanthropic.getLongitude());
    List<Philanthropic> getThem = philanthropicDao.getAll();
    int number = getThem.size();
    assertEquals(2, number);
  }

  @Test
  public void getAll_noPhilanthropicsAreFound() throws Exception {
    int number = philanthropicDao.getAll().size();
    assertEquals(0, number);
  }

}





