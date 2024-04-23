package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.List;

public class Login extends BasePage {
    public Login(WebDriver driver) throws IOException {
        super(driver);
    }

    private By name = By.name("login[username]");
    private By password = By.name("login[password]");
    private By login_btn = By.xpath("//*[@id=\"send2\"]/span");

    public WebElement getName(){return elementWithWait(name,"presence");}
    public WebElement getPassowrd(){return elementWithWait(password,"presence");}
    public WebElement getLogin_btn(){return elementWithWait(login_btn,"clickable");}

}
