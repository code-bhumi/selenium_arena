import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope
{
    public static void main(String[] args)   
    {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println("................good...............");
        System.out.println(driver.findElements(By.tagName("a")).size());
        System.out.println("................good...............");
        WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(Footerdriver.findElements(By.tagName("a")).size());
        System.out.println("................good...............");    
    
    }
    
}
