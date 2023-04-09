Feature: LinkedIn Homepage

  @Login @NormalNegative
  Scenario: Login to LinkedIn
    Given user is on LinkedIn login page
    And user input incorrect username
    And user input incorrect password
    And user click login
    Then user cannot login and still on login page

  @CreatePostText @NormalPositive
  Scenario: Create a new text post
    Given user is on LinkedIn login page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on homepage
    And user input text post
    And user click post
    Then user see their post in their feeds

  @CreatePostPhoto @NormalPositive
  Scenario: Create a new photo post
    Given user is on LinkedIn login page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on homepage
    And user input photo file
    And user click post
    Then user see their post in their feeds

  @CreatePostPhoto @NormalNegative
  Scenario: Create a new photo post with a non-photo file
    Given user is on LinkedIn login page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on homepage
    And user input photo file with a non-photo file
    And user click post
    Then user failed to upload the photo

  @CreatePostVideo @NormalPositive
  Scenario: Create a new video post
    Given user is on LinkedIn login page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on homepage
    And user input video file
    And user click post
    Then user see their post in their feeds

  @CreatePostVideo @NormalNegative
  Scenario: Create a new photo post with a non-video file
    Given user is on LinkedIn login page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on homepage
    And user input photo file with a non-video file
    And user click post
    Then user failed to upload the video

  @CommentPost @NormalPositive
  Scenario: Comment in a post
    Given user is on LinkedIn login page
    And user input correct username
    And user input correct password
    And user click login
    Then user is on homepage
    And user input post
    And user click send post
    Then user see their post in their feeds
    And user click comment button
    And user input comment
    And user click send comment
