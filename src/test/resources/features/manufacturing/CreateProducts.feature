@create_products
  Feature: Create Products

    @create_products_positive
   Scenario:
      Given user is on the landing page
      Then user clicks login button
      When user logs in as "inventorymanager"
      Then user navigates to "Manufacturing" page
      When user clicks on "Products" submodule on the manifacturing page
      And user clicks on "Create" button on the product window
      When user enters following information into product window
        |Product Name   |Sales Price|Cost|
        |Silver Ring    |145        |35  |
        |Silver Earrings|125        |34  |
        |Silver Pendant |127        |28  |
        |Silver Jewelry Set |350        |89 |
        |Amber Ring     |115        |20  |
        |Amber Earrings |145      |35  |
        |Gemstone Ring  |220      |98  |
        |Gemstone Earrings |145     |34 |
        |Gemstone Pendants |95     |23  |
     Then user verifies that products name has changed


    @create_products_positive
    Scenario:
      Given user is on the landing page
      Then user clicks login button
      When user logs in as "posmanager"
      Then user navigates to "Manufacturing" page
      When user clicks on "Products" submodule on the manifacturing page
      And user clicks on "Create" button on the product window
      When user enters following information into product window
        |Product Name   |Sales Price|Cost|
        |Tshirt-blue    |86         |25  |
        |Tshirt-white   |96         |20 |
        |Tshirt-red     |110        |28  |
        |Tshirt-black   |115        |29|
        |Tshirt-navy    |115        |20  |
        |Tshirt-purple  |86         |33  |
      And user verifies that products name has changed

    @create_products_negative
    Scenario:
      Given user is on the landing page
      Then user clicks login button
      When user logs in as "salesmanager"
      And user verifies that "Manufacturing" module didn't displayed

    @create_products_negative
    Scenario:
      Given user is on the landing page
      Then user clicks login button
      When user logs in as "eventscrmmanager"
      And user verifies that "Manufacturing" module didn't displayed

    @create_products_negative
    Scenario:
      Given user is on the landing page
      Then user clicks login button
      When user logs in as "expensesmanager"
      And user verifies that "Manufacturing" module didn't displayed