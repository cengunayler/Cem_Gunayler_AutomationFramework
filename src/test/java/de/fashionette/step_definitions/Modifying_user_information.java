package de.fashionette.step_definitions;

import de.fashionette.pages.PersönlicheDatenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Modifying_user_information {

    PersönlicheDatenPage pd = new PersönlicheDatenPage();


    @And("the candidate clicks PERSONLICHE DATEN")
    public void theCandidateClicksPERSONLICHEDATEN() {

        pd.persönlicheDaten.click();
    }

    @And("the candidate clicks BEARBEITEN")
    public void the_candidate_clicks_BEARBEITEN() {

       pd.bearbeiten.click();

    }

    @When("the candidate modifies the name and surname of the user")
    public void the_candidate_modifies_the_name_and_surname_of_the_user() {

        pd.firstName.clear();
        pd.firstName.sendKeys("Cem");
        pd.lastName.clear();
        pd.lastName.sendKeys("Günayler");
        pd.speichern.click();

    }

    @Then("the candidate should be able to save and see the new name and surname")
    public void the_candidate_should_be_able_to_save_and_see_the_new_name_and_surname() {

     String expectedFirstName = "Cem";
     String expectedLastName = "Günayler";
     String actualFirstName = pd.firstName.getText();
     String actualLastName = pd.lastName.getText();

     Assert.assertEquals(expectedFirstName, actualFirstName);
     Assert.assertEquals(expectedLastName, actualLastName);


    }


}
