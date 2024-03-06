package video_game_api;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class VideoGamesTest {
    String baseURL = "https://videogamedb.uk:443";

    @Test
    public void getAllListOfGames() {

        given().baseUri(baseURL).contentType("application/Json")
                .log().all()
                .when().get("/api/videogame/")
                .then().statusCode(200)
                .log().all();

    }

    @Test
    public void getAVideoGame() {
        String baseURL = "https://videogamedb.uk:443";
        given().baseUri(baseURL).contentType("application/Jason")
                .queryParam("id", 4)
                .log().all()
                .when().get("api/videogame/4")
                .then().statusCode(200)
                .log().all();

    }

    @Test
    public void createAVideoGame() {
        String baseURL = "https://videogamedb.uk:443";
        given().baseUri(baseURL).contentType("application/Json")
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
                .when().post("/api/v2/videogame")
                .then().statusCode(200)
                .log().all();
    }

    @Test
    public void updateAVideoGame() {
        String baseURL = "https://videogamedb.uk:443";
        given().baseUri(baseURL).contentType("application/Json")
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
                .when().put("/api/v2/videogame/10")
                .then().statusCode(200)
                .log().all();


    }
    @Test
    public void deleteAVideoGame() {
        String baseURL = "https://videogamedb.uk:443";
        given().baseUri(baseURL).contentType("application/Json")
                .queryParam("id",5)
                .log().all()
                .when().delete("/api/v2/videogame/5")
                .then().statusCode(200)
                .log().all();
    }
}