package AssignmentXpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(opt);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(1000);
	 
	  driver.findElement(By.xpath("//a[contains(@href,'admin')]")).click();
      System.out.println("Admin Link Clicked !!");
      Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[text()=' Add ']")).click();
    Thread.sleep(1000);
   
   //CLICK ON USERROLE 
   WebElement userRole= driver.findElement(By.xpath("//label[text()='User Role']//parent::div//following-sibling::div//i"));
   userRole.click();
   Thread.sleep(1000);
    WebElement selectEnabeldFromDropdown =driver.findElement(By.xpath("//div[@role='listbox']//div//span[text()='Admin']"));
    selectEnabeldFromDropdown.click();
    
    //Adding user
     driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Paul Collings");
    Thread.sleep(3000);
    List<WebElement> namesofR=driver.findElements(By.xpath("//div[@role='option']"));
    for(WebElement ele:namesofR)
    {
    	Thread.sleep(3000);
    	ele.getText().contains("Paul Collings");
    	ele.click();
    	break;
    	
    }
    
    WebElement selectStatus =driver.findElement(By.xpath("//label[text()='Status']//parent::div//following-sibling::div//i"));
    selectStatus.click();
    Thread.sleep(3000);
    WebElement statusEmp =driver.findElement(By.xpath("//div[@role='option']//span[text()='Enabled']"));
    selectStatus.click();
    Thread.sleep(3000);
    
    //Enter username
    WebElement username =driver.findElement(By.xpath("//label[text()='Username']//parent::div//following-sibling::div//input"));
    username.sendKeys("Amrut");
    System.out.println("Send Username");
    
    //Enter PWD
    WebElement pwd =driver.findElement(By.xpath("//label[text()='Password']//parent::div//following-sibling::div//input"));
    pwd.sendKeys("pass1234");
    System.out.println("Send  pwd");
    //Enter ConfirmPWD
    WebElement confirmpwd =driver.findElement(By.xpath("//label[text()='Confirm Password']//parent::div//following-sibling::div//input"));
    confirmpwd.sendKeys("pass1234");
    Thread.sleep(6000);
    System.out.println("Send Confirm pwd");
    Thread.sleep(2000);
    WebElement saveBtn =driver.findElement(By.xpath("//button[text()=' Save ']"));
    Thread.sleep(2000);
    saveBtn.click();
    System.out.println("Click on Save BTN");
    
    
    driver.quit();

}

	}


