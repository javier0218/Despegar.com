package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = "//div/span[@class='eva-close eva-icon-close-circled']")
	public static WebElement btn_closePopUp;
	
	@FindBy(how = How.XPATH, using = "//li/a[@href='//www.despegar.com.ar/hoteles/']")
	public static WebElement menuHotels;

	@FindBy(how = How.XPATH, using = "//div/span[@class='sbox-ui-title sbox-title']")
	public static WebElement tittlePageHotels;

	@FindBy(how = How.XPATH, using = "//div/input[@class='sbox-main-focus sbox-ui-input sbox-ui-event-show-autocomplete sbox-destination sbox-hotels-destination']")
	public static WebElement inputCity;

	@FindBy(how = How.XPATH, using = "//div/input[@class='sbox-ui-input sbox-checkin-date']")
	public static WebElement input_checkIn;

	@FindBy(how = How.XPATH, using = "//div[@data-month='2017-05']")
	public static WebElement select_checkIn;

	@FindBy(how = How.XPATH, using = "//div/input[@class='sbox-ui-input sbox-checkout-date']")
	public static WebElement input_checkOut;

	@FindBy(how = How.XPATH, using = "//div[@data-month='2017-06']")
	public static WebElement select_checkOut;

	@FindBy(how = How.XPATH, using = "//div/select[@class='sbox-ui-select sbox-rooms sbox-hotels-rooms']")
	public static WebElement select_rooms;

	@FindBy(how = How.XPATH, using = "//div/select[@class='sbox-ui-select sbox-adults sbox-single-room-adults sbox-hotels-single-room-adults']")
	public static WebElement select_adults;

	@FindBy(how = How.XPATH, using = "//div/select[@class='sbox-ui-select sbox-minors sbox-single-room-minors sbox-hotels-single-room-minors']")
	public static WebElement select_minors;

	@FindBy(how = How.XPATH, using = "//div/select[@class='sbox-ui-select sbox-single-room-minor-1-age sbox-hotels-single-room-minor-age-focus']")
	public static WebElement select_age;

	@FindBy(how = How.XPATH, using = "//div/a[@class='sbox-ui-button secondary sbox-search large']")
	public static WebElement btnSearchHotels;
	
	@FindBy(how = How.XPATH, using = "//*[@id='hotels']/li")
	public static WebElement HotelContainer;
	
	@FindBy(how = How.XPATH, using = "//label/input[@value='5']")
	public static WebElement  select_StartsHotel;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='minPrice']")
	public static WebElement input_lowestValueNight;
	
	@FindBy(how = How.XPATH, using = "//span[@class='hf-minPrice']")
	public static WebElement min_price;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='maxPrice']")
	public static WebElement input_bigestValueNight;
	
	
	@FindBy(how = How.ID, using = "priceRangeApplyButton")
	public static WebElement btnApplyLowestPrice;
	
	@FindBy(how = How.XPATH, using = "//li/a[@class='hf-hide-small']")
	public static WebElement btn_DetailHotel;
	
	
	@FindBy(how = How.XPATH, using = "//div/span[@class='hf-filters-slider-bar']")
	public static WebElement slider_bar;
	
	@FindBy(how = How.XPATH, using = "//div/span/span/span[2]")
	public static WebElement drag;
	
	@FindBy(how = How.XPATH, using = "//div/span/span/span[1]")
	public static WebElement drop;
	
	@FindBy(how = How.XPATH, using = "//div[@id='hf-price-box-best-room']")
	public static WebElement detail_room;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='hf-rooms']/div[2]")
	public static WebElement avalaible_room;
	
	@FindBy(how = How.XPATH, using = "//div[@id='hf-rooms']/div[1]/div/h4")
	public static WebElement title_avalaible_room;
	
	@FindBy(how = How.ID, using = "sorting")
	public static WebElement select_sortingPrice;
	
	
	

}
