Feature: proof that phantomjs framework works
  
  Scenario: Test page title
  
  Given we are in google search page
  When I enter guru99 as q word
  Then page title should be according to search parameter
