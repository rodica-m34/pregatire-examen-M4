package ro.tefacprogramator.m4.serialeonline;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SeriesTests {
    
    @Test
    public void shouldGetAllSeries() {

        Response response = RestAssured.given()
            .when()
            .get("http://localhost:8080/series/getAll");


        String text = response.asString();
        System.out.println("text = " + text);

        response.then().body("size()", Matchers.greaterThan(1));
        response.then().body("[0].name", Matchers.equalTo("House MD"));

    }

    @Test
    public void shouldAddANewSeries() {
        String newSeries = "{\"name\": \"Rest assured\", \"numberOfSeasons\": 20, \"idCategory\": 1, \"idPlatform\": 2}";

        Response response = RestAssured.given()
            .body(newSeries)
            .contentType(ContentType.JSON)
            .when()
            .post("http://localhost:8080/series/add");

        String text = response.asString();
        System.out.println("text = " + text);

        response.then().body("success", Matchers.equalTo(true));
    }

    
    @Test
    public void shouldGetANewCategory() {
        Response response = RestAssured.given()
            .pathParam("categoryName", "Drama")    
            .when()
            .get("/series/getByCategory/{categoryName}");


        String text = response.asString();
        System.out.println("text = " + text);


    }
}
