
  Feature: Events Page

    Background: User logs in as eventscrmmanager
      Given user is on the landing page
      Then user clicks login button
      When user logs in as "eventscrmmanager"
      Then user navigates to "Events" page

    @logo_verify
    Scenario: User verifies ERP logo element displayed
      And user verifies ERP logo displayed

      @submodule_verifiying
      Scenario: User verifies events element is displayed
        Given user verifies that "Events" element is displayed
        And user verifies that "Events" element is clickable

    @submodule_verifiying
    Scenario: User verifies events Reporting element is displayed
      Given user verifies that "Reporting" element is displayed


    @submodule_verifiying
    Scenario: User verifies events subelement is displayed
      Given user verifies that "Events" subelement is displayed
      And user verifies that "Events" subelement is clickable

    @submodule_verifiying
    Scenario: User verifies Configuration element is displayed
      Given user verifies that "Configuration" element is displayed


    @submodule_verifiying
    Scenario: User verifies event Categories element is displayed
      Given user verifies that "Event Categories" element is displayed
      And user verifies that "Event Categories" element is clickable

      @dropdowns
      Scenario: user verifies dropdown options
        Given user clicks on "search icon"
       Then user verifies that Events pages has following button
        |Filters|
        |Group By|
        |Favorites|
        When user clicks on "Filters" button
        And verifies dropdown menu has following options
        |Unread Messages|
        |Unconfirmed    |
        |My Events |
        |Upcoming  |
        |Archived |

        @selected-filters-dropdown
        Scenario: user verifies that in the "Filters" dropdown "Upcoming" is selected

        Given user clicks on "search icon"
        When user clicks on "Filters" button
          Then user verifies that "Upcoming" option is selected


        @upcoming_events_number
     Scenario: user verifies upcoming event numbers
     Given User clicks on third icon
     Then User verifies that "Upcoming Events" number
          And user verifies "Upcoming Events" number is equal number left top oin the page


          Scenario:
            Given user clicks on "Filters" button
            Then user select "My event" option
            And user verifies that "My events" number is equal number on the left top of page
            Then user verifies that


