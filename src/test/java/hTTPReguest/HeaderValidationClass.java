package hTTPReguest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HeaderValidationClass {
    public static void main(String[] args) {
        RestAssured.baseURI="http://webservice.toscacloud.com/rest/api/Coffees_V2";
       // Response response = RestAssured.given()
               // .contentType(ContentType.JSON).
               // .header("")
    }

}
