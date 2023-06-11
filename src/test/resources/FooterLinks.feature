@FooterSuite
Feature: Footer Navigation

  Background: Navigate through the footer
    Given the user is on the home page

  @InformationOk
  Scenario Outline: Verify the navigation through Information links
    When the user clicks on "<list>" in the Information section of the footer
    Then the user should be redirected to the corresponding page with the title: "<title>"
    Examples:
      | list                 | title                |
      | About Us             | About Us             |
      | Delivery Information | Delivery Information |
      | Privacy Policy       | Privacy Policy       |
      | Terms & Conditions   | Terms & Conditions   |

  @CustomerServiceOk
  Scenario Outline: Verify the navigation through Customer Service links
    When the user clicks on "<list>" in the Customer Service section of the footer
    Then the user should be redirected to the corresponding URL "<url>" with the title: "<title>"
    Examples:
      | list       | title      | url                                                              |
      | Contact Us | Contact Us | http://opencart.abstracta.us/index.php?route=information/contact |
      | Returns    | Account    | https://opencart.abstracta.us/index.php?route=account/return/add |
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
    When the user is logged in
    And clicks on "<list>" in the My Account section of the footer
    Then the user should be redirected to the URL "<url>" with the title: "<title>"

    Examples:
      | list          | title      | url                                                              |
      | My Account    | My Account | https://opencart.abstracta.us/index.php?route=account/account    |
      | Order History | Account    | https://opencart.abstracta.us/index.php?route=account/order      |
      | Wish List     | Account    | https://opencart.abstracta.us/index.php?route=account/wishlist   |
      | Newsletter    | Account    | https://opencart.abstracta.us/index.php?route=account/newsletter |
