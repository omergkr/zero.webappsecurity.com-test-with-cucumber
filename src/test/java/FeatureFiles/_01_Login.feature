Feature: Login Functionallity

   Scenario Outline:
     Given Navigate to zero.webappsecurity
     When Enter "<username>" and "<password>" and click Login button
     Then Check the Message




     Examples:
       | username|password|
       | username|password|




