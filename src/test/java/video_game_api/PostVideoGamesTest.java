package video_game_api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostVideoGamesTest  extends  BaseAPITest{
    @Test
    public void createAVideoGame() {

        given()
                .body(
                        """
                                {
                                  "category": "Platform",
                                  "name": "Mario",
                                  "rating": "Mature",
                                  "releaseDate": "2012-05-04",
                                  "reviewScore": 85
                                }      
                                """
                ).log().all()
                .when().post("/v2/videogame")
                .then()
                .log().all();
    }
}
