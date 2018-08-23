$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/buyIpad.feature");
formatter.feature({
  "line": 1,
  "name": "Tests for apple site",
  "description": "",
  "id": "tests-for-apple-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Buy an ipad",
  "description": "",
  "id": "tests-for-apple-site;buy-an-ipad",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@buyipad"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to apple site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "select on ipad link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on Buy",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Select a silver ipad with 32GB with wifi",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Add apple care",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Add to bag and checkout",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Enter shipping address",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Enter credit card info",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Review order",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyIpad.i_navigate_to_apple_site()"
});
formatter.result({
  "duration": 33855598693,
  "status": "passed"
});
formatter.match({
  "location": "BuyIpad.select_on_ipad_link()"
});
formatter.result({
  "duration": 1412568128,
  "status": "passed"
});
formatter.match({
  "location": "BuyIpad.click_on_Buy()"
});
formatter.result({
  "duration": 4998793521,
  "status": "passed"
});
formatter.match({
  "location": "BuyIpad.select_a_silver_ipad_with32GB_with_wifi()"
});
formatter.result({
  "duration": 6564007579,
  "status": "passed"
});
formatter.match({
  "location": "BuyIpad.add_apple_care()"
});
formatter.result({
  "duration": 4275658679,
  "status": "passed"
});
formatter.match({
  "location": "BuyIpad.add_to_bag_and_checkout()"
});
formatter.result({
  "duration": 21165453145,
  "status": "passed"
});
formatter.match({
  "location": "BuyIpad.enter_shipping_address()"
});
formatter.result({
  "duration": 18476561148,
  "status": "passed"
});
formatter.match({
  "location": "BuyIpad.enter_credit_card_info()"
});
formatter.result({
  "duration": 2814395038,
  "status": "passed"
});
formatter.match({
  "location": "BuyIpad.review_order()"
});
formatter.result({
  "duration": 2243996380,
  "status": "passed"
});
});