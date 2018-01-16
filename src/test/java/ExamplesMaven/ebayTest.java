package ExamplesMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.*;

/**
 *
 * @author Volodymyr Hunko
 * Implementation of flow #2
 *
 */
public class ebayTest {
    private static WebDriver driver;
    private String baseURL = "https://ebay.com";

    @Test (priority=0, enabled = true)
    public void validLogIn() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(baseURL);

        PageFactory.initElements(driver, eBayPage.class);

        eBayPage.search.sendKeys("Electric Guitar");
        eBayPage.buton.click();
        String price = eBayPage.price_1.getText();
        System.out.println("The price is "+price);

        driver.quit();
    }

}
