Feature: UI Functional Test

  Background: 
    Given I want to perform test on YouTube

  @manish
  Scenario: YouTube logo displayed correctly in homepage
    When user navigates to YouTube homepage
    Then verify YouTube logo displayed correctly
    And verify YouTube apps dropdown displayed all options
      | YouTube TV          |
      | YouTube Music       |
      | YouTube Kids        |
      | Creator Academy     |
      | YouTube for Artists |

  @manish1
  Scenario: YouTube logo displayed correctly in homepage
    Given user navigates to YouTube homepage
    When user perform search in YouTube homepage
      | bata drums |
    Then verify search result displayed correctly
    And verify user is able to scroll till end of page using infinite scrolling
