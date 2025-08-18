package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

class GoogleSearchTest {

    @Test
    public void verifyGoogleSearch() {
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Ta Automation QA");
        searchBox.submit();

        Assert.assertTrue(driver.getTitle().contains("Ta Automation QA"));
        driver.quit();
    }
}
