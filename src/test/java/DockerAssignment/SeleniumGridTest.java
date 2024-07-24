package DockerAssignment;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridTest {
	public WebDriver driver;
	@Parameters({"bName"})
  @Test
  public void CrossBrowserTest(String bName) throws MalformedURLException, InterruptedException 
  {
	  System.out.println("Remote driver connectivity is Started");
	  if(bName.equals("Chrome"))
	  {
		  ChromeOptions options = new ChromeOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
		  System.out.println("Session created on Chrome Browser");
	  }else if(bName.equals("Firefox"))
	  {
		  FirefoxOptions options = new FirefoxOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
		  System.out.println("Session created on Firefox Browser");
	  }
	  else if(bName.equals("Edge"))
	  {
		  EdgeOptions options = new EdgeOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
		  System.out.println("Session created on Edge Browser");
	  }
	  System.out.println("Remote driver connectivity is completed");
	  Thread.sleep(10000);
	  driver.get("https://www.amazon.in");
	  Thread.sleep(5000);
	  System.out.println("Title is: " +driver.getTitle()); 
	  driver.quit();
  }
}
