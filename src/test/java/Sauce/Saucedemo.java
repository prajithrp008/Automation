package Sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Saucedemo {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
//        System.setProperty("webdriver.edge.driver", "path_to_edge_driver"); // Replace with actual driver path
        driver = new FirefoxDriver();
        driver.get("https://www.ilovepdf.com/");
        driver.manage().window().maximize();
    }

//    @AfterTest
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
