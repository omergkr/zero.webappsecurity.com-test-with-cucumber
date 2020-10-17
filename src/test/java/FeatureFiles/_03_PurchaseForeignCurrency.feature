Feature: Purchase Froeign Currency Functionallitiy


  Scenario Outline: Purchase Froeign Page
    Given Navigate to zero.webappsecurity
    Then Click on the Elment and send keys
      | userName | <username> |
      | userPassword | <password> |
    And Click on the Elment
      | signIn                  |
      | payBillsTab             |
      | purchaseForeignCurrency |
    Then Select Currency
    Then Click on the Elment and send keys
      | amount | <amount> |
    And Click on the Selelcted Elment
      | <dollarSelect> |
    Then Check the Message "<text>"



    Examples:
      | username | password | amount | dollarSelect | text         |
      | username | password | 1000   | dolarTrue    | successfully |
      | username | password | 2000   | dolarFalse   | successfully |
