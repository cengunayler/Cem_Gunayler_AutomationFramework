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
    public void the_candidate_clicks_BEARBEITEN() throws InterruptedException {

       pd.bearbeiten.click();
       Thread.sleep(3000);

    }

    @When("the candidate modifies the name and surname of the user")
    public void the_candidate_modifies_the_name_and_surname_of_the_user() throws InterruptedException {

        pd.firstName.clear();
        pd.firstName.sendKeys("Candidate");
        pd.lastName.clear();
        pd.lastName.sendKeys("Automation");
        pd.speichern.click();
        Thread.sleep(3000);

    }

    @Then("the candidate should be able to save and see the new name and surname")
    public void the_candidate_should_be_able_to_save_and_see_the_new_name_and_surname() {

     String expectedFullName = "Herr Candidate Automation";

     String actualFullName = pd.newFullName.getText();

     String actualFullNameTrim = actualFullName.substring(0,25);

     System.out.println("actualFullNameTrim = " + actualFullNameTrim);

     System.out.println("actualFullNamE = " + actualFullName);


     Assert.assertEquals(expectedFullName, actualFullNameTrim);



    }


}
