package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author SavannaDenega
 * 
 * Classe para criar o WebDriver, que manipula o navegador.
 * O navegador a ser manipulado e especificado, pois cada tipo utiliza buttonMenuPIM
 * driver diferente na execucao.
 *
 */
public class WebDriverFactoryInstance {

	private static final WebDriverFactoryInstance INSTANCE = new WebDriverFactoryInstance();

	// Windows - Pasta do software
	//final String chromeBinary = "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe";

	// Windows - Pasta do projeto
	//final String chromeDriverFilePath = System.getProperty("user.dir") + "/browserDrivers/chromedriver.exe";

	// Mac
	final String chromeDriverFilePath = System.getProperty("user.dir") + "/browserDrivers/chromedriver";
	
	//final String ieDriverServerFilePath = "C:/Java/drivers/IEDriverServer.exe";
	//final String firefoxGeckodriverFilePath = "C:/Program Files (x86)/Mozilla Firefox/geckodriver.exe";

	private WebDriverFactoryInstance() {

	}

	public static final WebDriverFactoryInstance getInstance() {
		return INSTANCE;
	}

	public WebDriver createConfigurationsWebDriver() {

		return setGoogleChromeFactoryDriver();
	}
	
	private WebDriver setGoogleChromeFactoryDriver() {
		System.setProperty("webdriver.chrome.driver", chromeDriverFilePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

//	private WebDriver firefoxFactoryDriver() {
//		System.setProperty("webdriver.gecko.driver", geckodriver);
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		WebDriver driver = new FirefoxDriver(capabilities);
//		return driver;
//	}
//
//	private WebDriver internetExplorerDriverFactory() {
//		File file = new File(ieDriverServer);
//		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
//		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		WebDriver driver = new InternetExplorerDriver(capabilities);
//		return driver;
//	}

}
