import Pages.Add_To_Cart;
import Pages.Login;
import Pages.MultiProducts;
import Pages.Search;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LoginExecution {
  public static   WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com");


    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;

    @Test(priority =0 )
    public void LoginTest() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());

        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("LoginTest");

       // WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com");
        Login loginPage = new Login(driver);
        loginPage.Login("7871095629", "qwaszx@654321");
        extentTest.log(Status.PASS, "Pages.Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }

    @Test(priority = 1)
    @Parameters({"productnames"})
    public void Searchtest(String productName) throws IOException {

        String path = System.getProperty("user.dir");
        extentTest = reports.createTest("LoginTest");       // WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com");
        Search search = new Search(driver);
        search.Search(productName);
        try{
            Assert.assertTrue(search.CheckProductPresent(),productName+" not present");
            extentTest.log(Status.PASS, "search  success,"+productName+" present");
        }
        catch (Exception e){
            extentTest.log(Status.FAIL, "search failed,"+productName+" not present");

        }

        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();



    }

    @Test(priority = 2)
    public void Verifycartoption() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());

        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("Verifycartoption");

        // WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com")
        Add_To_Cart addToCart=new Add_To_Cart(this.driver);
        addToCart.Add_To_Cart();


        extentTest.log(Status.PASS, "Pages.Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }

    @Test
    public void Addmultiproduct() throws IOException {

        String path = System.getProperty("user.dir");
        reports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());

        reports.attachReporter(extentSparkReporter);
        extentTest = reports.createTest("Addmultiproduct");

        MultiProducts multiProducts = new MultiProducts(driver);
        multiProducts.Multiprdts();

        extentTest.log(Status.PASS, "Pages.Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }


}































































































