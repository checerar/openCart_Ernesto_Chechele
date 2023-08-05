@HomePageSuite
Feature: Navigation Bar Functionality

  Background:
    Given the user is on the home page

  @NavigationBar
  Scenario Outline: Verify Navigation Bar Categories and Redirects
    When the user interacts with selected "<category>" categories in the navigation bar
    Then the user should be redirected to the "<url>" page (if applicable)

    Examples:
      | category           | url                                                                   |
      | Tablets            | http://opencart.abstracta.us/index.php?route=product/category&path=57 |
      | Software           | http://opencart.abstracta.us/index.php?route=product/category&path=17 |
      | Phones & PDAs      | http://opencart.abstracta.us/index.php?route=product/category&path=24 |
      | Cameras            | http://opencart.abstracta.us/index.php?route=product/category&path=33 |


  @SearchBar
  Scenario Outline: Search Products
    When the user searches for the product "<product>" in the search bar
    Then the user should see the number of search "<results>" results
    Examples:
      | product | results|
      | Mac     | 4      |
      | canon   | 1      |

  @FooterSuite
  Scenario Outline: Footer links Navigation
    When the user clicks on the "<link>" link in the footer
    Then the user should be redirected to the URL "<url>" with the title: "<title>"
    Examples:
      | link                 | title                       | url                                                                                    |
      | About Us             | About Us                    | http://opencart.abstracta.us/index.php?route=information/information&information_id=4  |
      | Delivery Information | Delivery Information        | http://opencart.abstracta.us/index.php?route=information/information&information_id=6  |
      | Privacy Policy       | Privacy Policy              | http://opencart.abstracta.us/index.php?route=information/information&information_id=3  |
      | Terms & Conditions   | Terms & Conditions          | http://opencart.abstracta.us/index.php?route=information/information&information_id=5  |
      | Contact Us           | Contact Us                  | http://opencart.abstracta.us/index.php?route=information/contact                       |
      | Returns              | Product Returns             | https://opencart.abstracta.us/index.php?route=account/return/add                       |
      | Site Map             | Site Map                    | http://opencart.abstracta.us/index.php?route=information/sitemap                       |
      | Brands               | Find Your Favorite Brand    | http://opencart.abstracta.us/index.php?route=product/manufacturer                      |
      | Gift Certificates    | Purchase a Gift Certificate | https://opencart.abstracta.us/index.php?route=account/voucher                          |
      | Affiliate            | Affiliate Program           | https://opencart.abstracta.us/index.php?route=affiliate/login                          |
      | Specials             | Special Offers              | http://opencart.abstracta.us/index.php?route=product/special                           |

  @MyAccountOk
  Scenario Outline: Verify the navigation through My Account links
    When the user is logged in to the website with username: "eechechele@gmail.com" and password: "123456789"
    And clicks on the "<account>" link in the My Account section of the footer
    Then the user should be redirected to "<relativeUrl>" with the title: "<pageTitle>"
    Examples:
      | account       | pageTitle                 | relativeUrl                            |
      | My Account    | My Account                | /index.php?route=account/account       |
      | Order History | Order History             | /index.php?route=account/order         |
      | Wish List     | My Wish List              | /index.php?route=account/wishlist      |
      | Newsletter    | Newsletter Subscription   | /index.php?route=account/newsletter    |
