#Testing Challenge 1 - Automation Test Analyst
A testing challenge to be solved as part of a screening process

#Context
You are the quality analyst / engineer for a team at Bunnings.
You are retrofitting some testing procedures on the now live website.
Challenge
You are to design test cases and a test tracking plan for the newly rolled out search and results features on this site, the feature in question is outlined on this screenshot
Identify and document your testing strategy and approach to testing this application in an Agile development environment
List down any assumptions and questions you have about the brief
Design and document test cases for this feature as it appears on the site
Apply test automation to this feature outline the approach and tools you will use _
Write test automation scripts for your top 3 test cases
#Deliverables:
Spend as little or as much time as you like ⌚ on the challenge, please record the total time you spend on this and include it in your response
The code you produce can be in any language ⭐
If you complete the automation part of the challenge output of the efforts ❗ must be committed back into a Public Repo(created by you) in Github and the URL shared back for review.

# Bunning Search feature automation Challenge is done using 
    ### Java
    ### Cucumber
    ### Selenium
    ### Junit
    ### chrome webdriver
 ## Following test cases automated using BDD
  
  ### Scenario: Search for product category
    Given Customer is on the Bunning Web site
    When Customer enter "nails" to the search input
    And click Search
    Then results page should load
    And results page should display "696 results for nails"
    And "Our Range" Tab should display with results
    And "Our Range" Tab heading should display "Our Range (688)"
    And close the Browser

 
  ### Scenario: Search for Services
    Given Customer is on the Bunning Web site
    When Customer enter "Key" to the search input
    And select "Service" from the drop down
    Then results page should load
    And results page should display "494 results for keys"
    And "Services" Tab should display with results
    And "Services" Tab heading should display "Services (2)"
    And close the Browser


  ### Scenario: Search for DIY Advice
    Given Customer is on the Bunning Web site
    When Customer enter "Key" to the search input
    And select "D.I.Y. Advice" from the drop down
    Then results page should load
    And results page should display "494 results for keys"
    And "D.I.Y. Advice" Tab should display with results
    And "D.I.Y. Advice" Tab heading should display "D.I.Y. Advice (15)"
    And close the Browser
    
  ## Following Assumption used in the Automation
    •	Customer knows how to navigate to the Bunnings Web site.
    •	Local Store is set
    •	Product stock is not change
    
  ### POM.XML is used to load the dependencies
  #### Please download the supporting chrome web driver from the following site and place in the drivers folder
  https://chromedriver.chromium.org/downloads
  
  
