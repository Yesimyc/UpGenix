@smoke_test1
  Feature: Authorized user can see module


    Scenario Outline: Login as <role> and verify <Module> is correct
      Given user is on the landing page
      Then user clicks login button
      And user logs in as "<role>"
      Then user verifies that "<Module>" has following  options

      Examples:
      |role            |Module            |
      |eventscrmmanager|Discuss, Calendar, Notes, Contacts, CRM, Sales, Website, Inventory, Repairs, Events, Employees, Leaves, Expenses, Maintenance, Dashboards|
      |expensesmanager |Discuss, Calendar, Notes, Contacts, Website, Events, Employees, Leaves, Expenses, Lunch, Maintenance, Dashboards|
      |posmanager      |Discuss, Calendar, Notes, Contacts, CRM, Sales, Website, Point of Sale, Purchases, Inventory, Manufacturing, Repairs, Project, Events, Surveys, Employees, More|
      |salesmanager    |Discuss, Calendar, Notes, Contacts, CRM, Sales, Website, Point of Sale, Purchases, Inventory, Repairs, Invoicing, Email Marketing, Events, Employees, Leaves, More|
      |inventorymanager|Discuss, Calendar, Notes, Contacts, Website, Inventory, Manufacturing, Repairs, Invoicing, Email Marketing, Employees, Leaves, Expenses, Lunch, More|
