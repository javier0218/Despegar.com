package pageobjects;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchFlightPage extends BaseClass {

	public SearchFlightPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(how = How.XPATH, using = "//li/a[@href='//www.despegar.com.ar/vuelos/']")
	public static WebElement linkFlight;

	

	@FindBy(how = How.XPATH, using = "//div[@class='sbox-ui sbox-searchbox']/span")
	public static WebElement titleFlight;

	@FindBy(how = How.XPATH, using = "//div[@class='sbox-ui-input-icon sbox-ui-voice-mobile']/input")
	public static WebElement origin;

	@FindBy(how = How.XPATH, using = "//div/input[@class='sbox-ui-input sbox-destination sbox-destination-input-segment-1']")
	public static WebElement destiny;

	@FindBy(how = How.XPATH, using = "//div/input[@id='flights-date']")
	public static WebElement departuredate;

	@FindBy(how = How.XPATH, using = "//div/input[@class='sbox-ui-input ux-hide-error sbox-dateout sbox-dateout-error']")
	public static WebElement returndate;

	@FindBy(how = How.XPATH, using = "//div/select[@class='sbox-ui-select sbox-passengers-adults-select']")
	public static WebElement adults;

	@FindBy(how = How.XPATH, using = ".//div/select[@class='sbox-ui-select sbox-passengers-childrens-select']")
	public static WebElement minors;

	@FindBy(how = How.XPATH, using = "//div/a[@class='sbox-ui-button secondary large sbox-search']")
	public static WebElement btnSearch;

	@FindBy(how = How.XPATH, using = "//div[@class='matrix-scales-summary']/p")
	public static WebElement labelSummary;

	@FindBy(how = How.XPATH, using = "//div[@id='clusters']/span[1]/cluster/div/div[2]/fare/div/span/span/buy-button/a")
	public static WebElement btnBuyFlight;

	@FindBy(how = How.XPATH, using = "//div/span[@class='fare-detail-title']")
	public static WebElement detailBuyTittle;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='passengers']/span/div/span")
	public static WebElement labelTittlePasenger;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='passengers']")
	public static WebElement sectorPassenger;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='payment']/span")
	public static WebElement labelTittleFormPay;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='payment']/span")
	public static WebElement sectorFormPay;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='invoice']/span")
	public static WebElement labelTittleDatesFact;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='invoice']")
	public static WebElement sectorDatesFact;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='contact']/span")
	public static WebElement labelTittleContactInformation;

	@FindBy(how = How.XPATH, using = "//fieldset[@id='contact']")
	public static WebElement sectorTittleContactInformation;

}
