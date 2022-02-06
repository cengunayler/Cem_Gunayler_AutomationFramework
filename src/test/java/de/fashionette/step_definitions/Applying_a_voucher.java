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
    public void the_voucher_should_be_properly_applied() {

        String actualGutscheinCodeName = cartPage.gutscheinCodeValue.getAttribute("data-code").trim().toLowerCase();

        String expectedGutscheinCodeName = "qachallenge";

        Assert.assertEquals(expectedGutscheinCodeName, actualGutscheinCodeName);

        String discount = cartPage.gutscheinCodeValue.getText().trim().substring(0,cartPage.gutscheinCodeValue.getText().indexOf(" "));

        double discountAmount = Double.parseDouble(discount);

        Assert.assertEquals(-2.0, discountAmount);



    }




}
