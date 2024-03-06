package video_game_api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetVideoGamesTest  extends  BaseAPITest{
    @Test
    public void getAllListOfGames() {

        given()
                .log().all()
                .when().get("/videogame/")
                .then()
                .log().all();

    }

    @Test
    public void getAVideoGame() {
        given()
                .queryParam("id", 4)
                .log().all()
                .when().get("/videogame/4")
                .then()
                .log().all();

    }

}
