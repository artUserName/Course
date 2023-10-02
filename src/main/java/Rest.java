import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Rest {
/*
        private UserResponse response;
        private RegisteredUsesResponse newUser;
*/

        @Test
        public void testGetUser() {
//        Response response =
                given().
                    baseUri("https://regres.in").
        when().
                log().all().
                get("/api/users/2").
//            System.out.printf("Status code: %s\n", response.getStatusCode());
//            System.out.printf("Response: %s\n", response.asString());
        then().assertThat().
                        statusCode(200).
                        body("data.id", Matchers.equalTo(2));

/*        then().
                log().all();*/

/*        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getInt("data.id"), 2);*/

        }

    }

