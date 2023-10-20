Feature : Checkout

  Scenario : User checkout the products and input First Name, Last Name and ZIP/Postal Code
    Given User on the Your Information Page
    When User click button checkout in Your Cart page
    Then User redirect to Your Information page
    And User input First Name
    And User input Last Name
    And User input ZIP or Postal Code
    And User click button Continue
    Then User successfully checkout and redirect to Checkout Overview page
    And User click button Finish
    Then User redirect to Checkout Complete page


  Scenario : User checkout the products and input First Name and Zip/Portal but does not input Last Name
    Given User on the Your Information Page
    When User click button checkout in Your Cart page
    Then User redirect to Your Information page
    And User input First Name
    And User input ZIP or Postal Code
    And User does not input Last Name
    Then User click button Continue
    And User can't checkout and appear message error
