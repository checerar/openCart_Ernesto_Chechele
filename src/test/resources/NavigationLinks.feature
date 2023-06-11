@NavigationLinks
Feature: Navigation Links

  Background:
    Given a user is on the home page

  Scenario Outline: Navigate to category in Navigation Bar
    When the user clicks on "<title>" in the navigation bar
    Then the user should see a dropdown menu with <options> options (if applicable)
    And the user should be redirected to the URL "<url>" (if applicable)

    Examples:
      | title               | options | url                                                                   |
      | Desktops            | 2       |                                                                       |
      | Laptops & Notebooks | 2       |                                                                       |
      | Components          | 5       |                                                                       |
      | Tablets             |         | http://opencart.abstracta.us/index.php?route=product/category&path=57 |
      | Software            |         | http://opencart.abstracta.us/index.php?route=product/category&path=17 |
      | Phones & PDAs       |         | http://opencart.abstracta.us/index.php?route=product/category&path=24 |
      | Cameras             |         | http://opencart.abstracta.us/index.php?route=product/category&path=33 |
      | MP3 Players         | 18      |                                                                       |
