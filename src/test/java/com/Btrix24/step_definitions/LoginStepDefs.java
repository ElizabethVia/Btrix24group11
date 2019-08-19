package com.Btrix24.step_definitions;

import com.Btrix24.pages.LoginPage;
import com.Btrix24.utilities.BrowserUtils;
import com.Btrix24.utilities.ConfigurationReader;
import com.Btrix24.utilities.Driver;
import cucumber.api.java.en.Given;

public class LoginStepDefs {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("Opening the login page");
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
        String username= ConfigurationReader.get("User_username");
        String password = ConfigurationReader.get("User_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
        BrowserUtils.waitFor(2);
    }


}
