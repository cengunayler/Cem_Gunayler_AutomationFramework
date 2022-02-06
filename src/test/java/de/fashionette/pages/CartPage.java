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

    @FindBy(xpath="//a[@class='cart__sum__voucher-link']")
    public WebElement gutscheinCodeIcon;

    @FindBy(xpath="//input[@name='voucherCode']")
    public WebElement gutscheinCodeTextBox;

    @FindBy(xpath="(//button[@type='submit'])[1]")
    public WebElement gutscheinCodeSubmit;

    @FindBy(xpath="//a[contains(text(),'eingeben')]/../span")
    public WebElement gutscheinCodeValue;










}
