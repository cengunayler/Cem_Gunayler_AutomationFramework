package de.fashionette.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath="//div[@class='cart-item--brand']")
    public WebElement model;

    @FindBy(xpath="//div[@class='cart-item--name']")
    public WebElement colour;

    @FindBy(xpath="//div[@class='cart-item--size']")
    public WebElement size;


}
