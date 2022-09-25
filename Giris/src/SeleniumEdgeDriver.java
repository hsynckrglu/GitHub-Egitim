import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumEdgeDriver {
//denemeBranchine aittir
	public static void main(String[] args) {
		
		//microsoft edge --> edge driver
		
		//webdriver.edge.driver --> value of path
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\huseyin.cakiroglu\\Documents\\BrowserDriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://turkceingilizce.gen.tr/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
			
		

	}

}
