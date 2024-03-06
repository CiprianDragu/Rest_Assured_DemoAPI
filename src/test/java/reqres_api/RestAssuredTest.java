package reqres_api;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredTest {
    String baseURL = "https://reqres.in/";

    @Test
    public void getListOfUsersTest() {
        given().baseUri(baseURL).queryParam("page", 2)
                .when().get("api/users")
                .then().statusCode(200).log().all();

    }

    @Test
    public void getUserNameTest() {
        given().baseUri(baseURL).log().all()
                .when().get("api/users/2")
                .then().statusCode(200).log().all();

    }
}
