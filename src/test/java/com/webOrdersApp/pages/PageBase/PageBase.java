package com.webOrdersApp.pages.PageBase;

import com.webOrdersApp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    public PageBase(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

//    @FindBy(id="ctl00_MainContent_username")
//    private WebElement userName;


}
