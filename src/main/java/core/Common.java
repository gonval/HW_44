package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Common {

	static WebDriver driver;

	public static void open(String url) {
		String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);
		driver = new HtmlUnitDriver();
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(USERAGENT);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("UserAgent: " + (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;"));
		System.out.println("Page URL: " + driver.getCurrentUrl());
	}
	
	public static void quite() {
		driver.quit();
	}

	public static boolean isPresent(By by) {
		if (driver.findElements(by).size() > 0) return true;
		else return false;
	}

	public static boolean isVisible(By by) {
		if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed()) return true;
		else return false;
	}
	
public static void pageValidation(String test_case, By el) {
		System.out.println(test_case +	(Common.isPresent(el) ? "Exists" : "Not exist")); 
}


	static By item_01 = By.id("id_quotes");						// signup
	
	static By item_02 = By.id("id_current_location");				// signup
	static By item_03 = By.id("id_weather_icon");					// signup
	static By item_04 = By.id("id_temperature");					// signup
	static By item_05 = By.id("id_f_title");						// signup & confirmation

	static By item_06 = By.id("id_f_label_fn");					// signup & confirmation
	static By item_07 = By.id("id_fname");							// signup & confirmation

	static By item_08 = By.id("id_f_label_ln");					// signup & confirmation
	static By item_09 = By.id("id_lname");							// signup & confirmation

	static By item_10 = By.id("id_f_label_ea");					// signup & confirmation
	static By item_11 = By.id("id_email");							// signup & confirmation

	static By item_12 = By.id("id_f_label_pn");					// signup & confirmation
	static By item_13 = By.id("id_phone");							// signup & confirmation

	static By item_14 = By.id("id_rb_label_g");					// signup & confirmation

	static By item_15 = By.id("id_rb_label_m");					// signup
	static By item_16 = By.id("id_gender_male");					// signup

	static By item_17 = By.id("id_rb_label_f");					// signup
	static By item_18 = By.id("id_gender_female");					// signup

	static By item_19 = By.id("id_f_label_s");						// signup & confirmation
	static By item_20 = By.id("id_state");							// signup & confirmation
	static By item_21 = By.xpath("//*[@id='id_state']/option[6]"); 	// signup

	static By item_22 = By.id("id_cb_label_t");					// signup & confirmation
	static By item_23 = By.id("id_terms");							// signup & confirmation

	static By item_24 = By.id("id_img_facebook");					// signup
	static By item_25 = By.id("id_img_twitter");					// signup
	static By item_26 = By.id("id_img_flickr");					// signup
	static By item_27 = By.id("id_img_youtube");					// signup

	static By item_28 = By.id("id_reset_button");					// signup
	static By item_29 = By.id("id_submit_button");					// signup

	static By item_30 = By.id("timestamp");						// signup
	static By item_31 = By.id("copyright");						// signup & confirmation
	static By item_32 = By.id("os_browser");						// signup

	static By item_33 = By.id("ErrorLine");						// signup
	static By item_34 = By.id("fname_error");						// signup
	static By item_35 = By.id("lname_error");						// signup
	static By item_36 = By.id("email_error");						// signup
	static By item_37 = By.id("phone_error");						// signup
	
	static By item_38 = By.xpath("//*[@id='fname_error']/img");		// signup
	static By item_39 = By.xpath("//*[@id='lname_error']/img");		// signup
	static By item_40 = By.xpath("//*[@id='email_error']/img");		// signup
	static By item_41 = By.xpath("//*[@id='phone_error']/img");		// signup
	
	static By item_42 = By.id("id_gender");						//confirmation
	static By item_43 = By.id("id_back_button");					//confirmation
	
}
