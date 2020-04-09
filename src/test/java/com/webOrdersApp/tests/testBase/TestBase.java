package com.webOrdersApp.tests.testBase;

import com.webOrdersApp.utilities.ConfigurationReader;
import com.webOrdersApp.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    @BeforeMethod
    public void setup(){
        String url = ConfigurationReader.getProperty("url");

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get(url);
    }

    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }

}
