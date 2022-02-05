@wip

Feature: The candidate should be able to modify user information

Background:
  Given the candidate is on the login page
  And   the candidate enters the candidate information
  Then  the candidate should be able to login

  Scenario:
    Given the candidate is on the fashionette home page
    And the candidate clicks PERSÖNLICHE DATEN
    And the candidate clicks BEARBEITEN
    When the candidate modifies the name and surname of the user
    Then the candidate should be able to save and see the new name and surname






