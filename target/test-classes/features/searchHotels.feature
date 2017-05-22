Feature: Hotel search in Despegar.com

@Tes3
Scenario: Hotel Search and Reserve
Given I open despegar website
When  I click on Hotel "Hoteles" menu
And   I enter city name "Montevideo"
And   I enter CheckIn
And   I enter CheckOut
And   I enter "1" adult room
And   I enter "2" Adults
And   I enter "1" minor
And   I enter "12" minor age
And   Loading page of avalaible hotels
And   I select "5" starts hotels
And   I select the Hotel with lowest value per night
And   I see the detail Hotel
Then  Load a page new with available rooms