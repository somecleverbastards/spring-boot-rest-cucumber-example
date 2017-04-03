Feature: Retrieve All User Accounts
  Scenario: client makes a call to GET /account
    Given call GET on /account
    Then the client receives status code of 200
    And the response body must contain _embedded with accounts