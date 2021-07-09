package endpoints;
import models.requests.Login;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Endpoints {

    public static Response loginSuccess(Login login) {
        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");
        Response response = request.body(login).post("http://127.0.0.1:9090/user/login");
        return response;
    }
}
