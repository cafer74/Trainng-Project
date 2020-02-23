package TrainingFB;

import org.testng.annotations.Test;


import common.Webdriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class browser2 {

	public static WebDriver driver;
	
	@BeforeClass
	@Parameters ({"url", "browser"})
  public void beforeClass(String wbsite,String br) {
	          if(br.equalsIgnoreCase("chrome")){
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chror.exe");
	  driver = new Chromedriver();
	  driver.navigate().to(wbsite);
	  driver.manage().window().maximize();
  }else if(br.equalsIgnoreCase("firefox")) {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.navigate().to(wbsite);
	  driver.manage().window().maximize();
  }else {
	  System.out.println(br);
  }
  }

}
