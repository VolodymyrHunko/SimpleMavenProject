package ExamplesMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import PageObjects.*;

/**
 *
 * @author Volodymyr Hunko
 * Implementation of flow #1
 *
 */
public class newTest {
    public static WebDriver driver;
    public String baseURL = "https://mail.google.com";

    @Test (priority=0, enabled = true)
    public void validLogIn() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(baseURL);

        PageFactory.initElements(driver, googlePage.class);

        googlePage.email.sendKeys("vladhunko6@gmail.com");
        googlePage.next.click();
        googlePage.password.sendKeys("vladhunko66");
        googlePage.signin.click();
        Assert.assertNotNull(googlePage.icone);

        driver.quit();
    }


    @Test (priority=1, enabled = true)
    public void invalidLogIn() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(baseURL);

        PageFactory.initElements(driver, googlePage.class);

        googlePage.email.sendKeys("vladhunko6@gmail.com");
        googlePage.next.click();
        googlePage.password.sendKeys("vladhunko");
        googlePage.signin.click();
        String error = googlePage.allert.getText();
        AssertJUnit.assertTrue(error.contains("Wrong password."));

        driver.quit();
    }


}
