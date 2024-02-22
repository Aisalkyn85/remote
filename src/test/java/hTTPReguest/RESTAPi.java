package hTTPReguest;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class RESTAPi {
    /* Gherkin language
     * given()
     * content type, set cookies, add auth, add param, set headers
     *
     * when()
     * get, post, put, delete
     *
     * then()
     * validate status code, extract response, extract headers cookeis & response body
     * */
    int id;

        @Test(priority=1)
        void getUsers () {


            given()
                    .when()

                    .get("https://reqres.in/api/users?page=2")
                    .then()
                    .statusCode(200)
                    .body("page", equalTo(2))
                    .log().all();

            }

            @Test(priority=2)
                void createUser(){
            HashMap data = new HashMap();
            data.put("name","Dana");

            id=given()
                    .contentType("application/json")
                    .body(data)

                    .when()
                    .post("https://reqres.in/api/users")
                    .jsonPath().getInt("id");

                }

                @Test(priority=3,dependsOnMethods= {"createUser"})
    void Update(){
                    HashMap data = new HashMap();
                    data.put("name","Ken");

                    given()
                            .contentType("application/json")
                            .body(data)

                            .when()
                                    .put("https://reqres.in/api/users"+id)

                                    .then()
                                    .statusCode(200)
                                    .log().all();

    }

    @Test(priority=4)
    void delete(){
            given()
                    .when()
                    .delete("https://reqres.in/api/users"+id)
                    .then()
                    .statusCode(204)
                    .log().all();

    }

        }

