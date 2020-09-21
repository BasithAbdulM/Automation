import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LoginExecution {
    WebDriver driver = Driver.openBrowser("chrome", "https://www.ajio.com");


    ExtentReports reports;
    ExtentSparkReporter extentSparkReporter;
    ExtentTest extentTest;

    @Test
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

    @Test
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







}































































































