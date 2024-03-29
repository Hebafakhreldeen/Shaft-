package api.testfullApi.opjectModels;

import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

public class mainApi {
    private RestActions apiDriver;
    public static final String BASE_URL="https://reqres.in/";
    public static final int SUCESS=200;
    public static final int SUCESS_DELETE=201;
    public mainApi(RestActions apiDriver)
    {
        this.apiDriver=apiDriver;
    }
    public void postTest(String name,String job){
        JSONObject creatBody = new JSONObject();
        creatBody.put("name", name);
        creatBody.put("job", job);
        apiDriver.buildNewRequest("api/users", RestActions.RequestType.POST).setContentType(ContentType.JSON)
                .setRequestBody(creatBody).perform();
    }

    public void putTest(String name,String job) {
        JSONObject creatBody = new JSONObject();
        creatBody.put("name", name);
        creatBody.put("job", job);
        apiDriver.buildNewRequest("api/users/2", RestActions.RequestType.PUT).setContentType(ContentType.JSON)
                .setRequestBody(creatBody).perform();
        }
}


