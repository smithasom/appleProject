Feature: Tests for apple site 

@buyipad
Scenario: Buy an ipad
	Given I navigate to apple site
	Then select on ipad link
	Then Click on Buy
	And Select a silver ipad with 32GB with wifi
	And Add apple care
	And Add to bag and checkout
	Then Enter shipping address
	And Enter credit card info
	Then Review order
