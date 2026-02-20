Feature:  Multiplying numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to multiply numbers using a Calculator

  Scenario:  Multiply two positive numbers
    Given I have a Calculator
    When I multiply 2 and 1
    Then the multiplication should be 2

  Scenario:  Multiply a positive and negative number
    Given I have a Calculator
    When I multiply 1 and -1
    Then the multiplication should be -1

  Scenario:  Multiply two negative numbers
    Given I have a Calculator
    When I multiply -1 and -1
    Then the multiplication should be 1

  Scenario:  Multiply two a number and zero
    Given I have a Calculator
    When I multiply 2 and 0
    Then the multiplication should be 0