package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/");
    }
}
