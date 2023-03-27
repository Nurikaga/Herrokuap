Feature: Using right credentials Login to the page

  @IN-1
  Scenario Outline: Login to the Page
    Given I open the page
    When I enter "<username>" and "<password>"
    When I click on Login button
    Then Verify the title of the page is "Interview App"
    Examples:
      | username       | password |
      | test@yahoo.com | test123  |

