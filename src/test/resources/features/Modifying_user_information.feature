
Feature: The candidate should be able to modify user information

  Background:login
    Given the candidate navigates to fashionette.de home page
    And   the candidate clicks the login icon
    And   the candidate logins with valid credentials

  Scenario:modify user information
    And the candidate clicks PERSONLICHE DATEN
    And the candidate clicks BEARBEITEN
    When the candidate modifies the name and surname of the user
    Then the candidate should be able to save and see the new name and surname






