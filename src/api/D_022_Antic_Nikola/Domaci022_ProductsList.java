package api.D_022_Antic_Nikola;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Domaci022_ProductsList {
    @BeforeMethod
    public void setUrl() {
        RestAssured.baseURI = "https://automationexercise.com/api/productsList";
    }

    @Test
    public void getAllProducts() {
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
    public void postToAllProductsUnhappyPath() {
        String requestBody = "{\n" +
                "            \"id\": 1,\n" +
                "            \"name\": \"Blue Top\",\n" +
                "            \"price\": \"Rs. 500\",\n" +
                "            \"brand\": \"Polo\",\n" +
                "            \"category\": {\n" +
                "                \"usertype\": {\n" +
                "                    \"usertype\": \"Women\"\n" +
                "                },\n" +
                "                \"category\": \"Tops\"\n" +
                "            }\n" +
                "        },";

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/")
                .then()
                .extract().response();
        Assert.assertEquals(response.statusCode(), 404, "status code should be 404");
    }
}

