package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {

    @Test
    void testNetwork() {
        given()
                .baseUri("https://postman-echo.com")
                .body("ru.netology")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("ru.netology"));
    }
}
