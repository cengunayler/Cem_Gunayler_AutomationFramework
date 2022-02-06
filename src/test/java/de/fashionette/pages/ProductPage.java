package de.fashionette.pages;

import de.fashionette.utilities.BrowserUtils;
import de.fashionette.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public WebElement productSelect(String productName) {


        return Driver.get().findElement(By.xpath("//div[contains(text(),'"+productName+"')]"));

    }

    public WebElement productColour(String colour) {

       // BrowserUtils.waitForVisibility(Driver.get().findElement(By.xpath("//a[@title='"+colour+"']")),10);
        return Driver.get().findElement(By.xpath("//a[@title='"+colour+"']"));


    }

    public WebElement productSize(String size) {


        return Driver.get().findElement(By.xpath("//span[text()='"+size+"']"));

    }

    @FindBy(xpath="(//div[contains(text(),'In den Warenkorb')])[2]")
    public WebElement indenWarenKorbBtn;




}