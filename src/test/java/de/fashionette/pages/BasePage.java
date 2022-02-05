package de.fashionette.pages;

import de.fashionette.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class  BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void menuNavigation (String tab, String module) {

        String tabLocator = "( //a[@title='" + tab + "'])[1]";

        String moduleLocator = "//a[@title='"+module+"']";
    }

    @FindBy(xpath="//a[@title='Einloggen']")
    public WebElement loginIcon;

    @FindBy(xpath="//span[@title='Zum Warenkorb']")
    public WebElement warenKorbIcon;
}
