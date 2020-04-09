package com.webOrdersApp.pages;

import com.webOrdersApp.pages.PageBase.PageBase;
import com.webOrdersApp.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    @FindBy(id="ctl00_MainContent_username")
    private WebElement username;

    @FindBy(id="ctl00_MainContent_password")
    private WebElement password;

//    @FindBy(id="ctl00_MainContent_status")
//    private WebElement invalidCredentials;
//    public String getInvalidCredentialsText(){
//
//    }

    //manual
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password, Keys.ENTER);
    }

    //automatic login
    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"),Keys.ENTER);
    }

}
