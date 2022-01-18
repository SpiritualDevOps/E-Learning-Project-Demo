package elearning;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elearning {
	
	
	ExtentReports extent; //extentreport
	ExtentTest logger; //extentreport
	
	public WebDriver driver;
	@BeforeTest
	public void BT()
	{
		
		
		extent = new ExtentReports(System.getProperty("user.dir")+"//test-output//dev.html"); //extentreport
		extent.loadConfig(new File(System.getProperty("user.dir")+"//test-output//extent-config.xml")); //extentreport
		
		logger = extent.startTest("Newtest"); //extentreport
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://elearningm1.upskills.in/index.php");
		logger.log(LogStatus.PASS,"Webpage closed"); //extentreport 
		
	}

	@Test(enabled = false)
	public void register() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[contains(text(),'Sign up!')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@class='register-profile' and @id='qf_2e6992']")).click();
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("devu");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("devu");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("devudevu123@gmail.com");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("devudevu123");
		driver.findElement(By.xpath("//*[@name='pass1']")).sendKeys("devu@123");
		driver.findElement(By.xpath("//*[@name='pass2']")).sendKeys("devu@123");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9988002233");
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		Thread.sleep(3000);
		
	}
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='login']")).sendKeys("pqrst");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("pqrst");
		driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 1,enabled = false)
	public void profile() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[contains(text(),'Inbox')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[contains(text(),'Compose')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("devmm123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("demo");
		//driver.findElement(By.xpath("//body//p")).sendKeys("Come fly with me");
		//driver.findElement(By.xpath("//*[@class='col-sm-8' and @type='file']")).click();
		driver.findElement(By.xpath("//*[@id='file-descrtiption']")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id='compose_message_compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Homepage')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[contains(text(),'Pending invitations')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("devmm123");
		driver.findElement(By.xpath("//*[@class='filter-option-inner-inner']")).click();
		Thread.sleep(3000);
		Actions mo = new Actions(driver);
		mo.sendKeys(Keys.ARROW_DOWN).build().perform();
		mo.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//*[@class=' btn btn-default ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Homepage')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(),'Personal data')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Personal data we keep about you')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Homepage')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(),'Edit profile')]")).click();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//[contains(text(),'Personal data we keep about you')]")).click();
		Thread.sleep(5000);*/
		driver.findElement(By.xpath("//*[@class='filter-option-inner-inner']")).click();
		Thread.sleep(3000);
		mo.sendKeys(Keys.ARROW_DOWN).build().perform();
		mo.sendKeys(Keys.ARROW_UP).build().perform();
		mo.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//*[@class='form-control' and @name='password0']")).sendKeys("devu@123");
		driver.findElement(By.xpath("//*[@class='form-control' and @name='password1']")).sendKeys("devu@123");
		driver.findElement(By.xpath("//*[@class='form-control' and @name='password2']")).sendKeys("devu@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=' btn btn-primary ' and @name='apply_change']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Homepage')]")).click();
		Thread.sleep(2000);
	
	}
@Test(priority=1, enabled = false )
	public void Courses() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[contains(text(),'Course catalog')]")).click();
		Thread.sleep(2000);
		WebElement cat1 = driver.findElement(By.name("category_code")); //for dropdown boxes
		Select sel1= new Select(cat1);
		sel1.selectByValue("PR001");
		driver.findElement(By.xpath("//*[@class='form-control' and @name='search_term']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn btn-default']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Homepage')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(),'Create a course')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("demo selenium");
		driver.findElement(By.xpath("//*[@id='advanced_params']")).click();
		Thread.sleep(3000);
		WebElement cat2 = driver.findElement(By.name("category_code")); //for dropdown boxes
		Select sel2= new Select(cat2);
		sel2.selectByValue("PR001"); 
		driver.findElement(By.xpath("//*[@id='add_course_wanted_code']")).sendKeys("dsl0001");
		driver.findElement(By.xpath("//*[@id='advanced_params']")).click();
		WebElement lang = driver.findElement(By.id("add_course_course_language")); //for dropdown boxes
		Select sel3= new Select(lang);
		sel3.selectByValue("english"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=' btn btn-primary ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Homepage')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[contains(text(),'Sort courses')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title='Up']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Homepage')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(),'Courses history')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
			

	}


	@Test(priority = 2)
	public void skills() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@title='My courses']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'My certificates')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[contains(text(),'My skills')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Skills")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Get new skills')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Webdriver testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Root");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Python"); //Defect
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Java"); //Defect
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("C++"); //Defect
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='skill_to_select_id_2']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Display")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Light")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Black")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Gray")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Corn")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("White")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='btn btn-large btn-block btn-primary']")).click();
		Thread.sleep(4000);
		

		
	}
	@Test(priority = 3)
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[contains(text(),'Homepage')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='caret']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='logout_button']")).click();
		
	}
	
	@AfterTest
	public void AT() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}

