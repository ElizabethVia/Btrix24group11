Feature: task module funtionality

  #Background:

  @createTask
  Scenario: Go to task as user
    When  I login as a "user"
    Then I navigate to "Tasks"
    Then I create a new task
    And I add new tasks name

