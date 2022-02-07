@Regression
Feature: Home Page Functionality
    As a general users, I want to search for products
    So that I canbuy products that I like

Scenario: Verify Home page Functionality
    Given  I am in Daraz.com.bd
    And I want to view the logo in left top side
    And I want to view the search bar in mid
    And There must be a search button next to search bar
    And Also I want to view cart option
    Then i want a category option
    And In Category there must be sixteen categories
    And In landing page, there must be twelve menus in left side and assert every category
    When I want to pay,there must be shown five payment methods in the footer
    And Internationally Daraz is available in five countries and shows in footer    