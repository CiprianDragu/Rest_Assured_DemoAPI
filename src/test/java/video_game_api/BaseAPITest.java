package video_game_api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import org.junit.jupiter.api.BeforeEach;

public class BaseAPITest {
    @BeforeEach
    public void setUP() {
//        RestAssured.baseURI = "https://videogamedb.uk:443";
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://videogamedb.uk:443")
                .setBasePath("/api")
                .setContentType("application/Json")
                .build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

}
