package com.Btrix24.pages;

import com.Btrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tasksPage {
    public tasksPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@class='menu-item-link-text'][contains(text(),'Tasks')]")
    public WebElement task;
    @FindBy(xpath = "//*[@id='tasks-buttonAdd']")
    public WebElement newTask;

    @FindBy(xpath = "//*[@name='ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement addTask;

}