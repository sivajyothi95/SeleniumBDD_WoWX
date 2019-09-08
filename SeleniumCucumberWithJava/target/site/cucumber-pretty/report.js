$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Ecommerce_PlaceOrder.feature");
formatter.feature({
  "line": 1,
  "name": "Ecommerce_PlaceOrder",
  "description": "This feature helps to validate adding items to cart and placing the order.",
  "id": "ecommerce-placeorder",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3689381415,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify customer should be able to add 2 items to the cart and place an order",
  "description": "",
  "id": "ecommerce-placeorder;verify-customer-should-be-able-to-add-2-items-to-the-cart-and-place-an-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to automation practice website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I add two products to cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to place the order successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "PlaceOrderStepDef.iNavigateToAutoPracticeWebsite()"
});
formatter.result({
  "duration": 10791015563,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepDef.addTwoProductsToCart()"
});
formatter.result({
  "duration": 5407743366,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepDef.iShouldBeAbleToPlaceTheOrderSuccessfully()"
});
formatter.result({
  "duration": 13261529994,
  "status": "passed"
});
formatter.after({
  "duration": 779254434,
  "status": "passed"
});
});