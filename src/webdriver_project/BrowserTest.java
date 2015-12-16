

package webdriver_project;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class BrowserTest {
    

    
    public static void main(String[] arg) throws InterruptedException{
        
        
       
        
      
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("file://D:/Frames.html");
        
        driver.switchTo().frame(0);
        WebElement txt = driver.findElement(By.name("1"));
        txt.sendKeys("Ku-ku epta");
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        
        WebElement txt2 = driver.findElement(By.name("2"));
        txt2.sendKeys("Ebanko foreva");
        
        
        
//        String window = driver.getWindowHandle();
//        
//        System.out.println("Window 1 " +window);
//        
//        WebElement link = driver.findElement(By.linkText("Google Search"));
//        link.click();
//        
//        String window2 = driver.getWindowHandle();
//         System.out.println("Window 2 " +window2);
//        System.out.println("Number of window " +driver.getWindowHandles().size());
//        
//        driver.switchTo().window(window);
        
        
        
//        WebElement div = driver.findElement(By.id("div-context"));
        //WebElement item = driver.findElement(By.id("ui-id-4"));
        
        
        
//        Actions builder = new Actions (driver);
//        
//        builder.contextClick(div).click(driver.findElement(By.id("ui-id-4"))).perform();
        
        
        
        
        
        
        
        
        
        
        
//      WebElement one = driver.findElement(By.name ("one"));
////       WebElement eleven = driver.findElement(By.name ("eleven"));
////       WebElement five = driver.findElement(By.name ("five"));
//        WebElement three = driver.findElement(By.name ("three"));
//       
//       //System.out.println("X location = " +seven.getLocation().getX()+ " Y location = " +seven.getLocation().getY());
//       
////       int border = 1;
////       int tileWidht = 100;
////       int tileHeight = 80;
//              
//       Actions builder = new Actions (driver);
//       builder.clickAndHold(three)
//       .release(one)
//       .perform();
       
//       builder.click(one).click(eleven).click(five);
//       builder.build().perform();
            
       
       
       
       //one
//       builder.moveByOffset(one.getLocation().getX()+border, one.getLocation().getY()+border).click();
//       builder.build().perform();
       //eleven
//       builder.moveByOffset(2*tileWidht+4*border, 2*tileHeight+4*border).click();
//       builder.build().perform();
       
       //Five click
       
//       builder.moveByOffset(-2*tileWidht-4*border, -tileHeight-2*border).click();
//       builder.build().perform();
       
//       builder.keyDown(Keys.CONTROL)
//               .click(one)
//               .click(three)
//               .click(five)
//               .keyUp(Keys.CONTROL);
////       Action compositeAction = builder.build();
//       builder.perform();
       
       
       
       
       
       
       
       
        
        
//        System.out.println("Show type " + search.getAttribute("type"));
//        System.out.println("Show type " + search.getAttribute("jsaction"));
//        System.out.println("Show type " + search.getAttribute("name"));
//        System.out.println("Show type " + search.getAttribute("aria-lable"));

        
}
}
   
//<input type="submit" jsaction="sf.chk" name="btnK" aria-label="Google Search" value="Google Search">
//        WebElement search = driver.findElement(By.name ("q"));
//        search.sendKeys("polomahterov");
//        search.submit();
        
        
        
        
        
        
        
//        profile.setEnableNativeEvents(true);
//        FirefoxDriver driver = new FirefoxDriver(profile);
//      
//        driver.get("http://www.toolsqa.com");
//       
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        
//        WebElement search = driver.findElementByXPath("/html/body/div[1]/header/div/div[2]/div/nav/div[2]/form/a");
//        search.click();
//        WebElement search1 = driver.findElementByName("s");
//        search1.sendKeys("flash");
//        search1.submit();
        
        
        
        
//        search.click();
//        search.sendKeys("flash");
//        search.submit();
        
        
        //search.click();
        
        
        
        
                       
//        driver.get("http://www.cleartrip.com/");
//        Thread.sleep(2000);
//        
//        WebElement element = driver.findElementById("DepartDate");
//        element.click();
//        driver.findElementByXPath("/html/body/div[1]/div[1]/table/tbody/tr[5]/td[7]/a").click();
//        
        
        
        //driver.findElementById("package-departing").click();
        //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        //driver.switchTo().frame("");
       // driver.findElementByXPath("/html/body/div[18]/div/div/section[1]/ul/li[29]/a").click();
        
        
        
        
        
        
        
        // String pageSource = driver.getPageSource();
        // System.out.println("Page source is " + pageSource);
        
        //driver.close();
        
        
        
        
                
      
  
    


