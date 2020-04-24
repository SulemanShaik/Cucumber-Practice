Feature: Login Functionality

  #Given Launch browser
  #When User enters url "http://practice.automationtesting.in/"
  #And click on myaccount link
  #And User enters username as "sulemanshaik6786@gmail.com" and password as "Suleman!@#12"
  #And user click on Login button
  #Then user should see login dashboard
  #And close browser
  #Scenario Outline: Verfying login Functionality
  # in this scenario we are login multiple users
  #Given Launch browser
  #When User enters url "http://practice.automationtesting.in/"
  #And click on myaccount link
  #And User enters username as "<username>" and password as "<passowrd>"
  #And user click on Login button
  #Then very login
  #Examples:
  #|username| password|
  #|sulemanshaik6786@gmail.com|Suleman!@#12|
  #|sulemanshaik|Suleman!@#12|
  #|suleman|Suleman!@#12|
  #login Using Data data params
  #Scenario:login with valid username and password
  #Given Launch browser
  # When User enters url "http://practice.automationtesting.in/"
  #And click on myaccount link
  #And User enters username and password
  #|sulemanshaik6786@gmail.com|Suleman!@#12|
  #And user click on Login button
  #Then user should see login dashboard
  Scenario: login with valid username and password
    Given Launch browser
    When User enters url "http://practice.automationtesting.in/"
    And click on myaccount link
    And User enters username and password
      | username                   | password     |
      | sulemanshaik6786@gmail.com | Suleman!@#12 |
    And user click on Login button
    Then user should see login dashboard
