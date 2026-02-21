Feature:  Dividing numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to divide numbers using a Calculator

  Scenario:  Divide two positive numbers
    Given I have a Calculator
    When I divide 2 and 1
    Then the division should be 2


  Scenario:  Divide a positive and negative number
    Given I have a Calculator
    When I divide 1 and -1
    Then the division should be -1

  Scenario:  Divide two negative numbers
    Given I have a Calculator
    When I divide -1 and -1
    Then the division should be 1

  Scenario:  Divide by zero
    Given I have a Calculator
    When I divide 2 and 0
    Then it is true that an error occurred
