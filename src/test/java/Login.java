import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;
    private By Sign=By.cssSelector("span.login-form.login-modal");
    private By UserName=By.cssSelector("input.username");
    private By cont=By.xpath("//input[@type='submit']");
    private By Password;

    {
        Password = By.name("password");
    }

    private By Login=By.cssSelector("input.login-form-inputs.login-btn");
    public Login(WebDriver driver){

        this.driver=driver;
    }

    public void Login(String userName,String password){
        driver.findElement(Sign).click();
        driver.findElement(UserName).sendKeys(userName);
        driver.findElement(cont).click();
        driver.findElement(Password).sendKeys(password);
        driver.findElement(Login).click();
    }
    public void Searchproduct(String product){

    }


}
