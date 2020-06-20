@verify
  Feature: Events Page

    Background: User logs in as eventscrmmanager
      Given user is on the landing page
      Then user clicks login button
      When user logs in as "eventscrmmanager"
      Then user navigates to "Events" page

    @verify1
    Scenario:Verify events page modules
      Given user verifies that "ERP LOGO" element is displayed
      Then user verifies that "Events" element is displayed
      Then user verifies that "Events" element is clickable
      Then user verifies that "Reporting" element is displayed
      Then user verifies that " 2. Events" element is displayed
      Then user verifies that "2. Events" element is clickable
      Then user verifies that "Configuration" element is displayed
      Then user verifies that "Event Categories" element is displayed
      Then user verifies that "Event Categories" element is clickable



      @dropdowns
      Scenario: user verifies dropdown option
      Then user clicks on "search" button
       Then user verifies that "Events" has following options
        |Filters|
        |Group By|
        |Favorites|
        When user clicks on "Filters" button
        And user verifies that "dropdown menu" has following options
        |Unread Messages|
        |Unconfirmed    |
        |My Events |
        |Upcoming  |
        |Archived |

        @selected-filters-dropdown
        Scenario: user verifies that in the "Filters" dropdown "Upcoming" is selected
        Then user clicks on "search" button
        Then user clicks on "Filters" button
          Then user verifies that "Upcoming" option is selected


#        @upcoming_events_number
#     Scenario: user verifies upcoming event numbers
#     Given User clicks on third icon
#     Then User verifies that "Upcoming Events" number
#          And user verifies "Upcoming Events" number is equal number left top on the page


#          Scenario:
#            Given user clicks on "Filters" button
#            Then user select "My event" option
#            And user verifies that "My events" number is equal number on the left top of page
#            Then user verifies that


