package com.webOrdersApp.tests;

import com.webOrdersApp.pages.LoginPage;
import com.webOrdersApp.tests.testBase.TestBase;
import com.webOrdersApp.utilities.Driver;
import org.testng.annotations.Test;

public class Test1 extends TestBase {

    @Test
    public void Test(){
        LoginPage obj = new LoginPage();
        obj.login();
    }

    @Test
    public void Test2(){
        LoginPage manualLogin = new LoginPage();
        manualLogin.login("User","password");

    }

}
