package Support;

import Pages.PagesFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Configuration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
public class Hooks {
       public static WebDriver driver;

    @Before
    public void before(Scenario scenario) throws InterruptedException {
        log.info("starting" + scenario.getName());
        String browser = System.getProperty("browser", "firefox");
        boolean headless = Boolean.parseBoolean(System.getProperty("headless", "false"));
        if ("chrome".equals(browser)) {
            ChromeOptions options = new ChromeOptions();

            if (headless) {
                options.addArguments("--headless");
            }
            driver = new ChromeDriver(options);
        } else if ("firefox".equals(browser)) {
            FirefoxOptions options = new FirefoxOptions();
            if (headless) {
                options.setHeadless(true);
            }
            driver = new FirefoxDriver(options);

        } else if ("edge".equals(browser)) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(options);

        } else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        PagesFactory.start(driver);
    }

    @After
    public void after(Scenario scenario) {
        log.info("ending " + scenario.getName());
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot)
                    driver).getScreenshotAs(OutputType.BYTES);
            long time = new Date().getTime();
            String outputName = "screenshot_" + time + ".png";
            String outputDirectory = "C:/Users/echechele/Hiberus/openCart_Ernesto_Chechele/src/test/screenshots/";
            scenario.attach(screenshot, "image/png", outputDirectory + outputName);

            //scenario.attach(screenshot, "image/png", outputName);
            File reportOutputDirectory = new File("target/cucumber-reports");
            List<String> jsonFiles = new ArrayList<>();
            jsonFiles.add("target/cucumber.json");

            Configuration configuration = new Configuration(reportOutputDirectory, "Nombre del Proyecto");
            configuration.setBuildNumber("1");

            ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
            reportBuilder.generateReports();



        }
        driver.close();
    }

    }

