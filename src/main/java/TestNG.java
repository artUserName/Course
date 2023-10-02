import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class TestNG {
    @Test
    public void testGetUser(){
    given().baseUri("https://regres.in");
    }



}
