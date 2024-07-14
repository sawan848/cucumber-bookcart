Feature: Add to cart Product

  Scenario Outline: Add to cart
    And user login into the application with username as "<username>" and password as "<password>"
    And user search for a book "<book>"
    When user add the book to the cart
    Then the cart badge should get updated
    Examples:
      | username | password | book            |
      | ortoni   | Pass1234 | Roomies         |
      | ortonikc | pass1234 | The Simple wild |