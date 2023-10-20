Feature : Login Page Swag Labs Web

  Scenario: Success Login
    Given Login Page of Swag Labs Web
    When Input username
    And Input password
    And click login button
    Then user in on dashboard page

  Scenario: Failed Login
    Given Login Page of Swag Labs Web
    When Input username
    And Input invalid password
    Then User get error message
