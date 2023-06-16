package AssignmentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver =new ChromeDriver(opt);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	 Thread.sleep(1000);
	//1.xpath using userName ,UserName Xpath using-contains, xpath using xpath Axes 
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("inueron@inueron.ai");
	    driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("inueron@inueron.ai");
        driver.findElement(By.xpath("//label[@class='oxd-label']//following::input[@name='username']")).sendKeys("inueron@inueron.ai");
	
    //1.userName using cssSelectors 
       driver.findElement(By.xpath("input[name*='username']")).sendKeys("inueron@inueron.ai");
       driver.findElement(By.xpath("input[name='username']")).sendKeys("inueron@inueron.ai");
        		
	//2password using xpath
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("inueron@inueron.ai");
       driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("inueron@inueron.ai");
 	  //xpath using xpath Axes 
         driver.findElement(By.xpath("//label[@class='oxd-label']//following::input[@name='password']")).sendKeys("inueron@inueron.ai");
       
    //2.password using cssSelector
         driver.findElement(By.xpath("input[name='password']")).sendKeys("inueron@inueron.ai");
         driver.findElement(By.xpath("input[name*='password']")).sendKeys("inueron@inueron.ai");
         driver.findElement(By.xpath("input[name='password']")).sendKeys("inueron@inueron.ai");
       
    //3.Login Xpath
         driver.findElement(By.xpath("//button[@type='submit']")).click(); 
         driver.findElement(By.xpath("//*[text()='Password']//following::button[text()=' Login ']")).click();
         driver.findElement(By.xpath(" //*[text()=' Login ']")).click();
    //3 login using cssSelectors
         driver.findElement(By.cssSelector("button[type='submit']")).click(); 
         
	driver.close();
	}

}
