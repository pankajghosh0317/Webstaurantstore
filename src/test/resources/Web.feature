@Interview
Feature: Verify your cart is empty on webstaurantstore

  Scenario: Succesfully adding and removing item from the webstaurantStore
    Given user go to the webstaurantstore homepage
    When user type for "stainless work table"
    And user click on the search button
    And user verify the word table in every item
    And user click on the add to cart button on the last item of last page
    And user click on view cart on pop up window
    And user click on empty cart button on web page
    And user click on empty cart on pop up window
    Then user verify Your cart is empty message appear