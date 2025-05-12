package com.thetestingacademy.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    // Create A Booking, Create a Token
    // Verify that Get booking -
    // Update the Booking
    // Delete the Booking


    @Owner("Santoshi")
    @Test(groups = "QA", priority = 1)
    @Description("TC#INT1 - Step 1. Verify that the Booking can be Created")
    public void testCreatBooking(){
        Assert.assertTrue(true);
    }

    @Owner("Santoshi")
    @Test(groups = "QA", priority = 2)
    @Description("TC#INT1 - Step 2. Verify that the Booking By ID")
    public void testVerifyBookinID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Owner("Santoshi")
    @Description("TC#INT1 - Step 3. Verify Updated Booking by ID")
    public void estUpdateBookingByID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Owner("Santoshi")
    @Description("TC#INT1 - Step 4. Delete the Booking by ID")
    public void testDeleteBookingById(){
        Assert.assertTrue(true);
    }
}
