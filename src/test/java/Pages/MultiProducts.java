package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class MultiProducts  {

    private WebDriver driver;
    private By prd1=By.xpath("//img[@alt='Campus Grey & Black Tyson Colourblock Low-Top Running Shoes']");
    private By prd2=By.xpath("//*[@id=\'products\']/div[3]/div[1]/div/div[10]/a/div/div[2]/div[2]");
    private By prd3=By.xpath("//img[@alt='Puma Black Enzo Lace-Up Sports Shoes']");

    public MultiProducts (WebDriver driver){
        this.driver=driver;
    }
    public void Multiprdts(){
        driver.findElement(prd1).click();
        driver.findElement(prd2).click();
        driver.findElement(prd3).click();
    }
}
