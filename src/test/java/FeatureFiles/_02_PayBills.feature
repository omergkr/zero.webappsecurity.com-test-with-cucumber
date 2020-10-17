Feature: Pay Bills Functionality

  Scenario Outline: Pay Bills Page

    Given Navigate to zero.webappsecurity
    Then Click on the Elment and send keys
      | userName | <username> |
      | userPassword | <password> |
    And Click on the Elment
      | signIn      |
      | payBillsTab |
      | addNewPayee |
    Then Click on the Elment and send keys
      | newPayeeName    | <name>    |
      | newPayeeAddress | <adress>  |
      | newPayeeAccount | <account> |
      | newPayeeDetails | <details> |
    And Click on the Elment
      | addButton |
    And Check the Message "<message>"



    Examples:
     | username | password | name  | adress       | account | details      | message      |
      | username | password | fatih | florastrasse | 1000    | Miete Gebühr | successfully |
      | username | password |       | muller       | 1500    | Gebühr1      | error        |
      | username | password |fatih  |              | 2500    | Gebühr2      | error        |
      | username | password | fatih | muller       |         | Gebühr3      | error        |
      | username | password | fatih | muller       |   3500  |              | successfully |

