import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetCofeeRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://tosca-webservice-ng.azurewebsites.net/api/Shops_V4/api/Shops/1/Coffees";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)

                .when()
                .get()

                .then()

                .extract().response();
        System.out.println(response.asPrettyString());
    }
}
