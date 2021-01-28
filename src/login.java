import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\pesha\\Documents\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pesha\\Documents\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "http://sidecarhealth.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("zip")).clear();
		driver.findElement(By.name("zip")).sendKeys("84102");
		driver.findElement(By.name("zip")).sendKeys(Keys.ENTER);	
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/div/div/div/div[1]/div[1]/div/div[1]/div/div[1]/label")).click();
		
		driver.findElement(By.id("email")).sendKeys("thomas123hanks@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("@1B2c3d4");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/div/div/div/div[1]/div[2]/div[1]/button")).click();
		
		driver.quit();
	}

}
