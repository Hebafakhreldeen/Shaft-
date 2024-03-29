import api.testfullApi.opjectModels.mainApi;
import api.testfullApi.opjectModels.mainApi_api;
import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;

import static api.testfullApi.opjectModels.mainApi.BASE_URL;

public class testfullApi {
    private RestActions apiDriver;
    private mainApi restApi;
    private mainApi_api restApi_api;

    @BeforeClass
    @Test
    public void postTest() {
        RestActions apiDriver = DriverFactory.getAPIDriver(BASE_URL);
        restApi = new mainApi(apiDriver);
        restApi.postTest("morpheus", "leader");


    }

    @Test
    public void putTest() {
        RestActions apiDriver = DriverFactory.getAPIDriver(BASE_URL);
        restApi = new mainApi(apiDriver);
        restApi.putTest("morpheus", "zion resident");
    } @Test
    public void  getTest() {
        RestActions apiDriver = DriverFactory.getAPIDriver(BASE_URL);
        restApi_api = new mainApi_api(apiDriver);
        restApi_api.getTest();
    }
}