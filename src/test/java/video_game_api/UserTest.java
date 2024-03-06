package video_game_api;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UserTest {
    String baseURL = "https://videogamedb.uk:443";

    @Test
    public void authoriseUser() {
        given().baseUri(baseURL).contentType("application/json")
                .body(
                        """
                                {
                                  "password": "admin",
                                  "username": "admin"
                                }     
                                """
                ).log().all()
                .when().post("/api/authenticate")
                .then().statusCode(200).log().all();

    }
}
