package step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.SearchFlightsActions;
import pageobjects.SearchFlightPage;

/**
 * 
 * @author javier
 *
 */
public class SearchHighestPriceSteps {

	public WebDriver driver;

	public SearchHighestPriceSteps() {
		driver = Hooks.driver;

	}

	/**
	 * Steps for the TEST_2
	 */

	@When("^I select on list the highest price$")
	public void i_select_on_list_the_highest_price() throws Throwable {

		PageFactory.initElements(driver, SearchFlightPage.class);

		SearchFlightsActions.select_highestPriceList(driver);
		Thread.sleep(1000);

	}

	@When("^I click on buy button$")
	public void i_click_on_buy_button() throws Throwable {

		PageFactory.initElements(driver, SearchFlightPage.class);
		SearchFlightsActions.click_OnBuyFlight(driver);
		Thread.sleep(1000);

	}

	@Then("^Load the purchase detail module$")
	public void load_the_purchase_detail_module() throws Throwable {

		PageFactory.initElements(driver, SearchFlightPage.class);
		SearchFlightsActions.review_fieldsBuyFlight(driver);
		Thread.sleep(1000);

	}

}
