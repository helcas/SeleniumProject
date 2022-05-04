package com.example.seleniumproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory; // separates the test objects from the test scripts. Implements the
//the page object model that allows us to create separate classes for different pages on the website.

// allows us to create test pages with the same mechanism behind it
    public class PageObject {
        protected WebDriver driver;

        //constructor
        public PageObject(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
            //PageFactory is a class that implements the Page Object model.
            // initElements is used to initialize web elements.
        }
    }

