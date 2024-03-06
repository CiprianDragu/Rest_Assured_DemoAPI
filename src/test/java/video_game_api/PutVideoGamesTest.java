package video_game_api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PutVideoGamesTest  extends  BaseAPITest{
    @Test
    public void updateAVideoGame() {

        given()
                .queryParam("id", 0)
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
                .when().put("/v2/videogame/10")
                .then()
                .log().all();


    }
}
