@HomePageSuite
Feature: OpenCart Website Navigation and Validation

  Background:
    Given the user is on the home page

Feature: Navigation Bar Functionality

  Background:
    Given the user is on the home page

  @NavigationBar
  Scenario Outline: Verify Navigation Bar Categories and Redirects
    When the user interacts with the "<category>" in the navigation bar
    Then the user should see the number of "<options>" options in the dropdown (if applicable)
    And the user should be redirected to the "<url>" page (if applicable)

    Examples:
      | category           | options  | url                                                                   |
      | Desktops           | 2        |                                                                       |
      | Laptops & Notebooks| 2        |                                                                       |
      | Components         | 5        |                                                                       |
      | Tablets            |          | http://opencart.abstracta.us/index.php?route=product/category&path=57 |
      | Software           |          | http://opencart.abstracta.us/index.php?route=product/category&path=17 |
      | Phones & PDAs      |          | http://opencart.abstracta.us/index.php?route=product/category&path=24 |
      | Cameras            |          | http://opencart.abstracta.us/index.php?route=product/category&path=33 |
      | MP3 Players        | 19       |                                                                       |


  @SearchBar
  Scenario Outline: Search Products
    When the user searches for the product "<product>" in the search bar
    Then the user should see the number of search "<results>" results

    Examples:
      | product | results|
      | Mac     | 4      |
      | canon   | 1      |
      | hp      | 1      |

  @FooterSuite
    @InformationOk
  Scenario Outline: Verify the navigation through Information links
    When the user clicks on "<list>" in the Information section of the footer
    Then the user should be redirected to the URL "<url>" with the title: "<title>"
    Examples:
      | list                 | title                |url                                                                                    |
      | About Us             | About Us             |http://opencart.abstracta.us/index.php?route=information/information&information_id=4  |
      | Delivery Information | Delivery Information |http://opencart.abstracta.us/index.php?route=information/information&information_id=6  |
      | Privacy Policy       | Privacy Policy       |http://opencart.abstracta.us/index.php?route=information/information&information_id=3  |
      | Terms & Conditions   | Terms & Conditions   |http://opencart.abstracta.us/index.php?route=information/information&information_id=5  |

  @CustomerServiceOk
  Scenario Outline: Verify the navigation through Customer Service links
    When the user clicks on "<list>" in the Customer Service section of the footer
    Then the user should be redirected to the URL "<url>" with the title: "<title>"
    Examples:
      | list       | title      | url                                                              |
      | Contact Us | Contact Us | http://opencart.abstracta.us/index.php?route=information/contact |
      | Returns    | Returns    | https://opencart.abstracta.us/index.php?route=account/return/add |
      | Site Map   | Site Map   | http://opencart.abstracta.us/index.php?route=information/sitemap |

  @ExtrasOk
  Scenario Outline: Verify the navigation through Extras links
    When the user clicks on "<list>" in the Extras section of the footer
    Then the user should be redirected to the URL "<url>" with the title: "<title>"
    Examples:
      | list              | title                    | url                                                               |
      | Brands            | Find Your Favorite Brand | http://opencart.abstracta.us/index.php?route=product/manufacturer |
      | Gift Certificates | Account                  | https://opencart.abstracta.us/index.php?route=account/voucher     |
      | Affiliate         | Account                  | https://opencart.abstracta.us/index.php?route=account/account     |
      | Specials          | Special Offers           | http://opencart.abstracta.us/index.php?route=product/special      |

  @MyAccountOk
  Scenario Outline: Verify the navigation through My Account links
    When the user is logged in to the website with username: "eechechele@gmail.com" and password: "123456789"
    And clicks on "<list>" in the My Account section of the footer
    Then the user should be redirected to the URL "<url>" with the title: "<title>"
    Examples:
      | list          | title      | url                                                              |
      | My Account    | My Account | https://opencart.abstracta.us/index.php?route=account/account    |
      | Order History | Account    | https://opencart.abstracta.us/index.php?route=account/order      |
      | Wish List     | Account    | https://opencart.abstracta.us/index.php?route=account/wishlist   |
      | Newsletter    | Account    | https://opencart.abstracta.us/index.php?route=account/newsletter |
