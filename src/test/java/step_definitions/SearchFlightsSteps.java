package step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.SearchFlightsActions;
import pageobjects.SearchFlightPage;

/**
 * 
 * @author javier
 *
 */
public class SearchFlightsSteps {

	public WebDriver driver;

	public SearchFlightsSteps() {
		driver = Hooks.driver;

	}

	@Given("^I open despegar\\.com website$")
	public void i_open_despegar_com_website() throws Throwable {

		PageFactory.initElements(driver, SearchFlightPage.class);

		SearchFlightsActions.openBrowser(driver);

	}

	@When("^I click on \"(.*?)\" menu$")
	public void i_click_on_menu(String menu) throws Throwable {

		PageFactory.initElements(driver, SearchFlightPage.class);
		SearchFlightsActions.clickOnFlightMenu(driver,menu);
		Thread.sleep(1000);

	}

	@When("^I enter on origin \"(.*?)\" field$")
	public void i_enter_on_origin_field(String originDate) throws Throwable {

		PageFactory.initElements(driver, SearchFlightPage.class);

		SearchFlightsActions.write_origin(driver, originDate);

		Thread.sleep(1000);

	}

	@When("^I enter on destiny \"(.*?)\" field$")
	public void i_enter_on_destiny_field(String destinyDate) throws Throwable {

		PageFactory.initElements(driver, SearchFlightPage.class);

		SearchFlightsActions.write_destiny(driver, destinyDate);

		Thread.sleep(1000);

	}

	@When("^I enter on departure date (\\d+) of may$")
	public void i_enter_on_departure_date_of_may(int date) throws Throwable {

		PageFactory.initElements(driver, SearchFlightPage.class);

		SearchFlightsActions.select_departureDate(driver, date);

		Thread.sleep(1000);

	}

	@When("^I enter on return date (\\d+) of june$")
	public void i_enter_on_return_date_of_june(int date) throws Throwable {

		PageFactory.initElements(driver, SearchFlightPage.class);

		SearchFlightsActions.select_returnDate(driver, date);

		Thread.sleep(1000);

	}

	@When("^I enter on adults field$")
	public void i_enter_on_adults_field() throws Throwable {

		PageFactory.initElements(driver, SearchFlightPage.class);

		SearchFlightsActions.select_Adults(driver, 1);
		Thread.sleep(1000);

	}

	@When("^I enter on minors field$")
	public void i_enter_on_minors_field() throws Throwable {

		SearchFlightsActions.select_Minors(driver, 0);
		Thread.sleep(1000);

	}

	@When("^I click on the flight search button$")
	public void i_click_on_the_flight_search_button() throws Throwable {

		SearchFlightsActions.click_OnSearchBtn(driver);
		Thread.sleep(8000);

	}

	@Then("^List all diferents options flights$")
	public void list_all_diferents_options_flights() throws Throwable {

		SearchFlightsActions.listFlights(driver);
		Thread.sleep(1000);
	}

}
