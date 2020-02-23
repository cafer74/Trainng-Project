package common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class browser {
	public static Webdriver driver;

 
  }
  @BeforeClass
  public void beforeClass(String wbsite,String br) {
	          If(br.equalsIgnoreCase("chrome")){
	  
	  System.outdriver_win32 (1)\\chromedriveSystem.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chror.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to(wbsite);
	  driver.manage().window().maximize();
  }else if(br.equalsIgnoreCase("firefox")) {
	  system.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.navigate().to(wbsite);
	  driver.manage().window().maximize();
  }else {
	  System.out.println("please checkname");
  }
  }

  @AfterClass
  public void afterClass() {
  }

}
