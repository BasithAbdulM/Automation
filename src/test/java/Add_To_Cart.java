import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add_To_Cart {
    private WebDriver driver;
    private By productinfo=By.xpath("//*[@id=\"products\"]/div[3]/div[1]/div/div[1]/a/div/div[2]/div[2]");
    private By addtomybag=By.cssSelector("span.ic-pdp-add-cart");

    public Add_To_Cart(WebDriver driver){

        this.driver=driver;
    }
    public void Add_To_Cart(){
        driver.findElement(productinfo).click();
        driver.findElement(addtomybag).click();
    }

}
