@tag
Feature: Search Feature
  I want to use this template for my feature file

  @tag1
  Scenario: Search for product category
    Given Customer is on the Bunning Web site
    When Customer enter "nails" to the search input
    And click Search
    Then results page should load
    And results page should display "696 results for nails"
    And "Our Range" Tab should display with results
    And "Our Range" Tab heading should display "Our Range(688)"
    And close the Browser

  @tag2
  Scenario: Search for Services
    Given Customer is on the Bunning Web site
    When Customer enter "Key" to the search input
    And select "Service" from the drop down
    Then results page should load
    And results page should display "494 results for keys"
    And "Services" Tab should display with results
    And "Services" Tab heading should display "Services(2)"
    And close the Browser

  @tag3
  Scenario: Search for DIY Advice
    Given Customer is on the Bunning Web site
    When Customer enter "Key" to the search input
    And select "D.I.Y. Advice" from the drop down
    Then results page should load
    And results page should display "494 results for keys"
    And "D.I.Y. Advice" Tab should display with results
    And "D.I.Y. Advice" Tab heading should display "D.I.Y. Advice(15)"
    And close the Browser
