import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpProcess {
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void mySetup() {
		
		//To prepare the Website
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
		
		
		
		// Generate random data
        Random rand = new Random();
        String firstName = "RandomFisrt" + rand.nextInt(1000);
        String lastName = "RandomLast" + rand.nextInt(1000);
        String email = "randomEmail" + rand.nextInt(1000) + "@example.com";
        String password = "RandomPass" + rand.nextInt(1000);

        
        // Define all the WebElement that will be used
        WebElement FistNameInputField = driver.findElement(By.id("firstname"));
        WebElement LastNameInputField = driver.findElement(By.id("lastname"));
        WebElement EmailInputField = driver.findElement(By.id("email_address"));
        WebElement PasswordInputField = driver.findElement(By.name("password"));
        WebElement PasswordConfirmationField = driver.findElement(By.name("password_confirmation"));
        WebElement SubmitInputField = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span"));
    
		
        //Interact with the WebElement
        FistNameInputField.sendKeys(firstName);
        LastNameInputField.sendKeys(lastName);
        EmailInputField.sendKeys(email);
        PasswordInputField.sendKeys(password);
        PasswordConfirmationField.sendKeys(password);
        SubmitInputField.click();
        
        
		//////For Static Username and passwordd//////////////////
//		driver.findElement(By.id("firstname")).sendKeys("Rahaf");
//		driver.findElement(By.id("lastname")).sendKeys("Albulbul");
//		driver.findElement(By.id("email_address")).sendKeys("rahaf.bulbul2000@icloud.com");
//		driver.findElement(By.name("password")).sendKeys("RahafBulbul12");
//		driver.findElement(By.name("password_confirmation")).sendKeys("RahafBulbul12");
//		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
	}
	
	
	
	
	@Test
	public void myTest() {
		
		
	}	
	
	
	@AfterTest
	public void myPostTest() {
		
		
	}
	
	
	

}
