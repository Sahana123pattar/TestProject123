Feature: validate login

  Scenario Outline: Login feature working sucessfull
    Given luanch the browser
    And user on login page
    When user enters <username> and <password>
    And User click on login
    Then verify user on home page

    Examples:
    | username | password |
    | sahanapattar.77@gmail.com | S12345!@ |
    | sahanapattar456@gmail.com | P12345!@ | 