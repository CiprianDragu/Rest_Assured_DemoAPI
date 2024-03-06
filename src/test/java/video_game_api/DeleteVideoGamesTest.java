package video_game_api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DeleteVideoGamesTest extends BaseAPITest {

    @Test
    public void deleteAVideoGame() {

        given()
                .queryParam("id", 5)
                .log().all()
                .when().delete("/v2/videogame/5")
                .then()
                .log().all();
    }
}
