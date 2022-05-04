package com.example.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String FIRST_NAME = "First name";
    private final String LAST_NAME = "Last name";

    @FindBy(id = "first-name") // used to find a web element in this case "first-name".
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(xpath = "//a[contains(text(),'Submit')]") //used instead of id. Find any link that contain submit.
    private WebElement submit_button;

    //constructor
    public WebForm(WebDriver driver) {
        super(driver);
    }

    // methods for entering first name, last name and press submit button.

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }
}
