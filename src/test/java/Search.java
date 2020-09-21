import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    public WebDriver driver;
    private By Searchbox=By.xpath("//input[@autocomplete='off']");
    private By searchbtn=By.cssSelector("input.login-form-inputs.login-btn");

    public Search(WebDriver driver) {
        this.driver=driver;
    }


    public void Search(String product) {
        driver.findElement(Searchbox).sendKeys(product);
        driver.findElement(searchbtn).click();
    }

}

