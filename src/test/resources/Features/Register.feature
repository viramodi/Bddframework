Feature: Nopcommerce Register
  Background:
    Given user able to open browser
    And enter the Url

    Scenario: Nopcommerce Register Test
      When user click on Register Link
      And User click on Gender
      Then User enter First name
      Then User enter Last Name
      Then User enter Date Of Birth
      Then User enter Valid Email
      Then User enter company Name
      Then User enter Password
      Then User Enter Confirm Password
      Then User is on Complete Register Page
      And User close The Browser