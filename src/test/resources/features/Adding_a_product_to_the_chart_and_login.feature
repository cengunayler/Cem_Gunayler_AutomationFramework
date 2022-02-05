

@wipp
Feature: Users should be able to login

  Background: the candidate lands on the fashionette.de home page
    Given the candidate navigates to fashionette.de home page


  Scenario: the candidate adds product to the chart
    And   the candidate navigates to "Schuhe" "Sneakers"
    And   the candidate clicks the "Alexander McQueen"
    And   the candidate chooses the "Sneakers Leather White/Paris Blue"
    And   the candidate chooses the size "41"
    And   the candidate clicks add to chart button
    And   the candidate clicks the login icon
    And   the candidate logins with valid credentials
    When  the candidate clicks to cart
    Then  the candidate should see the product features which are "Alexander McQueen" "Sneakers Leather White/Paris Blue" "41" in the cart










