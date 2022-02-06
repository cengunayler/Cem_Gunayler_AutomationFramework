package de.fashionette.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersönlicheDatenPage extends BasePage {


    @FindBy(xpath="//div[@class='account-personaldata']/a")
    public WebElement persönlicheDaten;

    @FindBy(xpath="(//div[@class='account--address__action account--address__action--update'])[1]")
    public WebElement bearbeiten;

    @FindBy(xpath="//input[@name='first_name']")
    public WebElement firstName;

    @FindBy(xpath="//input[@name='last_name']")
    public WebElement lastName;

    @FindBy(xpath="//div[@class='account--address__action account--address__action--save']")
    public WebElement speichern;

    @FindBy(xpath="//div[@zipcode-mask='99999']/div[2]")
    public WebElement newFullName;












}
