Feature: User Authentication tests


    Background:
      And User clicks on the login link

      @dev_iphone @aut_kisan
    Scenario: Login should be success
     And User enter the username as "ortoni"
     And User enter the password as "Pass1234"
     When User click on the login button
     Then Login should be success

  @dev_window  @aut_anjali
  Scenario: Login should be success
    And User enter the username as "ortoni"
    And User enter the password as "Pass24"
    When User click on the login button
    Then Login should fail