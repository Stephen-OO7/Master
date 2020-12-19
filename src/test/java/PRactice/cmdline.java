package PRactice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class cmdline {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
WebDriver wd=new ChromeDriver();
wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

wd.get("https://acc.patseer.com");
wd.findElement(By.xpath("//input[@id='LoginForm:loginName']")).sendKeys("stephen@patentinsightpro.com");
wd.findElement(By.xpath("//input[@id='LoginForm:password']")).sendKeys("771baner");


do 
{
	
wd.findElement(By.xpath("//a[@id='LoginForm:submitButton']")).click();
Thread.sleep(3000);

}while(!wd.getCurrentUrl().contains("app.patseer.com/Home"));

Actions a= new Actions(wd);
a.moveToElement(wd.findElement(By.xpath("//body[@id='MASTERPAGEBODYID']/form[@id='form1']/div[@id='patseerHeader']/div[@id='headerCntrl_jquerylogoeffecthide']/div[@class='patseer_logo floatLeft patseerLogoMenuHeight patseerLogoMenuHeightGPS']/div[@id='headerCntrl_patseerLogoCntrl_divMenuCntrl']/ul[@class='dropdown homemenu floatLeft']/li[@id='headerCntrl_patseerLogoCntrl_liSearch']/a[1]"))).build().perform();
wd.findElement(By.xpath("//a[@class='m_1_s_4']")).click();
wd.findElement(By.xpath("//textarea[@style='position: absolute; padding: 0px; width: 1px; height: 1em;']")).click();
wd.findElement(By.xpath("//textarea[@style='position: absolute; padding: 0px; width: 1px; height: 1em;']")).sendKeys("T:motor");;





	}

}
