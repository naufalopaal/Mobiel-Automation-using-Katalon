@Register
Feature: Register

  @RegisterPositive
  Scenario Outline: User want to Register new account
    Given User launch apps
    When User click Akun button
    And User click Masuk button
    And User click Daftar button
    And User input name <name>
    And User input email <email>
    And User input password <password>
    And User click Daftar button create
    Then Successfully created

    Examples: 
      | name    | email                  | password |
      | Testing | rajafredi123@gmail.com | qwerty   |

  @RegisterNegative
  Scenario Outline: User want to Register new account
    Given User launch apps
    When User click Akun button
    And User click Masuk button
    And User click Daftar button
    And User input name <name>
    And User input email <email>
    And User input password <password>
    And User click Daftar button create
    Then Successfully created
    
    Examples: 
      | name       | email                   | password |
      | Testing123 | rajafredi1234@gmail.com | qwerty   |