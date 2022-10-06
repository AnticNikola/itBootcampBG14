package api.petStore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;


public class RestAssuredHelloWorld {
    @BeforeMethod
    public void seturl()
    {
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/";
    }
    @Test
    public void postPetTestHappyPath(){
        String requestBody = "{\n" +
                "    \"id\" : \"1\",\n" +
                "    \"name\" : \"kuca\",\n" +
                "    \"status\" : \"available\",\n" +
                "    \"photoUrls\" : [\"https://www.mydog.com/\", \"https://www.mydog2.com/\"],\n" +
                "    \"tags\" : [\n" +
                "        {\"id\" : \"1\", \"name\" : \"myTag1\"},\n" +
                "        {\"id\" : \"2\", \"name\" : \"myTag2\"}\n" +
                "    ]\n" +
                "}";


        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/")
                .then()
                .extract().response();
        Assert.assertEquals(response.statusCode(), 200, "status code should be 200");
        Assert.assertEquals(response.jsonPath().getString("id"), "1", "id should be 1");
        Assert.assertEquals(response.jsonPath().getString("name"), "kuca", "name should be kuca");
        Assert.assertEquals(response.jsonPath().getString("status"),
                "available", "status should be available");
        Assert.assertEquals(response.jsonPath().getString("photoUrls"),
                Arrays.toString(new String[]{"https://www.mydog.com/", "https://www.mydog2.com/"}),
                "photos urls should match");
        Assert.assertEquals(response.jsonPath().getString("tags"),
                Arrays.deepToString(new String[][]{
                        new String[]{"id:1", "name:myTag1"}, //prvi red matrice
                        new String[]{"id:2", "name:myTag2"}  //drugi red matrice
                }),
                "tags objects array should match");

    }
    @Test
    public void getPetHappyPath(){

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/pet/6")
                .then()
                .extract().response();

//        Assert.assertEquals(response.getStatusCode(),200,"status code should be 200");
//        System.out.println(response.getBody().print());
    }
}
