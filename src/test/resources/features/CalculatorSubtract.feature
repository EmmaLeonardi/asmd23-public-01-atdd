Feature:  Subtracting numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to add numbers using a Calculator

  Scenario:  Subtract two positive numbers
    Given I have a Calculator
    When I subtract 2 and 1
    Then the subtraction should be 1


  Scenario:  Subtract a positive and negative number
    Given I have a Calculator
    When I subtract 1 and -1
    Then the subtraction should be 2

  Scenario:  Subtract two negative numbers
    Given I have a Calculator
    When I subtract -1 and -1
    Then the subtraction should be 0