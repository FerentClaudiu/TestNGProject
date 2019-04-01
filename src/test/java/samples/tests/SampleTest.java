package samples.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import samples.TestFixtureReadFromEnv;

public class SampleTest extends TestFixtureReadFromEnv {

    private WebDriver driver;
    private String baseUrl;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver","/home/claudiu/IdeaProjects/testng project/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/" + username + password;

    }

    @Test
    public void first() {
        System.out.println("1");
        driver.get(baseUrl);

    }

    @Test
    public void second() {
        System.out.println("2");
    }

    @Test
    public void third() {
        System.out.println("3");
    }
}
