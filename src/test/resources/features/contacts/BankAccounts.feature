@banks_accounts
Feature: Bank Accounts

Background:
  Given user is on the landing page
  Then user clicks login button
  And user logs in as "salesmanager"
  And user navigates to "Contacts" page
  Then user clicks on "Bank Accounts" module


  @create_bank
 Scenario: user creates bank accounts
    And user clicks on "Banks" submodule
    Then user create a bank account with following informations

      |Bank Name |Bank Idendifier Code|Street    |City|State Name|State Code |Country        |Zipcode|Phone     |Email|
      |WellsFargo|WF-Katy             |Belgrad St|Katy|IZMIR     |  Born     |TURKEY         |77494  |1234567890| info@gmail.com|
      |Garanti   |WF-Katy             |Ottomon St|Katy|IZMIR     |  GUMd     |TURKEY         |77494  |1234567890| info@gmail.com|
      |Akbank    |WF-Katy             |Poem Esref|Katy|IZMIR     |  MNM      |TURKEY         |77494  |1234567890| info@gmail.com|
      |SekerBank |WF-Katy             |Paris St  |Katy|IZMIR     |  ALSC     |TURKEY         |77494  |1234567890| info@gmail.com|


  @delete_bank
  Scenario: Sales Manager can delete bank accounts
    And user clicks on "Banks" submodule
    Then user clicks on "WellsFr" bank's select box
    When user clicks on "Action" button select "Delete" option
    And user verifies that "Are you sure you want to delete this record ?" confirmation message is displayed
    Then user clicks on "Ok" button on confirmation window


    @edit_banks
    Scenario: Sales Manager can edit bank accounts
      And user clicks on "Banks" submodule
      Then user clicks on "abc bank" bank's select box
      When user clicks on "Edit" button on the Banks Page
      And user change "Phone" to "6543535850"
      And user change "Email" to "dali@gmail.com"

  @edit_banks-2
  Scenario: Sales Manager can edit bank accounts
    And user clicks on "Banks" submodule
    Then user change all "ABC BANK" name to "ABCD BANK"

