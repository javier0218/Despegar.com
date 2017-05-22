package modules;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

import pageobjects.SearchHotelPage;

/**
 * 
 * @author javier
 *
 */
public class SearchHotelsActions {

	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	public static void openBrowser(WebDriver driver) throws InterruptedException {
		driver.get("https://www.despegar.com.ar/hoteles/");
		driver.getTitle();
		assertEquals("https://www.despegar.com.ar/hoteles/", driver.getCurrentUrl());
		Thread.sleep(1000);
	}

	public static void clickOnHotelsMenu(WebDriver driver, String menu) {

		SearchHotelPage.menuHotels.click();
		assertEquals(menu, SearchHotelPage.tittlePageHotels.getText());

	}

	public static void enterCityHotel(WebDriver driver, String city) throws InterruptedException {

		SearchHotelPage.inputCity.sendKeys(city);

		Thread.sleep(1000);

		SearchHotelPage.inputCity.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

	}

	public static void enterCheckIn(WebDriver driver) throws InterruptedException {

		// Suma el dia actual mas 10 dias
		Calendar date = new GregorianCalendar();
		date.add(Calendar.DAY_OF_MONTH, 10);
		int day = date.get(Calendar.DAY_OF_MONTH);

		String dateCheckIn = String.valueOf(day);

		SearchHotelPage.input_checkIn.click();
		Thread.sleep(1000);

		List<WebElement> datesMonthStart = driver.findElements(By.xpath("//div[@data-month='2017-06']/div[4]/span"));

		for (WebElement webElement : datesMonthStart) {

			if (webElement.getText().equalsIgnoreCase(dateCheckIn)) {
				webElement.click();
			}

		}
		Thread.sleep(100);

	}

	public static void enterCheckOut(WebDriver driver) throws InterruptedException {

		// Estadia de 3 noches a partir de + 10 dias
		Calendar date = new GregorianCalendar();
		date.add(Calendar.DAY_OF_MONTH, 13);
		int day = date.get(Calendar.DAY_OF_MONTH);

		String dateCheckOut = String.valueOf(day);

		SearchHotelPage.input_checkOut.click();
		Thread.sleep(1000);

		List<WebElement> dateMonthEnd = driver.findElements(By.xpath("//div[@data-month='2017-06']/div[4]/span"));

		for (WebElement webElement : dateMonthEnd) {

			if (webElement.getText().equalsIgnoreCase(dateCheckOut)) {
				webElement.click();
			}
		}
		Thread.sleep(100);

	}

	public static void select_room(WebDriver driver, String numberRoom) throws InterruptedException {

		Select selectRoom = new Select(SearchHotelPage.select_rooms);
		selectRoom.selectByValue(numberRoom);
		Thread.sleep(1000);

	}

	/**
	 * 
	 * @param driver
	 * @param numberAdults
	 * @throws InterruptedException
	 */

	public static void select_adults(WebDriver driver, String numberAdults) throws InterruptedException {

		Select selectAdults = new Select(SearchHotelPage.select_adults);
		selectAdults.selectByValue(numberAdults);
		Thread.sleep(1000);

	}

	/**
	 * 
	 * @param driver
	 * @param minors
	 * @throws InterruptedException
	 */
	public static void select_minors(WebDriver driver, String minors) throws InterruptedException {

		Select selectMinors = new Select(SearchHotelPage.select_minors);
		selectMinors.selectByValue(minors);
		Thread.sleep(1000);

	}

	/**
	 * 
	 * @param driver
	 * @param ageMinor
	 * @throws InterruptedException
	 */

	public static void select_ageMinor(WebDriver driver, String ageMinor) throws InterruptedException {
		Select selectAgeMinor = new Select(SearchHotelPage.select_age);
		selectAgeMinor.selectByValue(ageMinor);
		Thread.sleep(1000);

	}

	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	public static void click_searchHotelsButton(WebDriver driver) throws InterruptedException {

		SearchHotelPage.btnSearchHotels.click();

		Thread.sleep(4000);

		// Verifica si despliega lista de resultados
		assertTrue(SearchHotelPage.HotelContainer.isDisplayed());

	}

	public static void select_startsHotel(WebDriver driver) throws InterruptedException {
		SearchHotelPage.select_StartsHotel.click();

		Thread.sleep(4000);

		// Verifica si despliega lista de resultados
		assertTrue(SearchHotelPage.HotelContainer.isDisplayed());

	}

	public static void select_lowestValuePriceNight(WebDriver driver) throws InterruptedException {

		
		Select price = new Select(SearchHotelPage.select_sortingPrice);
		price.selectByValue("price_ascending");

		List<WebElement> listPrices = driver.findElements(By.xpath("//li[@class='hf-pricebox-price']"));

		double min = 0;
		for (int i = 0; i < listPrices.size(); i++) {

			if (Double.parseDouble(listPrices.get(i).getText().substring(2)) < min) {

				min = Double.parseDouble(listPrices.get(i).getText().substring(2));

				WebElement numberLowest = driver.findElement(By.xpath("//li[text()=" + min + "]"));

				System.out.println("Precio mas bajo---" + min);

				numberLowest.click();

			}
		}

		Thread.sleep(5000);

		SearchHotelPage.btn_DetailHotel.click();

		Thread.sleep(4000);

		
		// Opcion Nro.2 Usar el Slider
				// ((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
				//
				// Actions moveSlider = new Actions(driver);
				// moveSlider = moveSlider.dragAndDrop(SearchHotelPage.drag,
				// SearchHotelPage.drop);
				// moveSlider.build().perform();
	}

	public static void detailRoom(WebDriver driver) {

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		// This will return the number of windows opened by Webdriver and will
		// return Set of St//rings
		Set<String> s1 = driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			// Here we will compare if parent window is not equal to child
			// window then we will close

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());

				assertTrue(SearchHotelPage.detail_room.isDisplayed());

				driver.close();
			}
		}
		// once all pop up closed now switch to parent window
		driver.switchTo().window(parent);

	}

	public static void detailAvalaibleRooms(WebDriver driver) {

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		// This will return the number of windows opened by Webdriver and will
		// return Set of St//rings
		Set<String> s1 = driver.getWindowHandles();

		// Now we will iterate using Iterator
		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			// Here we will compare if parent window is not equal to child
			// window then we will close

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				((JavascriptExecutor) driver).executeScript("scroll(0,900)");
				assertEquals("Habitaciones disponibles", SearchHotelPage.title_avalaible_room.getText());
				assertTrue(SearchHotelPage.avalaible_room.isDisplayed());
				driver.close();
			}
		}
		// once all pop up closed now switch to parent window
		driver.switchTo().window(parent);
	}

}
