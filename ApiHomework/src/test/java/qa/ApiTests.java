package qa;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTests {

    @Test
    public void getAvailablePetsReturns200() {
        Response response = given()
                .baseUri("petstore.swagger.io/v2")
                .queryParam("status", "available")
                .when()
                .get("/pet/findByStatus");

        Assert.assertEquals(response.statusCode(), 200,
                "GET /pet/findByStatus should return 200");
    }

    @Test
    public void createPostAndCheckTitle() {
        Post requestPost = new Post("QA API Test", "Testing POST with Rest Assured", 1);

        Response response = given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .contentType(ContentType.JSON)
                .body(requestPost) // Jackson serializes Java object into JSON
                .when()
                .post("/posts");

        Assert.assertEquals(response.statusCode(), 201,
                "POST /posts should return 201 Created");

        Post responsePost = response.as(Post.class); // JSON -> Java object
        Assert.assertEquals(responsePost.title, requestPost.title,
                "Response title should match request title");
        Assert.assertEquals(responsePost.body, requestPost.body);
        Assert.assertEquals(responsePost.userId, requestPost.userId);
    }
}
