Feature : Sort Products

  Scenario : User login using standard_user and sort product
    Given User successfully login in Swag Labs web
    When User in dashboard page
    And User click select button sort product in the top right
    Then The products will be sorted by name from Z to A


  Scenario : User login using problem_user and sort product
    Given User successfully login in Swag Labs web
    When User in dashboard page
    And User click select button sort product in the top right
    Then The products can not be sorted by name from Z to A
