package techproed.stepDefinition.DB_Step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import techproed.pojos.US25AdminOgrenciEkleme.ObjectPojo;
import techproed.pojos.US25AdminOgrenciEkleme.Postpojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class DB_US25 {

    static int id;

    ObjectPojo objectPojo = new ObjectPojo();
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    static Postpojo expectedData;
    @Given("Kayitli ogrencinin UserId bilgisi ile sorgu yapilir")
    public void kayitli_ogrencinin_userid_bilgisi_ile_sorgu_yapilir() throws SQLException {

        int id= ObjectPojo.id();
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * from dean where id = "+id+"");
        resultSet.next();
    }

    @Then("Ogrenci bilgilerinin database dogrulamasi yapilir")
    public void ogrenci_bilgilerinin_database_dogrulamasi_yapilir() throws SQLException {
        resultSet.next();

        Postpojo expectedData = new Postpojo();
        expectedData = new Postpojo(930,"2000-02-13", "123","231@e123","31412","MALE","41124","213","AdminTeam02.","345-343-3452","56-34-2314", "2131", "43144");
        if (resultSet.next()){
        assertEquals (expectedData.getUsername(), resultSet.getString("username"));
        assertEquals(expectedData.getSsn(), resultSet.getString("ssn"));
        assertEquals(expectedData.getName(), resultSet.getString("name"));
        assertEquals(expectedData.getSurname(), resultSet.getString("surname"));
        assertEquals(expectedData.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(expectedData.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(expectedData.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(1, resultSet.getInt("gender"));
        assertEquals(expectedData.getMotherName(), resultSet.getString("mother_name"));
        assertEquals(expectedData.getFatherName(), resultSet.getString("father_name"));
        //assertEquals(expectedData.getStudentNumber(),resultSet.getInt("student_number"));
        assertEquals(expectedData.getAdvisorTeacherId(),resultSet.getInt("advisor_teacher_id"));
        //assertEquals(expectedData.getAdvisorTeacherName(),resultSet.getString("advisor_teacher_name"));
        //assertEquals(expectedData.getAdvisorTeacherSurname(),resultSet.getString("advisor_teacher_surname"));
        //assertEquals(expectedData.getEmail(),resultSet.getString("email"));
        //assertEquals(expectedData.isActive(),resultSet.getBoolean("is_active"));

        String deger = resultSet.getString("username");
        }

        connection.close();
        statement.close();
        resultSet.close();

    }

}


