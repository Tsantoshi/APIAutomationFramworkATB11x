package com.thetestingacademy.tests.crud;

import com.thetestingacademy.base.BaseTest;
import com.thetestingacademy.enpoints.APIConstants;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestCreateToken extends BaseTest {

    @Test(groups = "reg", priority = 1)
    @Description("TC#2  - Create Token and Verify")
    @Owner("Santoshi")
    public void testTokenPost(){
        // Prep of Req
        requestSpecification.basePath(APIConstants.AUTH_URL);

        // Making of the Request.
        response = RestAssured.given(requestSpecification)
                .when().body(payloadManager.setAuthPayload()).post();

        // Extraction ( JSON String response to Java Object)
        String token = payloadManager.GetTokenFromJson(response.asString());
        System.out.println(token);

        // Validation of the request.
        assertActions.verifyStringKeyNotNull(token);

    }
}
