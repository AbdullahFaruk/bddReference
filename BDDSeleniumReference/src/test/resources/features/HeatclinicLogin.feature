Feature: Heatclinic e-commerce Login Functionality

  @debug
  Scenario: 1. Valid user valid password
    Given As a not validated user
    When Browse to the url "http://heatclinic.shiftedtech.com/"
    Then Heatclinic home page should show
    When User click login button
    And Enter "iivaan@shiftedtech.com" as email address
    And Enter "shiftedtech" as password
    And Click login
    And Welcome message shows "IftekharX"

  @functional
  Scenario: 2. Invalid user valid password
    Given As a not validated user
    When Browse to the url "http://heatclinic.shiftedtech.com/"
    Then Heatclinic home page should show
    When User click login button
    And Enter "NotValid_paxqa2@Gmail.com" as email address
    And Enter "paxotech" as password
    And Click login
    Then Invalid email or password message display

  @functional
  Scenario: 3. Valid user invalid password
    Given As a not validated user
    When Browse to the url "http://heatclinic.shiftedtech.com/"
    Then Heatclinic home page should show
    When User click login button
    And Enter "iivaan@shiftedtech.com" as email address
    And Enter "ameera_notvalid" as password
    And Click login
    Then Invalid email or password message display
