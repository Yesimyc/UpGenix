@create_event
Feature: Create an event

  Background: User logs in as eventscrmmanager
    Given user is on the landing page
    Then user clicks login button
    When user logs in as "eventscrmmanager"
    Then user navigates to "Events" page


    Scenario:
  Given user enters following information

  |Event Name  |Organizer|Location |Start Date        |End Date |
  |Home Concert| Ziba Inc|Texas    |10/28/2020 10:00|10/29/2020 10:00 |
  |Teoman Concert|Ziba Inc|LA      |11/29/2020 10:00:00 |11/30/2020 10:00:00|







#      Given user clicks on Create button
#      Then user clicks on Event Name button
#      And user writes Hello Summer Party
#      Then user clicks on Organizer button
#      And user clicks on Create and Edit button
#      When user clicks on Name button
#      And user writes Ziba
#      And user clicks on Save button
#      Then user clicks on Location button
#      And user clicks on Create and Edit button
#      When user clicks on Name button
#      And user writes Grand Lakes Area
#      When user clicks on start date
#      Then user writes 04.23.2021
#      Then user clicks on end date
#      And user writes 04.25.2021
#      When user clicks on Save button
