package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * @author Volodymyr Hunko
 * OOP for eBay page
 *
 */
public class eBayPage {
    WebDriver driver;

    @FindBy(how=How.ID, using="gh-ac")
    public static WebElement search;

    @FindBy(how=How.ID, using="gh-btn")
    public static WebElement buton;

    @FindBy(how=How.XPATH, using="//li/ul/li/span")
    public static WebElement price_1;

}
