package com.Btrix24.step_definitions;

import com.Btrix24.pages.LoginPage;
import com.Btrix24.pages.tasksPage;
import com.Btrix24.utilities.BrowserUtils;
import com.Btrix24.utilities.ConfigurationReader;
import com.Btrix24.utilities.Driver;
import com.github.javafaker.Faker;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tasksStepDefs  {

    @When("I login as a {string}")
    public void i_login_as_a(String user) throws InterruptedException {
        String username = ConfigurationReader.get("User_username");
        String password = ConfigurationReader.get("User_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }
    @Then("I navigate to {string}")
    public void i_navigate_to(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        tasksPage tasksPage= new tasksPage();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='menu-item-link-text'][contains(text(),'Tasks')]")));
        tasksPage.task.click();

    }
    @Then("I create a new task")
    public void i_create_a_new_task() {
        tasksPage tasksPage = new tasksPage();
        tasksPage.newTask.click();
        BrowserUtils.waitFor(2);
    }
    @Then("I add new tasks name")
    public void i_add_new_tasks_name() {
        tasksPage tasksPage = new tasksPage();
        tasksPage.addTask.click();
        BrowserUtils.waitFor(2);
        Faker faker = new Faker();
        String taskname = faker.artist().name();
        tasksPage.addTask.sendKeys(taskname);
    }

}