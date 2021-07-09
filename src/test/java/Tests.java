import endpoints.Endpoints;
import io.restassured.response.Response;
import models.requests.Login;
import org.junit.Test;
import steps.AurhSteps;

public class Tests {
    private static Response response;

    @Test
    public void successfulTest() {
        Login authRequest = new Login("Hello", "Hello");
        response = Endpoints.loginSuccess(authRequest);
        AurhSteps aurhSteps = new AurhSteps(response);
        aurhSteps.ValidateResponse();
    }
}
