package com.example.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

// the test class  that connect all classes together.
public class TestPlan {

    @BeforeSuite
    public static void main(String[] args) {

        //from the Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
            }

            @Test
            public static void submitForm(){
                driver.get(Utils.BASE_URL); // get the URL that we will work from in this case Formy.
                WebForm webForm = new WebForm(driver);
                webForm.enterFirstName(); // methods from the WebForm class
                webForm.enterLastName();
                webForm.pressSubmitButton();
            }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
