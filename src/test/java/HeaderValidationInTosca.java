import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HeaderValidationInTosca {
    public static void main(String[] args) {
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest/api/Coffees_V2";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
               .header("Authorization","Bearer db90cbec-8211-42f8-97ca-dd33eb82edfc")

                .when()
                .get()

                .then()
                .extract().response();

        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());
    }
}
// http://webservice.toscacloud.com/rest/swagger/ui/index#/