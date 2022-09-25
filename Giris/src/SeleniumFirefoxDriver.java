import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefoxDriver {
//denemeBranchine 2.yorumu ekliyoruum
	public static void main(String[] args) {

        //gecko driver --> Mozilla firefox browser 
		//webdriver.gecko.driver
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\huseyin.cakiroglu\\Documents\\BrowserDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://turkceingilizce.gen.tr/");
		System.out.println(driver.getTitle());  
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
	}

}
