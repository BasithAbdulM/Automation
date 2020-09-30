package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Changes {
    private WebDriver driver;

    private By product=By.xpath("//img[@alt='Hubberholme Black Slim Fit Mid-Rise Jeans']");
    private By size=By.xpath("//div[@class='size-swatch']");
    private By addtobag=By.xpath("//span[@class='ic-pdp-add-cart'");
    private By gotobag=By.xpath("//div[@class='ic-cart ']");
    private By checkout=By.xpath("//div[@class='button-wrapper cart-fixed-button']");
    private By adrress=By.xpath("//div[@class='change-address-section'");
    public Changes(WebDriver driver){
        this.driver=driver;
    }
    public void changes(){
        driver.findElement(product).click();
        driver.findElement(size).click();
        driver.findElement(addtobag).click();
        driver.findElement(gotobag).click();
        driver.findElement(checkout).click();
        driver.findElement(adrress).click();


    }

}
