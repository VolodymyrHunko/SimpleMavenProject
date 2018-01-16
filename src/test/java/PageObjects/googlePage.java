package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * @author Volodymyr Hunko
 * OOP for google mail page
 *
 */
public class googlePage {
    WebDriver driver;

    @FindBy(how=How.ID, using="Email")
    public static WebElement email;

    @FindBy(how=How.ID, using="next")
    public static WebElement next;

    @FindBy(how=How.ID, using="Passwd")
    public static WebElement password;

    @FindBy(how=How.ID, using="signIn")
    public static WebElement signin;

    @FindBy(how=How.XPATH, using="//div[@id='gb']/div/div/div[2]/div[4]/div/a/span")
    public static WebElement icone;

    @FindBy(how=How.ID, using="errormsg_0_Passwd")
    public static WebElement allert;
}
