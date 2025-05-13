package com.thetestingacademy.base;

import com.thetestingacademy.asserts.AssertActions;
import com.thetestingacademy.enpoints.APIConstants;
import com.thetestingacademy.modules.PayloadManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    // CommonToAll Testcase
    //   // Base URL, Content Type - json - common

    public RequestSpecification requestSpecification;
    public Response response;
    public ValidatableResponse validatableResponse;
    public AssertActions assertActions;
    public PayloadManager payloadManager;
    public JsonPath jsonPath;

    @BeforeTest
    public void setup(){

        System.out.println("Staring the Test");
        payloadManager = new PayloadManager();
        assertActions = new AssertActions();


        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(APIConstants.Base_URL)
                .addHeader("Content-Type", "application/json")
                .build().log().all();

    }
    @AfterTest
    public void tear_Down(){
        System.out.println("Finishing test!");
    }

}
