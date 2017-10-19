package chrome;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Linear {

	static WebDriver driver;
	static String url;
	static long start;
	static long finish;

	public static void open(String url) {
		String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";
		Logger.getLogger("").setLevel(Level.OFF);

//		String driverPath = "./resources/webdrivers/mac/geckodriver.sh";
//		System.setProperty("webdriver.gecko.driver", driverPath);
//		driver = new FirefoxDriver();
		
		String driverPath = "./resources/webdrivers/mac/chromedriver";
		System.setProperty("webdriver.chrome.driver", driverPath);
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars");
		option.addArguments("--disable-notifications");
		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
			option.addArguments("-start-fullscreen");
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
			option.addArguments("--start-maximized");
		else
			throw new IllegalArgumentException("Unknown OS");
		driver = new ChromeDriver(option);
		
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("Page URL: " + driver.getCurrentUrl());
		System.out.println("UserAgent: " + USERAGENT);
	}


	public static boolean isPresent(By by) {
		if (driver.findElements(by).size() > 0)
			return true;
		else
			return false;
	}

	public static boolean isVisible(By by) {
		if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed())
			return true;
		else
			return false;
	}

	// add id

	// static By el_01 = By.id("id_quotes"); // signup
	static By item_01 = By.xpath("//tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"); // sgnup
																									// area
	static By item_02 = By.xpath("//*[@id=\"id_f_title\"]"); // signup title
	static By item_03 = By.xpath("//*[@id=\"id_f_label_fn\"]"); // first name
																	// title
	static By item_04 = By.xpath("//*[@id=\"id_fname\"]"); // first name field
	static By item_05 = By.xpath("//*[@id=\"id_f_label_ea\"]"); // email title
	static By item_06 = By.xpath("//*[@id=\"id_email\"]"); // email field
	static By item_07 = By.xpath("//*[@id=\"id_rb_label_g\"]"); // gender
																	// title
	static By item_08 = By.xpath("//tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[2]"); // gender
																					// area
																					// male
	static By item_09 = By.xpath("//*[@id=\"id_rb_label_m\"]"); // gender text
																	// male
	static By item_10 = By.xpath("//*[@id=\"id_gender_male\"]"); // check
																	// button
																	// male
	static By item_11 = By.xpath("//table/tbody/tr/td[1]/table[2]/tbody/tr/td[4]"); // gender
																						// text
																						// female
	static By item_12 = By.xpath("//*[@id=\"id_rb_label_f\"]"); // signup &
																	// confirmation
	static By item_13 = By.xpath("//*[@id=\"id_gender_female\"]"); // check
																		// button
																		// mfeale
	static By item_14 = By.xpath("//*[@id=\"id_cb_label_t\"]"); // I agree
																	// text
	static By item_15 = By.xpath("//*[@id=\"id_terms\"]"); // I agree check
																// button
	static By item_16 = By.xpath("//*[@id=\"id_img_facebook\"]"); // facebook
	static By item_17 = By.xpath("//*[@id=\"id_img_twitter\"]"); // twitter
	static By item_18 = By.xpath("//*[@id=\"id_img_flickr\"]"); // flickr
	static By item_19 = By.xpath("//*[@id=\"id_img_youtube\"]"); // youtube
	static By item_20 = By.xpath("//*[@id=\"id_reset_button\"]"); // reset
																	// button
	static By item_21 = By.xpath("//*[@id=\"id_submit_button\"]"); // submit
																		// button
	static By item_22 = By.xpath("//*[@id=\"id_current_location\"]"); // current
																		// location
	static By item_23 = By.xpath("//*[@id=\"id_temperature\"]"); // current
																	// temperature
	static By item_24 = By.xpath("//*[@id=\"id_weather_icon\"]"); // weather
																	// icon
	static By item_25 = By.xpath("//*[@id=\"id_f_label_ln\"]"); // last name
																	// text
	static By item_26 = By.xpath("//*[@id=\"id_lname\"]"); // last name field
	static By item_27 = By.xpath("//*[@id=\"id_f_label_pn\"]"); // phone
																	// number
																	// name
	static By item_28 = By.xpath("//*[@id=\"id_phone\"]"); // phone number
																// field
	static By item_29 = By.xpath("//*[@id=\"id_f_label_s\"]"); // stste name
	static By item_30 = By.xpath("//*[@id=\"id_state\"]"); // state field
																// dropdown
	static By item_31 = By.xpath("//*[@id=\"os_browser\"]"); // OS and browser
	static By item_32 = By.xpath("//*[@id=\"copyright\"]"); // copyrights
	static By item_33 = By.xpath("//*[@id=\"timestamp\"]"); // current date
	static By item_34 = By.xpath("//*[@id=\"fname_error\"]/img"); // error
																	// arrow
																	// first
																	// name
	static By item_35 = By.xpath("//*[@id=\"ErrorLine\"]"); // error text
																// description
	static By item_36 = By.xpath("//*[@id=\"lname_error\"]/img"); // error
																	// arrow
																	// last name
	static By item_37 = By.xpath("//*[@id=\"email_error\"]/img"); // error
																	// arrow
																	// email
	static By item_38 = By.xpath("//*[@id=\"phone_error\"]/img"); // error
																	// arrow
																	// phone
																	// number
	static By item_39 = By.xpath("//tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[5]"); // error
																					// massage
																					// area
	static By item_40 = By.xpath("//tr/td/table/tbody/tr[1]/td[5]"); // web
																		// servises
																		// area
	static By item_41 = By.xpath("//*[@id=\"id_quotes\"]"); // header
	static By item_42 = By.xpath("//form[1]/table[1]/tbody[1]/tr[3]/td[1]"); // view
																				// pain
																				// area
	static By item_43 = By.xpath("//form[1]/table[1]/tbody[1]/tr[4]/td[1]"); // footer
																				// line

	public static void main(String[] args) {
		System.out.println("Browser: Firefox");

		start = System.currentTimeMillis();

		url = "http://alex.academy/exe/signup/v1/index.php";
		open(url);

		System.out.println("01. UI element [Sign Up area]: " + (isPresent(item_01) ? "Exists" : "Not exist")); // signup
		System.out.println("02. UI element [Sign Up title]: " + (isPresent(item_02) ? "Exists" : "Not exist")); // signup
		System.out.println("03. UI element [First name title]: " + (isPresent(item_03) ? "Exists" : "Not exist")); // signup
		System.out.println("04. UI element [First name field]: " + (isPresent(item_04) ? "Exists" : "Not exist")); // signup
		System.out.println("05. UI element [Email title]: " + (isPresent(item_05) ? "Exists" : "Not exist")); // signup
																												// &
																												// confirmation

		System.out.println("06. UI element [Email field]: " + (isPresent(item_06) ? "Exists" : "Not exist")); // signup
																												// &
																												// confirmation
		System.out.println("07. UI element [Gender title]: " + (isPresent(item_07) ? "Exists" : "Not exist")); // signup
																													// &
																													// confirmation
		System.out.println("08. UI element [Gender area for Male]: " + (isPresent(item_08) ? "Exists" : "Not exist")); // signup
																															// &
																															// confirmation
		System.out.println("09. UI element [Gender text for Male]: " + (isPresent(item_09) ? "Exists" : "Not exist")); // signup
																															// &
																															// confirmation
		System.out
				.println("10. UI element [Check button for Male]: " + (isPresent(item_10) ? "Exists" : "Not exist")); // signup
																														// &
																														// confirmation

		System.out.println("11. UI element [Gender text Female]: " + (isPresent(item_11) ? "Exists" : "Not exist")); // signup
																														// &
																														// confirmation
		System.out.println("12. UI element [Sign Up &confirmation]: " + (isPresent(item_12) ? "Exists" : "Not exist")); // signup
																														// &
																														// confirmation
		System.out.println("13. UI element [Check button Female]: " + (isPresent(item_13) ? "Exists" : "Not exist")); // signup
																														// &
																														// confirmation
		System.out.println("14. UI element [I agree text]: " + (isPresent(item_14) ? "Exists" : "Not exist")); // signup
																													// &
																													// confirmation
		System.out.println("15. UI element [I agree check button]: " + (isPresent(item_15) ? "Exists" : "Not exist")); // signup

		System.out.println("16. UI element [Facebook link]: " + (isPresent(item_16) ? "Exists" : "Not exist")); // signup
		System.out.println("17. UI element [Twitter link]: " + (isPresent(item_17) ? "Exists" : "Not exist")); // signup
		System.out.println("18. UI element [Flickr link]: " + (isPresent(item_18) ? "Exists" : "Not exist")); // signup
		System.out.println("19. UI element [Youtube link]: " + (isPresent(item_19) ? "Exists" : "Not exist")); // signup
		System.out.println("20. UI element [Reset button]: " + (isPresent(item_20) ? "Exists" : "Not exist")); // signup

		System.out.println("21. UI element [Submit botton]: " + (isPresent(item_21) ? "Exists" : " Not exist ")); // signup
		System.out.println("22. UI element [Current location]: " + (isPresent(item_22) ? "Exists" : " Not exist ")); // signup
		System.out.println("23. UI element [Current temperature]: " + (isPresent(item_23) ? "Exists" : " Not exist ")); // signup
		System.out.println("24. UI element [Wether icon]: " + (isPresent(item_24) ? "Exists" : " Not exist ")); // signup
		System.out.println("25. UI element [Last Name text]: " + (isPresent(item_25) ? "Exists" : " Not exist ")); // signup

		System.out.println("26. UI element [Last Name field]: " + (isPresent(item_26) ? "Exists" : "Not exist")); // signup
		System.out.println("27. UI element [Phone number text]: " + (isPresent(item_27) ? "Exists" : "Not exist")); // signup
		System.out.println("28. UI element [Phone number field]: " + (isPresent(item_28) ? "Exists" : "Not exist")); // signup
		System.out.println("29. UI element [State name]: " + (isPresent(item_29) ? "Exists" : "Not exist")); // signup
		System.out.println("30. UI element [State dropdown]: " + (isPresent(item_30) ? "Exists" : "Not exist")); // signup

		System.out.println("31. UI element [OS and browser]: " + (isPresent(item_31) ? "Exists" : "Not exist")); // signup
		System.out.println("32. UI element [Copyrights]: " + (isPresent(item_32) ? "Exists" : "Not exist")); // signup

		System.out.println("33. UI element [Current date]: " + (isPresent(item_33) ? "Exists" : "Not exist")); // signup

		System.out.println("34. UI element [Error First Name]: " + (isPresent(item_34) ? "Exists" : "Not exist")); // signup
		System.out.println("35. UI element [Error Text field]: " + (isPresent(item_35) ? "Exists" : "Not exist")); // signup
		System.out.println("36. UI element [Error Last Name]: " + (isPresent(item_36) ? "Exists" : "Not exist")); // signup
		System.out.println("37. UI element [Error Email]: " + (isPresent(item_37) ? "Exists" : "Not exist")); // signup

		System.out.println("38. UI element [Error phone number]: " + (isPresent(item_38) ? "Exists" : "Not exist")); // signup
		System.out.println("39. UI element [Error Massage area]: " + (isPresent(item_39) ? "Exists" : "Not exist")); // signup
		System.out.println("40. UI element [Web services area]: " + (isPresent(item_40) ? "Exists" : " Not exist")); // signup
		System.out.println("41. UI element [Header]: " + (isPresent(item_41) ? "Exists" : " Not exist")); // signup

		System.out.println("42. UI element [View pain area): " + (isPresent(item_42) ? "Exists" : " Not exist")); // confirmation
		System.out.println("43. UI element [Footer line]: " + (isPresent(item_43) ? "Exists" : " Not exist")); // confirmation

		System.out.println("------------- VISABILITY----------------");

		System.out.println("34. UI element [Error First Name]: " + (isVisible(item_34) ? "Visible" : " Not visible")); // signup
		System.out.println("35. UI element [Error Text field]: " + (isVisible(item_35) ? "Visible" : " Not visible")); // signup

		System.out.println("36. UI element [Error Last Name]: " + (isVisible(item_36) ? "Visible" : " Not visible"));
		System.out.println("37. UI element [Error Email]: " + (isVisible(item_37) ? "Visible" : " Not visible"));
		System.out
				.println("38. UI element [Error phone number]: " + (isVisible(item_38) ? "Visible" : " Not visible"));
		System.out
				.println("39. UI element [Error Massage area]: " + (isVisible(item_39) ? "Visible" : " Not visible"));

		System.out.println("OS/Browser: " + driver.findElement(item_31).getText()); // signup

		driver.quit();

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		url = "http://alex.academy/exe/signup/v1/confirmation.php";
		System.out.printf("\n\nConfirmation page:\n");

		open(url);

		System.out.println("01. UI element [Sign Up area]: " + (isPresent(item_01) ? "Exists" : "Not exist")); // signup
		System.out.println("02. UI element [Sign Up title]: " + (isPresent(item_02) ? "Exists" : "Not exist")); // signup
		System.out.println("03. UI element [First name title]: " + (isPresent(item_03) ? "Exists" : "Not exist")); // signup
		System.out.println("04. UI element [First name field]: " + (isPresent(item_04) ? "Exists" : "Not exist")); // signup
		System.out.println("05. UI element [Email title]: " + (isPresent(item_05) ? "Exists" : "Not exist")); // signup
																												// &
																												// confirmation

		System.out.println("06. UI element [Email field]: " + (isPresent(item_06) ? "Exists" : "Not exist")); // signup
																												// &
																												// confirmation
		System.out.println("07. UI element [Gender title]: " + (isPresent(item_07) ? "Exists" : "Not exist")); // signup
																													// &
																													// confirmation
		System.out.println("08. UI element [Gender area for Male]: " + (isPresent(item_08) ? "Exists" : "Not exist")); // signup
																															// &
																															// confirmation
		System.out.println("09. UI element [Gender text for Male]: " + (isPresent(item_09) ? "Exists" : "Not exist")); // signup
																															// &
																															// confirmation
		System.out.println("10. UI element [Check button for Male]: " + (isPresent(item_10) ? "Exists" : "Not exist")); // signup
																														// &
																														// confirmation

		System.out.println("11. UI element [Gender text Female]: " + (isPresent(item_11) ? "Exists" : "Not exist")); // signup
																														// &
																														// confirmation
		System.out.println("12. UI element [Sign Up &confirmation]: " + (isPresent(item_12) ? "Exists" : "Not exist")); // signup
																														// &
																														// confirmation
		System.out.println("13. UI element [Check button Female]: " + (isPresent(item_13) ? "Exists" : "Not exist")); // signup
																														// &
																														// confirmation
		System.out.println("14. UI element [I agree text]: " + (isPresent(item_14) ? "Exists" : "Not exist")); // signup
																													// &
																													// confirmation
		System.out.println("15. UI element [I agree check button]: " + (isPresent(item_15) ? "Exists" : "Not exist")); // signup

		System.out.println("16. UI element [Facebook link]: " + (isPresent(item_16) ? "Exists" : "Not exist")); // signup
		System.out.println("17. UI element [Twitter link]: " + (isPresent(item_17) ? "Exists" : "Not exist")); // signup
		System.out.println("18. UI element [Flickr link]: " + (isPresent(item_18) ? "Exists" : "Not exist")); // signup
		System.out.println("19. UI element [Youtube link]: " + (isPresent(item_19) ? "Exists" : "Not exist")); // signup
		System.out.println("20. UI element [Reset button]: " + (isPresent(item_20) ? "Exists" : "Not exist")); // signup

		System.out.println("21. UI element [Submit botton]: " + (isPresent(item_21) ? "Exists" : " Not exist ")); // signup
		System.out.println("22. UI element [Current location]: " + (isPresent(item_22) ? "Exists" : " Not exist ")); // signup
		System.out
				.println("23. UI element [Current temperature]: " + (isPresent(item_23) ? "Exists" : " Not exist ")); // signup
		System.out.println("24. UI element [Wether icon]: " + (isPresent(item_24) ? "Exists" : " Not exist ")); // signup
		System.out.println("25. UI element [Last Name text]: " + (isPresent(item_25) ? "Exists" : " Not exist ")); // signup

		System.out.println("26. UI element [Last Name field]: " + (isPresent(item_26) ? "Exists" : "Not exist")); // signup
		System.out.println("27. UI element [Phone number text]: " + (isPresent(item_27) ? "Exists" : "Not exist")); // signup
		System.out.println("28. UI element [Phone number field]: " + (isPresent(item_28) ? "Exists" : "Not exist")); // signup
		System.out.println("29. UI element [State name]: " + (isPresent(item_29) ? "Exists" : "Not exist")); // signup
		System.out.println("30. UI element [State dropdown]: " + (isPresent(item_30) ? "Exists" : "Not exist")); // signup

		System.out.println("31. UI element [OS and browser]: " + (isPresent(item_31) ? "Exists" : "Not exist")); // signup
		System.out.println("32. UI element [Copyrights]: " + (isPresent(item_32) ? "Exists" : "Not exist")); // signup

		System.out.println("33. UI element [Current date]: " + (isPresent(item_33) ? "Exists" : "Not exist")); // signup

		System.out.println("34. UI element [Error First Name]: " + (isPresent(item_34) ? "Exists" : "Not exist")); // signup
		System.out.println("35. UI element [Error Text field]: " + (isPresent(item_35) ? "Exists" : "Not exist")); // signup
		System.out.println("36. UI element [Error Last Name]: " + (isPresent(item_36) ? "Exists" : "Not exist")); // signup
		System.out.println("37. UI element [Error Email]: " + (isPresent(item_37) ? "Exists" : "Not exist")); // signup

		System.out.println("38. UI element [Error phone number]: " + (isPresent(item_38) ? "Exists" : "Not exist")); // signup
		System.out.println("39. UI element [Error Massage area]: " + (isPresent(item_39) ? "Exists" : "Not exist")); // signup
		System.out.println("40. UI element [Web services area]: " + (isPresent(item_40) ? "Exists" : " Not exist")); // signup
		System.out.println("41. UI element [Header]: " + (isPresent(item_41) ? "Exists" : " Not exist")); // signup

		System.out.println("42. UI element [View pain area): " + (isPresent(item_42) ? "Exists" : " Not exist")); // confirmation
		System.out.println("43. UI element [Footer line]: " + (isPresent(item_43) ? "Exists" : " Not exist")); // confirmation

		System.out.println("------------- VISABILITY----------------");

		System.out.println("34. UI element [Error First Name]: " + (isVisible(item_34) ? "Visible" : " Not visible")); // signup
		System.out.println("35. UI element [Error Text field]: " + (isVisible(item_35) ? "Visible" : " Not visible")); // signup

		System.out.println("36. UI element [Error Last Name]: " + (isVisible(item_36) ? "Visible" : " Not visible"));
		System.out.println("37. UI element [Error Email]: " + (isVisible(item_37) ? "Visible" : " Not visible"));
		System.out
				.println("38. UI element [Error phone number]: " + (isVisible(item_38) ? "Visible" : " Not visible"));
		System.out
				.println("39. UI element [Error Massage area]: " + (isVisible(item_39) ? "Visible" : " Not visible"));



		driver.quit();

		finish = System.currentTimeMillis();
		System.out.println("Response time: " + (finish - start) + " ms");
	}
}