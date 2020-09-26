import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;

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
        extentTest.log(Status.PASS, "Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }

    @Test(priority = 1)
    public void Searchtest() throws IOException {

        String path = System.getProperty("user.dir");
        ExtentReports reports = new ExtentReports();
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path + "\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
        ExtentTest extentTest = reports.createTest("Searchtest");
       // WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com");
        Search search = new Search(driver);
        search.Search("sunglass");
        extentTest.log(Status.PASS, "search  success");
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


        extentTest.log(Status.PASS, "Login Passed");
        extentTest.addScreenCaptureFromPath(Driver.takeScreenshot());
        Driver.closeBrowser();
        reports.flush();
    }


}































































































