Feature: login action

  Scenario Outline: successful login with valid credentials
    Given username is on home page
    When  use navigate to login page
    And use enters "<username>" and "<password>"
    Then message displayed login successfully
    Examples:
      | username      | password     |
      | standrad_user | secret_sauce |
