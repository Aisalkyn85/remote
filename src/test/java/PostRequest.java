import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PostRequest {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://tosca-webservice-ng.azurewebsites.net/api/Coffees_V4";
        String rbody = """
                {
                  "Description": "Example Post Request AJ",
                  "Name": "AJ"
                }""";
//        Response response = RestAssured.given().
//                contentType(ContentType.JSON).
//                and().body(rbody).
//                when().
//                post().
//                then().
//                extract().response();
//        System.out.println(response.statusCode());
//        System.out.println(response.asPrettyString);
//
//
      Response postResponse = RestAssured.given().
                contentType(ContentType.JSON).
                and().body(rbody).
                when().
                post().
                then()
              .body("description",containsString("Example Post Req"))
            .body("name",containsString("AJ"))
              .extract().response();


        System.out.println(postResponse.asPrettyString());
      int id = postResponse.jsonPath().getInt("id");
        System.out.println(id);

      Response getResponse = RestAssured.given().
              then().
              when().get("/"+id)
              .then().extract().response();
        System.out.println(getResponse.asPrettyString());



    }
}