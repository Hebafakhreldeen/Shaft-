package api.testfullApi.opjectModels;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;

public class mainApi_api {

    private RestActions apiDriver;

    public mainApi_api(RestActions apiDriver){
        this.apiDriver=apiDriver;
    }


    public void getTest() {
       apiDriver.buildNewRequest("api/users/2", RestActions.RequestType.GET).setContentType(ContentType.JSON).perform();

}
}


