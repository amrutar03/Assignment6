package AssignmentXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver =new ChromeDriver(opt);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
	 //driver.findElement(By.xpath("//a[contains(@href,'admin')]")).click();
    System.out.println("Admin Link Clicked !!");
   
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    System.out.println("Search Link Clicked !!");

   // Aaliyah.Haq
   WebElement delete= driver.findElement(By.xpath("//div[text()='Paul Collings']//following::i[@class='oxd-icon bi-trash'][1]")); 
   delete.click();
   System.out.println("delete Link Clicked !!");
   
  WebElement ele= driver.findElement(By.xpath("//p[text()='Paul Collings']//following::i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
  ele.click();
  System.out.println("Click");

  WebElement logoutele=driver.findElement(By.xpath("//a[contains(@href, 'logout')]"));
  logoutele.click();
  System.out.println("Logout");
	}

}
