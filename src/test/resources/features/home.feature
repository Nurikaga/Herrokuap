Feature: HomePage

  Background:
    Given I navigate to URL
    When I enter username "test@yahoo.com" and password "test123"
    When I click Login button

  @UN-2
  Scenario: when I sign in as a user, I should be able to see only "Sign out" button from nav bar. User should not have access to "Manage Access" button
    Then Verify "Sign out" button is displayed
    And Verify user shouldn't have access to "Manage" Access button

  @IN-3
  Scenario Outline: When I log in as any user there should be 3 dashboard present. All Topics, Coding, Soft Skills
    Then Verify "<dashboard>" present
    Examples:
      | dashboard   |
      | All Topics  |
      | Coding      |
      | Soft skills |

    @IN-4
    Scenario: As a user I should have an option to add a statement in Do's and Don't sections. Statements should take only letters and numbers.
      When I click on Add do button
      And I enter "Get job with 6 figures pay" in the inputField
      And I click Enter button
      Then Verify entered "Get job with 6 figures pay" is displayed