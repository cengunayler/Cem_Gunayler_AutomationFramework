package de.fashionette.step_definitions;

import de.fashionette.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Applying_a_voucher {

    CartPage cartPage = new CartPage();


    @When("the candidate applies the voucher")
    public void the_candidate_applies_the_voucher() {

        cartPage.gutscheinCodeIcon.click();

        cartPage.gutscheinCodeTextBox.sendKeys("qachallenge");

        cartPage.gutscheinCodeSubmit.click();


    }

    @Then("the voucher should be properly applied")
    public void the_voucher_should_be_properly_applied() throws InterruptedException {


        Thread.sleep(3000);
        System.out.println(cartPage.gutscheinCodeValue.getAttribute("innerHTML").trim());

        Assert.assertEquals("-2 €", cartPage.gutscheinCodeValue.getAttribute("innerHTML").trim());


    }




}
