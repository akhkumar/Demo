package demo1001.demo101;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class AppTest {
	
		// TODO Auto-generated method stub
	 
	 @Test
	public void check() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        
       if(title.equalsIgnoreCase("google")) {
    	   System.out.println("Landed on correct page") ;
       }else
       {
        System.out.println("Wrong page");
       }
        
   driver.close();
    }
}
