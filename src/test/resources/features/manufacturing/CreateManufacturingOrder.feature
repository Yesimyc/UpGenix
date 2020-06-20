@create_manufacturing_order
Feature: Create Manufacturing

  Scenario: Authorized user can create manufacturing order
    Given user is on the landing page
    Then user clicks login button
    And user logs in as "inventorymanager"
    Then user navigates to "Manufacturing" page
    When user clicks on "Create" button on the manufacturing orders page
    Then user enters following information into manufacturing order window
    |Product    |Quantity To Produce|
    |Tshirt-blue|13500             |
    |Tshirt-white|12500            |
    |Tshirt-red  |15000            |
    |Tshirt-black|20000            |
    |Tshirt-navy|18000             |
    |Tshirt-purple|23000           |
