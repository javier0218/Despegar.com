package modules;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageobjects.SearchFlightPage;

/**
 * 
 * @author javier Clase de operaciones
 *
 */
public class SearchFlightsActions {

	public static void openBrowser(WebDriver driver) throws InterruptedException {
		driver.get("https://www.despegar.com.ar/vuelos/");
		driver.getTitle();
		assertEquals("https://www.despegar.com.ar/vuelos/", driver.getCurrentUrl());
		Thread.sleep(1000);

	}

	public static void clickOnFlightMenu(WebDriver driver, String menu) throws InterruptedException {

		SearchFlightPage.linkFlight.click();
		assertEquals("https://www.despegar.com.ar/vuelos/", driver.getCurrentUrl());
		assertEquals(menu, SearchFlightPage.titleFlight.getText());
		Thread.sleep(1000);

	}

	public static void write_origin(WebDriver driver, String originDate) throws InterruptedException {

		SearchFlightPage.origin.clear();
		SearchFlightPage.origin.sendKeys(originDate);
		Thread.sleep(1000);
		SearchFlightPage.origin.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

	}

	public static void write_destiny(WebDriver driver, String destiny) throws InterruptedException {

		SearchFlightPage.destiny.sendKeys(destiny);
		Thread.sleep(1000);
		SearchFlightPage.destiny.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

	}

	/**
	 * 
	 * @param driver
	 * @param date
	 * @throws InterruptedException
	 */
	public static void select_departureDate(WebDriver driver, int date) throws InterruptedException {

		SearchFlightPage.departuredate.click();

		List<WebElement> listCalendar1 = driver.findElements(By.xpath("//div[@data-month='2017-05']/div[4]/span"));

		String digite = Integer.toString(date);

		for (WebElement webElement : listCalendar1) {

			String departure = webElement.getText();

			if (departure.equalsIgnoreCase(digite)) {
				webElement.click();
				break;
			}

		}

		Thread.sleep(1000);

	}

	public static void select_returnDate(WebDriver driver, int date) throws InterruptedException {
		SearchFlightPage.returndate.click();

		List<WebElement> listCalendar2 = driver.findElements(By.xpath("//div[@data-month='2017-06']/div[4]/span"));

		String digite = Integer.toString(date);

		for (WebElement webElement : listCalendar2) {

			String returnDat = webElement.getText();

			if (returnDat.equalsIgnoreCase(digite)) {
				webElement.click();
				break;
			}

		}

		Thread.sleep(1000);
	}

	public static void select_Adults(WebDriver driver, int number) throws InterruptedException {

		Select selectAdults = new Select(SearchFlightPage.adults);
		selectAdults.selectByIndex(number);

		Thread.sleep(1000);

	}

	public static void select_Minors(WebDriver driver, int number) throws InterruptedException {
		Select selectMinor = new Select(SearchFlightPage.minors);
		selectMinor.selectByIndex(number);
		Thread.sleep(1000);
	}

	public static void click_OnSearchBtn(WebDriver driver) throws InterruptedException {

		SearchFlightPage.btnSearch.click();

		Thread.sleep(4000);
	}

	public static void listFlights(WebDriver driver) throws InterruptedException {

		// Verifica si llega a la pagina de resultado de vuelos
		assertTrue(SearchFlightPage.labelSummary.isEnabled());

		List<WebElement> listFlights = driver.findElements(By.xpath("//div[@id='clusters']/span"));

		// Verifica si en la consulta trae una lista de vuelos
		assertTrue(listFlights.size() > 0);

		Thread.sleep(1000);

	}

	/**
	 * Clase que busca el precio de vuelo mas alto
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	public static void select_highestPriceList(WebDriver driver) throws InterruptedException {

		// Lista con todo los precios de la primera pestaña
		List<WebElement> listPrices = driver
				.findElements(By.xpath("//airlines-matrix-airline/ul/li/span/flights-price/span/em/span[2]"));

		double higest = 0;

		for (int i = 0; i < listPrices.size(); i++) {

			if (Double.parseDouble(listPrices.get(i).getText()) > higest) {

				higest = Double.parseDouble(listPrices.get(i).getText());

				WebElement numberHigest = driver.findElement(
						By.xpath("//airlines-matrix-airline/ul/li/span/flights-price/span/em/span[contains(text(),'"
								+ higest + "')]"));

				numberHigest.click();
				Thread.sleep(1000);

			}

		}

	}

	public static void click_OnBuyFlight(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);

		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");

		SearchFlightPage.btnBuyFlight.click();

		Thread.sleep(1000);

	}

	public static void review_fieldsBuyFlight(WebDriver driver) throws InterruptedException {

		// Valido existencia de titulo Pasajeros
		assertEquals("Pasajeros", SearchFlightPage.labelTittlePasenger.getText());

		// Valido existencia de sector Pasajero
		assertTrue(SearchFlightPage.sectorPassenger.isEnabled());

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("scroll(0,400)");

		// Valido existencia de titulo
		assertEquals("Forma de pago", SearchFlightPage.labelTittleFormPay.getText());
		// Valido existencia de sector
		assertTrue(SearchFlightPage.sectorFormPay.isEnabled());

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("scroll(0,400)");

		// Valido existencia de titulo
		assertEquals("Datos para la emisión de la factura", SearchFlightPage.labelTittleDatesFact.getText());
		// Valido existencia de sector
		assertTrue(SearchFlightPage.sectorDatesFact.isEnabled());

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("scroll(0,400)");

		// Valido existencia de titulo
		assertEquals("Información de contacto", SearchFlightPage.labelTittleContactInformation.getText());
		// Valido existencia de sector
		assertTrue(SearchFlightPage.sectorTittleContactInformation.isEnabled());

	}

}
