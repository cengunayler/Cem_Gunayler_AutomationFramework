@wip
Feature: The candidate should be able to apply a voucher

  Background: the candidate lands on the fashionette.de home page
    Given the candidate navigates to fashionette.de home page

  Scenario:the candidate applies a voucher
    And   the candidate navigates to "Schuhe" "Sneakers"
    And   the candidate clicks the "Alexander McQueen"
    And   the candidate chooses the "Sneakers Leather White/Paris Blue"
    And   the candidate chooses the size "41"
    And   the candidate clicks add to chart button
    And   the candidate clicks to cart
    When  the candidate applies the voucher
    Then  the voucher should be properly applied






