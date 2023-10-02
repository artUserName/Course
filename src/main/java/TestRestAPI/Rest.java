package TestRestAPI;

import io.restassured.http.ContentType;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;



public class Rest {
        private UserResponse response;
        private RegisteredUsesResponse newUser;

    @Test
    public void testGetUser() {
        given().
                baseUri("https://demoqa.com").
                when().
                log().all().
                get("/books").
        then().assertThat().
                statusCode(200);

    }

    @Test
    public void registerUser(){
        HashMap<String, String> user = new HashMap<>();
        user.put("userName", "user" + RandomStringUtils.random(5,true,true));
        user.put("password", "Pa$$w0rd");

        newUser = (RegisteredUsesResponse) given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("https://demoqa.com/Account/v1/User")
                .then()
                .log().all()
                .assertThat()
                .statusCode(201)
                .extract()
                .as(RegisteredUsesResponse.class);
        System.out.println(newUser);
    }
}
