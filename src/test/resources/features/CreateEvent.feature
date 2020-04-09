@create_event
Feature:

  Background: User logs in as eventscrmmanager
    Given user is on the landing page
    Then user clicks login button
    When user logs in as "eventscrmmanager"
    Then user navigates to "Events" page


    Scenario:
      Given user clicks on Create button
      Then user clicks on Event Name button
      And user writes Hello Summer Party
      Then user clicks on Organizer button
      And user clicks on Create and Edit button
      When user clicks on Name button
      And user writes Ziba
      And user clicks on Save button
      Then user clicks on Location button
      And user clicks on Create and Edit button
      When user clicks on Name button
      And user writes Grand Lakes Area
      When user clicks on start date
      Then user writes 04.23.2021
      Then user clicks on end date
      And user writes 04.25.2021
      When user clicks on Save button
