@ProductOptions
Feature: Validate the Search options

  @SearchBar
  Scenario Outline: Search Products
    Given the user is logged in
    When the user searches for the product "<product>" in the search bar
    Then the user should see <number> search results

    Examples:
      | product | number |
      | Mac     | 4      |
      | canon   | 1      |
      | hp      | 1      |

