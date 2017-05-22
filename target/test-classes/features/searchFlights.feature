Feature: Flight search in Despegar.com
	
@Test1
Scenario: Flight Search
Given I open despegar.com website
When  I click on "Vuelos" menu
And   I enter on origin "Buenos Aires" field
And   I enter on destiny "Lima" field
And   I enter on departure date 30 of may
And   I enter on return date 2 of june
And   I enter on adults field
And   I enter on minors field
And   I click on the flight search button
Then  List all diferents options flights


@Test2
Scenario: Flight Search and Buy
Given I open despegar.com website
When  I click on "Vuelos" menu
And   I enter on origin "Buenos Aires" field
And   I enter on destiny "Lima" field
And   I enter on departure date 30 of may
And   I enter on return date 2 of june
And   I enter on adults field
And   I enter on minors field
And   I click on the flight search button
And   List all diferents options flights
And   I select on list the highest price
And   I click on buy button
Then  Load the purchase detail module










	


