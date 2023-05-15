Feature: Book category

  Background: I should be able to see homepage

    Given I enter URL "https://demo.nopcommerce.com/" in browser
    And   I am on home page

  Scenario Outline: I should be able to see top menu tabs on homepage with categories
    When  I am on homepage
    Then  I should be able to see top menu tabs with "<categories>"
    Examples:
      | Categories        |
      | Computer          |
      | Electronic        |
      | Apparel           |
      | Digital downloads |
      | Books             |
      | Jewellery         |
      | Gift Card         |

  Scenario Outline: I should be able to see book page with filters

    When  I select book category from top menu tabs on homepage
    Then  I should be navigated to book category
    And   I should be able to see "<filters>"

    Examples:
      | filters  |
      | short by |
      | Display  |
      | the Grid |
      | List Tab |

    Scenario Outline: I should be able to see list of terms of each filter
      Given   I am on book page
      When    I click on "<filters>"
      Then    I should be able to see "<list>" in dropdown menu
      Examples:
      | filters |  list                                                                              |
      | sort by | Name: A to Z, Name : Z to A, Price : Low to High, Price : High to Low, Created on  |
      | Display | 3,6,9                                                                              |

      Scenario Outline: I should be able to choose any filter option with specific result
        Given   I am on book page
        When    I click on "<filters>"
        And     I click on any "<option>"
        Then    I shuld be able to choose any filter option from the list
        And     I shold be able to see "<result>"
        Examples:
        | filter  | option              | result                                                            |
        | sort by | Name: A to Z        | sorted product with the product name in alphabetical order A to Z |
        | sort by | Name: Z to A        | sorted product with the product name in alphabetical order Z to A |
        | sort by | Price : Low to High | sorted the product with the descending order                      |
        | sort by | Price : High to Low | sorted the product with the ascending order                       |
        | sort by | Created on          | Recently added products should be shown first                     |
        | Display | 3                   | 3 products in a page                                              |
        | Display | 6                   | 6 products in a page                                              |
        | Display | 9                   | 9 products in a page                                              |

      Scenario Outline: I should be able to see product display format according display format type as per given picture in srs document
        Given   I am on book page
        When    I click on "<display format icon>"
        Then    I should be able to see product display format according display format type as per given picture in srs document
        Examples:
        | display format icon |
        | Grid                |
        | List                |


