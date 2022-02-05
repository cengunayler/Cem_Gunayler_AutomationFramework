package de.fashionette.step_definitions;

import de.fashionette.pages.CartPage;
import de.fashionette.pages.Dashboard;
import de.fashionette.pages.LoginPage;
import de.fashionette.pages.ProductPage;
import de.fashionette.utilities.BrowserUtils;
import de.fashionette.utilities.ConfigurationReader;
import de.fashionette.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.sukgu.Shadow;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Adding_a_product_to_the_chart_and_login {

    Dashboard dbPage = new Dashboard();
    ProductPage prPage = new ProductPage();
    LoginPage logPage = new LoginPage();
    CartPage cartPage = new CartPage();


    @Given("the candidate navigates to fashionette.de home page")
    public void the_candidate_navigates_to_fashionette_de_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Shadow shadow = new Shadow(Driver.get());
        WebElement element = shadow.findElement("button[role='button']");
        element.click();
    }

    @Given("the candidate navigates to {string} {string}")
    public void the_candidate_navigates_to(String tab, String module) {

        dbPage.menuNavigation(tab, module);

    }
    @Given("the candidate clicks the {string}")
    public void the_candidate_clicks_the(String product) {


        prPage.productSelect(product).click();

    }

    @Given("the candidate chooses the {string}")
    public void the_candidate_chooses_the(String colour) {

        prPage.productColour(colour).click();

    }

    @And("the candidate chooses the size {string}")
    public void theCandidateChoosesTheSize(String size) {

        prPage.productSize(size).click();
    }

    @Given("the candidate clicks add to chart button")
    public void the_candidate_clicks_add_to_chart_button() {

        prPage.indenWarenKorbBtn.click();

    }

    @Given("the candidate clicks the login icon")
    public void the_candidate_clicks_the_login_icon() {

        dbPage.loginIcon.click();

    }

    @And("the candidate logins with valid credentials")
    public void theCandidateLoginsWithValidCredentials() {

        logPage.login();
    }



    @When("the candidate clicks to cart")
    public void the_candidate_clicks_to_cart() {

        dbPage.warenKorbIcon.click();

    }

    @Then("the candidate should see the product features which are {string} {string} {string} in the cart")
    public void theCandidateShouldSeeTheProductFeaturesWhichAreInTheCart(String model, String colour, String size) {

        Assert.assertEquals(model, cartPage.model.getText());
        Assert.assertEquals(colour, cartPage.colour.getText());
        Assert.assertEquals(size, cartPage.size.getText());
    }



}


