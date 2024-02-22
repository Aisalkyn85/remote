import io.restassured.RestAssured;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetValidation {
    @Test
    public void getMethod(){
        RestAssured.baseURI = "https://tosca-webservice-ng.azurewebsites.net";
        Response response = RestAssured.when().
                get("/api/Coffees_V4/1").
                then().
                extract().response();
        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.statusCode(),200);

    }
}
