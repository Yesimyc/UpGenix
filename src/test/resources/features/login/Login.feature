@login
  Feature: Login
    As user, I want to be able to login into upgenix
    under different roles with username and password


    Scenario: login as eventcrm manager
      Given user is on the landing page
      Then user clicks login button
      And user verifies that "Best solution for startups" link displayed
      When user logs in as eventscrmmanager
      And user verifies that "#Inbox" page subtitle is displayed

      @login_expensesmanager
    Scenario: login as expenses manager
      Given user is on the landing page
      Then user clicks login button
      And user verifies that "Best solution for startups" link displayed
      When user logs in as "expensesmanager"
      And user verifies that "#Inbox" page subtitle is displayed

 @login_as_salesmanager
    Scenario: login as sales manager
      Given user is on the landing page
      Then user clicks login button
      And user verifies that "Best solution for startups" link displayed
      When user logs in as "salesmanager"
      And user verifies that "#Inbox" page subtitle is displayed

    @negative_test
   Scenario: Verify that warning message is displayed when password is not correct
     Given user is on the landing page
     Then user clicks login button
     And user verifies that "Best solution for startups" link displayed
     When user enters "WrongUserName" username and "123456" password
     And user verifies that "Wrong login/password" message is displayed

    @driver_with_data_table
    Scenario: Login as eventcrm manager (data table example)
      Given user is on the landing page
      Then user clicks login button
      And user verifies that "Best solution for startups" link displayed
      When user logs in as eventscrmmanager with following credentials
        | username | eventscrmmanager49@info.com    |
        | password | eventscrmmanager               |
      And user verifies that "#Inbox" page subtitle is displayed

    @login_with_role_ddt
    Scenario Outline: Login as <role>
      Given user is on the landing page
      Then user clicks login button
      And user verifies that "Best solution for startups" link displayed
      When user logs in as "<role>"

      Examples: roles
        | role          |
        | posmanager      |
        | salesmanager|
        | expensesmanager |
        | inventorymanager|


    @login_with_credentials_ddt
    Scenario Outline: DDT example with credentials, Login as <username>
      Given user is on the landing page
      Then user clicks login button
      And user verifies that "Best solution for startups" link displayed
      Then user enters "<username>" username and "<password>" password

      Examples:
        | username     | password    |
    |salesmanager50@info.com | salesmanager|
    |salesmanager51@info.com | salesmanager|
    |salesmanager52@info.com | salesmanager|
    |salesmanager53@info.com | salesmanager|
    |salesmanager54@info.com | salesmanager|
    |expensesmanager55@info.com |  expensesmanager |
    |expensesmanager56@info.com | expensesmanager |
    |expensesmanager57@info.com |  expensesmanager |
    |expensesmanager58@info.com |  expensesmanager |
    |expensesmanager59@info.com |  expensesmanager |
    |imm20@info.com             | inventorymanager |
    |imm21@info.com             |inventorymanager |
    |imm22@info.com             |inventorymanager |
    |imm23@info.com             |inventorymanager |
    |imm24@info.com             |inventorymanager |


    @login_with_Excel_table
    Scenario: Excel Table example
      Given user is on the landing page
      Then user clicks login button
      And user verifies that "Best solution for startups" link displayed
      Then user enters "<username>" username and "<password>" password



