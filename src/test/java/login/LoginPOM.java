package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Ashish on 10-07-2017.
 */
public class LoginPOM {
    WebDriver driver;

    public LoginPOM(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    @FindBy (id = "textfield-1012-inputEl")
    WebElement passField;

    @FindBy (id = "button-1016-btnEl")
    WebElement btnLogin;

    public void login(String password){
        passField.sendKeys("password");
        btnLogin.click();
    }

}
