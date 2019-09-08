Feature: Ecommerce_PlaceOrder
  This feature helps to validate adding items to cart and placing the order.

  Scenario: Verify customer should be able to add 2 items to the cart and place an order
    Given I navigate to automation practice website
    When I add two products to cart
    Then I should be able to place the order successfully