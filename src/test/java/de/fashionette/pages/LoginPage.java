package de.fashionette.pages;

import de.fashionette.utilities.BrowserUtils;
import de.fashionette.utilities.ConfigurationReader;
import de.fashionette.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="//span[@class='icon icon--user']")
    public WebElement loginBtn;

    @FindBy(xpath="//input[@name='email']")
    public WebElement email;

    @FindBy(xpath="//input[@name='password']")
    public WebElement password;

    @FindBy(xpath="(//button[@type='submit'])[1]")
    public WebElement einloggen;


    public void login() throws InterruptedException {

       // BrowserUtils.waitForVisibility(email, 10);
        Thread.sleep(3000);
        email.sendKeys(ConfigurationReader.get("email"));
        password.sendKeys(ConfigurationReader.get("password"));
        einloggen.click();
    }


}
