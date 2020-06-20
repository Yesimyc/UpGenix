@create_bills_of_materials
Feature: Creating Bills of Materials


  Scenario: Authorized user can create bills of materials
    Given user is on the landing page
    Then user clicks login button
    And user logs in as "inventorymanager"
    Then user navigates to "Manufacturing" page
    When user clicks on "Bills of Materials" submodule on the manifacturing page
    When user clicks on "Create" button on the Bills of Materials page
    Then user enters following information into Bills of Materials window
      |Product    |Item1       |Item2    |
      |Tshirt-blue|Blue Fabric |Label    |
      |Tshirt-white|White Fabric|Label   |
      |Tshirt-red  |Red Fabric  |Label   |
    And user verifies that Product name displayed on the page title


  Scenario: Authorized user can create bills of materials
    Given user is on the landing page
    Then user clicks login button
    And user logs in as "posmanager"
    Then user navigates to "Manufacturing" page
    When user clicks on "Bills of Materials" submodule on the manifacturing page
    When user clicks on "Create" button on the Bills of Materials page
    Then user enters following information into Bills of Materials window
      |Product    |Item1       |Item2    |
      |Tshirt-black|Black Fabric |Label    |
      |Tshirt-navy|Navy Fabric|Label   |
      |Tshirt-purple  |Purple Fabric  |Label   |
    And user verifies that Product name displayed on the page title

  @create_bills_of_materials-negative
 Scenario: Nonauthorized user canNot create bills of materials
    Given user is on the landing page
    Then user clicks login button
    And user logs in as "salesmanager"
    And user verifies that "Manufacturing" module didn't displayed

  @create_bills_of_materials-negative
  Scenario: Nonauthorized user canNot create bills of materials
    Given user is on the landing page
    Then user clicks login button
    And user logs in as "eventscrmmanager"
    And user verifies that "Manufacturing" module didn't displayed

  @create_bills_of_materials-negative
  Scenario: Nonauthorized user canNot create bills of materials
    Given user is on the landing page
    Then user clicks login button
    And user logs in as "expensesmanager"
    And user verifies that "Manufacturing" module didn't displayed






