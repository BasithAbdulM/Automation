package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Savings {
    private WebDriver driver;

    private By BagDiscount= By.xpath("//section[@id='bagDiscount']");
    private By couponsvngs = By.xpath("/section[@id='couponDiscount']");
    private By Ordertotal = By.xpath("//section[@id='orderTotal']");

    public Savings(WebDriver driver){
        this.driver=driver;
    }
    public void savings(){
        String bagdisc = driver.findElement(BagDiscount).getText();
        System.out.println("Bag Discountl:" + bagdisc);

        String savings = driver.findElement(couponsvngs).getText();
        System.out.println("couponsavings:" + savings);

        String ordrtotal = driver.findElement(Ordertotal).getText();
        System.out.println("Order Total:" + ordrtotal);

    }

}
