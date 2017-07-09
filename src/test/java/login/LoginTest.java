package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Created by Ashish on 10-07-2017.
 */
public class LoginTest {
    WebDriver driver;
    LoginPOM objLogin;

    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver", "C:/selenium-java-3.4.0/chromedriver.exe");
        driver = new ChromeDriver();
        objLogin = new LoginPOM(driver);
        driver.get("http://examples.sencha.com/extjs/6.5.0/examples/classic/ticket-app/index.html");
        WebDriverWait wait = new WebDriverWait(driver,50);
        objLogin.login("asdjkgd");
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
