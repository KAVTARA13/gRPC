package steps;

import io.restassured.response.Response;
import junit.framework.Assert;
import models.responses.Login;

public class AurhSteps {

    private static Response response;

    public AurhSteps (Response response) {
        this.response = response;
    }

    public static void ValidateResponse (){
            Login responseBody = response.body().as(Login.class);
            Assert.assertEquals("Missing password", responseBody.responsemessage);
    }
}
