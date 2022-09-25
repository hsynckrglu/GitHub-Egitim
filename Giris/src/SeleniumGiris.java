import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGiris {

	public static void main(String[] args) {
		
		/* Browser Çağırma -Invoking Browser
		Chrome - ChromeDriver --> Methods
		Firefox - FirefoxDriver --> Methods
		tüm browser çağırma metodları aynı syntaxı kullanır
		*/
		// chromedriver.exe --> chrome browser
		//webdriver.chrome.driver --> value of path
		
		
	    System.setProperty("webdriver.chrome.driver" , "C:\\Users\\huseyin.cakiroglu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//bu komutla yazılan url açılır ve açılıp açılmadığını test ederiz
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.6.1");
		
		//konsolda sayfanın ismini görürüz chromedaki ile aynı mı diye test edilir
		System.out.println(driver.getTitle());
		
		//konsolda url yi görürüz ve yazdığımız url ile aynı mı diye test edilir.
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
		// driver.quit();  
		
		
		

	}

}
