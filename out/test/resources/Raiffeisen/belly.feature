Feature: Belly

  @Bella
  Scenario: a few cukes
    Given I have 77 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  Scenario Template:
    When Стороны    треугольника равны <first>, <second>, <third>
    Examples:
      | first | second | third |
      | 90    | 45     | 45    |
      | 30    | 120    | 30    |

  Scenario: Users info
    Given User table:
      | name    | Ivan   | Petr   |
      | surname | Ivanov | Petrov |