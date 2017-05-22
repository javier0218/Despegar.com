package step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.SearchFlightsActions;
import modules.SearchHotelsActions;
import pageobjects.SearchFlightPage;
import pageobjects.SearchHotelPage;

/**
 * 
 * @author javier
 *
 */

public class SearchHotelSteps {

	public WebDriver driver;

	public SearchHotelSteps() {
		driver = Hooks.driver;

	}

	@Given("^I open despegar website$")
	public void i_open_despegar_website() throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.openBrowser(driver);

		

	}

	@When("^I click on Hotel \"(.*?)\" menu$")
	public void i_click_on_menu(String menu) throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.clickOnHotelsMenu(driver, menu);

	}

	@When("^I enter city name \"(.*?)\"$")
	public void i_enter_city_name(String city) throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.enterCityHotel(driver, city);

	}

	@When("^I enter CheckIn$")
	public void i_enter_CheckIn() throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.enterCheckIn(driver);

	}

	@When("^I enter CheckOut$")
	public void i_enter_CheckOut() throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.enterCheckOut(driver);

	}

	@When("^I enter \"(.*?)\" adult room$")
	public void i_enter_adult_room(String numberRoom) throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.select_room(driver, numberRoom);

	}

	@When("^I enter \"(.*?)\" Adults$")
	public void i_enter_Adults(String numberAdults) throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.select_adults(driver, numberAdults);

	}

	@When("^I enter \"(.*?)\" minor$")
	public void i_enter_minor(String minors) throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.select_minors(driver, minors);

	}

	@When("^I enter \"(.*?)\" minor age$")
	public void i_enter_minor_age(String ageMinor) throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.select_ageMinor(driver, ageMinor);

	}

	@When("^Loading page of avalaible hotels$")
	public void loading_page_of_avalaible_hotels() throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.click_searchHotelsButton(driver);

	}

	@When("^I select \"(.*?)\" starts hotels$")
	public void i_select_starts_hotels(String arg1) throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.select_startsHotel(driver);
		Thread.sleep(1000);

	}

	@When("^I select the Hotel with lowest value per night$")
	public void i_select_the_Hotel_with_lowest_value_per_night() throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.select_lowestValuePriceNight(driver);
		Thread.sleep(1000);

	}

	@When("^I see the detail Hotel$")
	public void i_see_the_detail_Hotel() throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.detailRoom(driver);

	}

	@Then("^Load a page new with available rooms$")
	public void load_a_page_new_with_available_rooms() throws Throwable {

		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelsActions.detailAvalaibleRooms(driver);

	}

}
