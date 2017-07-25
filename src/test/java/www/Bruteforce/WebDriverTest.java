//package www.Bruteforce;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.junit.Ignore;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//
//public class WebDriverTest {
//    
//    private static WebDriver driver;
//
//    public WebDriverTest() {
//    }
//
//    @BeforeClass
//    public static void setUpClass() {
//        System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
//    
//    
//    @Test
//    public void testGoogleSearchWithChromeDriver() throws InterruptedException {
//        driver = new ChromeDriver();
//        driver.get("http://www.google.com/xhtml");
//        Thread.sleep(5000);  // Let the user actually see something!
//        WebElement searchBox = driver.findElement(By.name("q"));
//        assertEquals(searchBox.isDisplayed(), true);  
//    }
//    
//    @Test
//    public void testRollshopTestPageUpWithFirefoxDriver() throws InterruptedException {
//        driver = new FirefoxDriver();
//        driver.navigate().to("http://www.rollshop.co.il/test.php");        
//        Thread.sleep(2000);  // Let the user actually see something!        
//        WebElement searchBox = driver.findElement(By.name("code"));
//        assertEquals(searchBox.isDisplayed(), true);
//        
//    }
//
//}
