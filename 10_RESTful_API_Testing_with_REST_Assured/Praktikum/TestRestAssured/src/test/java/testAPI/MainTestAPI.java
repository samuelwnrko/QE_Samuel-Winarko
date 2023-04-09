package testAPI;

import org.apache.commons.codec.digest.UnixCrypt;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

class MainTestAPI {
    @Test
    void getAllPosts(){
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
        .when() .log().all() //log untuk request
                .get("/posts")
        .then() .log().all() //log untuk response
                .statusCode(200)
                .time(lessThan(1000L))
                .body(matchesJsonSchemaInClasspath("allpostschema.json"));
    }
    @Test
    void createNewPost(){
        int userId = 2;
        String title = "test buat postingan";
        String body = "ini adalah postingan";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("userId", userId);
        bodyRequest.put("id", 101);
        bodyRequest.put("title", title);
        bodyRequest.put("body", body);
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type","application/json")
                .body(bodyRequest)
                .when() .log().all() //log untuk request
                .post("/posts")
                .then() .log().all() //log untuk response
                .statusCode(201)
                .body("id",equalTo(101))
                .body("userId",equalTo(userId))
                .body("title",equalTo(title))
                .body("body",equalTo(body))
                .body(matchesJsonSchemaInClasspath("membuatpostschema.json"));
    }
    @Test
    void SpesificPost(){
        int postId = 1;
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when() .log().all() //log untuk request
                .get("/posts/"+postId)
                .then() .log().all() //log untuk response
                .statusCode(200)
                .body("id", equalTo(1))
                .body(matchesJsonSchemaInClasspath("membuatpostschema.json"));
    }
    @Test
    void editPost(){
        int userId = 2;
        int postId = 1;
        String title = "test buat postingan";
        String body = "ini adalah postingan";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("userId", userId);
        bodyRequest.put("title", title);
        bodyRequest.put("body", body);
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type","application/json")
                .body(bodyRequest)
                .when() .log().all() //log untuk request
                .put("/posts/"+postId)
                .then() .log().all() //log untuk response
                .statusCode(200)
                .body("id",equalTo(postId))
                .body("userId",equalTo(userId))
                .body("title",equalTo(title))
                .body("body",equalTo(body))
                .body(matchesJsonSchemaInClasspath("membuatpostschema.json"));
    }
    @Test
    void deletePost() {
        int postId = 1;
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when().log().all()
                .delete("/posts/" + postId)
                .then().log().all()
                .statusCode(200);
    }

}
