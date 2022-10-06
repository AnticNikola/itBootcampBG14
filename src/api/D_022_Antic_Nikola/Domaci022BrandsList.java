package api.D_022_Antic_Nikola;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Domaci022BrandsList {
    @BeforeMethod
    public void setUrl(){
        RestAssured.baseURI="https://automationexercise.com/api/brandsList";
    }
    @Test
    public void getAllBrands(){
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .extract().response();
        System.out.println(response.getBody().print());
        Assert.assertEquals(response.statusCode(), 200, "status code should be 200");
    }
    @Test
    public void PutToAllBrands(){
        String requestBody="{\n" +
                "            \"id\": 1,\n" +
                "            \"brand\": \"Nike\"\n" +
                "        }";
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .put("/brands/1")
                .then()
                .extract().response();

        System.out.println(response.statusCode());
        Assert.assertEquals(response.statusCode(), 404, "status code should be 404");
    }
}
