package self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class creatLead {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("jio");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("buuna");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhal");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("tikka");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("automation");
		
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_primaryPhoneNumber')]")).sendKeys("7008405629");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhal.sibu@gmail.com");
		
		WebElement dropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select select =new Select(dropdown);
		
		select.selectByVisibleText("New York");
		
		
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("the title is :" +driver.getTitle());

		

	}

}
