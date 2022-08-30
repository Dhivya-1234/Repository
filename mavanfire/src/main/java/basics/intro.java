package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class intro {
@Test
public void t1()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");
	ChromeDriver ob =new ChromeDriver();
	ob.get("http://www.google.com");
	ob.quit()
}
}
