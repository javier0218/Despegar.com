$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/searchFlights.feature");
formatter.feature({
  "line": 1,
  "name": "Flight search in Despegar.com",
  "description": "",
  "id": "flight-search-in-despegar.com",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14241171114,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Flight Search",
  "description": "",
  "id": "flight-search-in-despegar.com;flight-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open despegar.com website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Vuelos\" menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter on origin \"Buenos Aires\" field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter on destiny \"Lima\" field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter on departure date 30 of may",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter on return date 2 of june",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter on adults field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter on minors field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on the flight search button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "List all diferents options flights",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFlightsSteps.i_open_despegar_com_website()"
});
formatter.result({
  "duration": 16136705489,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vuelos",
      "offset": 12
    }
  ],
  "location": "SearchFlightsSteps.i_click_on_menu(String)"
});
formatter.result({
  "duration": 2482094368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buenos Aires",
      "offset": 19
    }
  ],
  "location": "SearchFlightsSteps.i_enter_on_origin_field(String)"
});
formatter.result({
  "duration": 4881006656,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lima",
      "offset": 20
    }
  ],
  "location": "SearchFlightsSteps.i_enter_on_destiny_field(String)"
});
formatter.result({
  "duration": 3719809394,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 26
    }
  ],
  "location": "SearchFlightsSteps.i_enter_on_departure_date_of_may(int)"
});
formatter.result({
  "duration": 4683622647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 23
    }
  ],
  "location": "SearchFlightsSteps.i_enter_on_return_date_of_june(int)"
});
formatter.result({
  "duration": 2679505461,
  "status": "passed"
});
formatter.match({
  "location": "SearchFlightsSteps.i_enter_on_adults_field()"
});
formatter.result({
  "duration": 2436459393,
  "status": "passed"
});
formatter.match({
  "location": "SearchFlightsSteps.i_enter_on_minors_field()"
});
formatter.result({
  "duration": 2287893145,
  "status": "passed"
});
formatter.match({
  "location": "SearchFlightsSteps.i_click_on_the_flight_search_button()"
});
formatter.result({
  "duration": 21052934946,
  "status": "passed"
});
formatter.match({
  "location": "SearchFlightsSteps.list_all_diferents_options_flights()"
});
formatter.result({
  "duration": 9214547907,
  "status": "passed"
});
formatter.after({
  "duration": 2759085774,
  "status": "passed"
});
formatter.before({
  "duration": 4677532019,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Flight Search and Buy",
  "description": "",
  "id": "flight-search-in-despegar.com;flight-search-and-buy",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I open despegar.com website",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I click on \"Vuelos\" menu",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I enter on origin \"Buenos Aires\" field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter on destiny \"Lima\" field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter on departure date 30 of may",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter on return date 2 of june",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter on adults field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter on minors field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on the flight search button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "List all diferents options flights",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select on list the highest price",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on buy button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Load the purchase detail module",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFlightsSteps.i_open_despegar_com_website()"
});
formatter.result({
  "duration": 14947982218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vuelos",
      "offset": 12
    }
  ],
  "location": "SearchFlightsSteps.i_click_on_menu(String)"
});
formatter.result({
  "duration": 2452889970,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buenos Aires",
      "offset": 19
    }
  ],
  "location": "SearchFlightsSteps.i_enter_on_origin_field(String)"
});
formatter.result({
  "duration": 4937665249,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lima",
      "offset": 20
    }
  ],
  "location": "SearchFlightsSteps.i_enter_on_destiny_field(String)"
});
formatter.result({
  "duration": 3645960230,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 26
    }
  ],
  "location": "SearchFlightsSteps.i_enter_on_departure_date_of_may(int)"
});
formatter.result({
  "duration": 4561762088,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 23
    }
  ],
  "location": "SearchFlightsSteps.i_enter_on_return_date_of_june(int)"
});
formatter.result({
  "duration": 2710572504,
  "status": "passed"
});
formatter.match({
  "location": "SearchFlightsSteps.i_enter_on_adults_field()"
});
formatter.result({
  "duration": 2423848898,
  "status": "passed"
});
formatter.match({
  "location": "SearchFlightsSteps.i_enter_on_minors_field()"
});
formatter.result({
  "duration": 2272627181,
  "status": "passed"
});
formatter.match({
  "location": "SearchFlightsSteps.i_click_on_the_flight_search_button()"
});
formatter.result({
  "duration": 34909370218,
  "status": "passed"
});
formatter.match({
  "location": "SearchFlightsSteps.list_all_diferents_options_flights()"
});
formatter.result({
  "duration": 2199300821,
  "status": "passed"
});
formatter.match({
  "location": "SearchHighestPriceSteps.i_select_on_list_the_highest_price()"
});
formatter.result({
  "duration": 1738325032,
  "status": "passed"
});
formatter.match({
  "location": "SearchHighestPriceSteps.i_click_on_buy_button()"
});
formatter.result({
  "duration": 30649113469,
  "status": "passed"
});
formatter.match({
  "location": "SearchHighestPriceSteps.load_the_purchase_detail_module()"
});
formatter.result({
  "duration": 17446261356,
  "status": "passed"
});
formatter.after({
  "duration": 1275660594,
  "status": "passed"
});
formatter.uri("features/searchHotels.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel search in Despegar.com",
  "description": "",
  "id": "hotel-search-in-despegar.com",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4277154320,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Hotel Search and Reserve",
  "description": "",
  "id": "hotel-search-in-despegar.com;hotel-search-and-reserve",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Tes3"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open despegar website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Hotel \"Hoteles\" menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter city name \"Montevideo\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter CheckIn",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter CheckOut",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter \"1\" adult room",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"2\" Adults",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter \"1\" minor",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter \"12\" minor age",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Loading page of avalaible hotels",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select \"5\" starts hotels",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select the Hotel with lowest value per night",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I see the detail Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Load a page new with available rooms",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotelSteps.i_open_despegar_website()"
});
formatter.result({
  "duration": 13969080279,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hoteles",
      "offset": 18
    }
  ],
  "location": "SearchHotelSteps.i_click_on_menu(String)"
});
formatter.result({
  "duration": 485831146,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Montevideo",
      "offset": 19
    }
  ],
  "location": "SearchHotelSteps.i_enter_city_name(String)"
});
formatter.result({
  "duration": 3420346437,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelSteps.i_enter_CheckIn()"
});
formatter.result({
  "duration": 3794063588,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelSteps.i_enter_CheckOut()"
});
formatter.result({
  "duration": 3909038234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 9
    }
  ],
  "location": "SearchHotelSteps.i_enter_adult_room(String)"
});
formatter.result({
  "duration": 1279547154,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 9
    }
  ],
  "location": "SearchHotelSteps.i_enter_Adults(String)"
});
formatter.result({
  "duration": 1273061757,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 9
    }
  ],
  "location": "SearchHotelSteps.i_enter_minor(String)"
});
formatter.result({
  "duration": 1396022913,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 9
    }
  ],
  "location": "SearchHotelSteps.i_enter_minor_age(String)"
});
formatter.result({
  "duration": 1408790578,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelSteps.loading_page_of_avalaible_hotels()"
});
formatter.result({
  "duration": 17573564166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 10
    }
  ],
  "location": "SearchHotelSteps.i_select_starts_hotels(String)"
});
formatter.result({
  "duration": 5460993024,
  "status": "passed"
});
formatter.match({
  "location": "SearchHotelSteps.i_select_the_Hotel_with_lowest_value_per_night()"
});
formatter.result({
  "duration": 10050398074,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//li/a[@class\u003d\u0027hf-hide-small\u0027]\"}\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.28.455520 (cc17746adff54984afff480136733114c6b3704b),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 90 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027USER\u0027, ip: \u0027192.168.88.2\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.28.455520 (cc17746adff54984afff480136733114c6b3704b), userDataDir\u003dC:\\Users\\usuario\\AppData\\Local\\Temp\\scoped_dir7076_15624}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 0ad6b3ecb85f4297759de3c830a7b6b4\n*** Element info: {Using\u003dxpath, value\u003d//li/a[@class\u003d\u0027hf-hide-small\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:638)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:476)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\r\n\tat modules.SearchHotelsActions.select_lowestValuePriceNight(SearchHotelsActions.java:203)\r\n\tat step_definitions.SearchHotelSteps.i_select_the_Hotel_with_lowest_value_per_night(SearchHotelSteps.java:138)\r\n\tat ✽.And I select the Hotel with lowest value per night(features/searchHotels.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SearchHotelSteps.i_see_the_detail_Hotel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchHotelSteps.load_a_page_new_with_available_rooms()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://www.despegar.com.ar/search/Hotel/4844/2017-05-31/2017-06-03/2-12?from\u003dSB#sorting\u003dbest_selling_descending\u0026view\u003dlist");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1627700248,
  "status": "passed"
});
});