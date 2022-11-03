@stories

  Feature: Register a new user
    As a person, I want to be a software tester at Utest
  @scenario1
  Scenario: Create a new user
    Given Maria enter the page Utest.com
    When She enter the information in the form de register
      #| strFirstname | strLastname | strEmail                          | strCity   | strPostal | strDevice|strModelDevice | strSO      |strPassword  | strConfirmPassword |
      #| Maria        |  Rodriguez  |  mariarodriguez1396@hotmail.com   |   Neiva   |057        | Xiaomi   |Redmi Note 8   | Android 11 |2$fF5*a8qNi0 | 2$fF5*a8qNi0 |
      #| Ximena       |  Borda      |  u20152142076@usco.edu.co         |   Bogota  |051        | Apple    |iPhone 3G      | iOS 2.0    |vn2oGG#L9W22 | vn2oGG#L9W22 |
    Then User created successfully Message Welcome to the world's largest community of freelance software testers!

