package Base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class baseClass {

	public static WebDriver driver = null;
	public String url;
	public int done = 3;
	
	
	//Function to return url
	public String NHSCostCheckerurl() {
		url = "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
		return url;
	}

	//Function to select the browser
	public String browserIn() {
		return "CR";
		//		return "FF";
		//		return "IE";
		//		return "EE";
		//		return "CR";
	}

	//Launch browser and maximize to 100%
	public WebDriver browserLaunch() {

		try {
			if(browserIn().equals("CR")) {
				//Launch Chrome browser
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserIn().equals("FF")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/geckodriver.exe");
				driver = new FirefoxDriver();			
			}
			else if(browserIn().equals("EE")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			}
			else if(browserIn().equals("IE")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/src/test/resources/Drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			}
			else {
				System.out.println("WE DO NOT SUPPORT THIS BROWSER: "+browserIn());
			}
		}
		catch(Exception e) {
			System.out.println("COULD NOT START WEBDRIVER: "+e);
		}
		driver.manage().window().maximize();
		return driver;

	}


	//Launch browser and enter url
	public void browserInvoke() {
		driver = browserLaunch();
		//driver.get(CRMurl());
	}
	
	public void openNHSCostCheckerSite() {
		driver.get(NHSCostCheckerurl());
	}
	
	public void browserQuit() {
		driver.close();
		driver.quit();
	}
	
	public void Wait(int waitTime) throws InterruptedException {
		Thread.sleep(waitTime);
	}
	

//*********************************************************************************************
	 	 
	public final String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public final String getWindowTitle() {
		String currentWindowTitle = driver.getTitle();
		return currentWindowTitle;
	}
	
	 
	 public final String GetEleVal(String ele)
		{
			return ele.contains("#") ? ele.split("[#]", -1)[0].trim() : ele;
		 	//return ele.split("[#]", -1)[0].trim();
		   //return ele;
		}
	 
		public final String GetEleLbl(String ele)
		{
			return ele.contains("#") ? ele.split("[#]", -1)[1].trim() : ele;
			//return ele.split("[#]", -1)[0].trim();
			//return ele;
		}

		public final WebElement GetElement(String LocatorValue)
		{

			WebElement ele = null;
			By byLoc;
			byLoc = LocatorValue.substring(0, 2).equals("//") ? By.xpath(GetEleVal(LocatorValue)) : By.id(GetEleVal(LocatorValue));

			try
			{
				ele = driver.findElement(byLoc);
			}
			catch (RuntimeException e)
			{
				System.out.println(GetEleLbl(LocatorValue) + " not found :" + e);
				Assert.assertFalse(false);
			}
			return ele;
		}

		public final void ClickEl(WebElement ele, String lbl)
		{
			try
			{
				ele.click();
				System.out.println("Clicked element: " + lbl);
			}
			catch (RuntimeException e)
			{
				try
				{
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", ele);
					System.out.println("Could click element'" + lbl + " 'with javascript");
				}
				catch (RuntimeException exc)
				{
					System.out.println("Could not click element: " + lbl + " :: " + exc + " : " + e);
					Assert.fail();

				}
			}
		}

		//Clicking on element
		public final void ClickEle(String eleXP)
		{
			ClickEl(GetElement(eleXP), GetEleLbl(eleXP));
		}
		
//**********************************************************************************************

		public final boolean IsElepresent(String LocatorValue)
		{
					boolean flag = false;
					By byLoc;
					byLoc = LocatorValue.substring(0, 2).equals("//") ? By.xpath(GetEleVal(LocatorValue)) : By.id(GetEleVal(LocatorValue));

					try
					{
						driver.findElement(byLoc);
						flag = true;
					}
					catch (RuntimeException e)
					{
						System.out.println(GetEleLbl(LocatorValue) + " not found :" + e);
					}
					return flag;
		}

//**********************************************************************************************
	 
	 
		 public final void TypeText(String eleXP, String text)
		 {
		 			try
		 			{
		 				GetElement(eleXP).sendKeys(text);
		 				System.out.println("Typed '" + text + "' in element: " + GetEleLbl(eleXP));
		 			}
		 			catch (RuntimeException e)
		 			{
		 				try
		 				{
		 					String js = "arguments[0].setAttribute('value','" + text + "')";
		 					((JavascriptExecutor)driver).executeScript(js, GetElement(eleXP));
		 					System.out.println("Could type '" + text + "' in element: " + GetEleLbl(eleXP) + " :using javascript: " + e);
		 				}
		 				catch (RuntimeException ex)
		 				{
		 					System.out.println("Could not type '" + text + "' in element: " + GetEleLbl(eleXP) + " :: " + ex);
		 					Assert.assertFalse(false);
		 				}
		 			}
		 }

//*********************************************************************************************
		 
		//Getting title of the page
			public static String GetTitle()
			{
				//Driver refers to Title - Selenium Code
				String title = driver.getTitle();
				return title;
			}
	 
//**********************************************************************************************


//********************************************************************************************

	        public final void Match(String act, String exp, String msg)
	        {
	        			//Trim extra spaces
	        			act = act.replaceAll("\\s+", " ");
	        			exp = exp.replaceAll("\\s+", " ");
	        			//act = Regex.Replace(act, "\\s+", " ");
	        			//exp = Regex.Replace(exp, "\\s+", " ");

	        			if (act.trim().equals(exp.trim()))
	        			{
	        				msg = msg.replace("<contains>", "");
	        				System.out.println("PASS >> " + msg + " >> Actual: " + act + " :: Expected: " + exp);
	        			}
	        			else if (act.toUpperCase().trim().equals(exp.toUpperCase().trim()))
	        			{
	        				msg = msg.replace("<contains>", "");
	        				System.out.println("WARNING matched ignoring  case >> " + msg + " >> Actual: " + act + " :: Expected: " + exp);
	        			}
	        			else if (msg.contains("<contains>"))
	        			{
	        				msg = msg.replace("<contains>", "");
	        				if (act.contains(exp.trim()))
	        				{
	        					System.out.println("PASS >> Matched as Actual contains Expetced >> " + msg + " >> Actual: " + act + " :: Expected: " + exp);
	        				}
	        				else if (exp.contains(act.trim()))
	        				{
	        					System.out.println("PASS >> Matched as Actual contains Expetced >> " + msg + " >> Actual: " + act + " :: Expected: " + exp);
	        				}
	        				else
	        				{
	        					System.out.println("FAIL >>" + msg + " >> Actual: " + act + " :: Expected: " + exp);
	        					//Take screen shot
	        					Assert.assertFalse(false);
	        				}
	        			}
	        			else
	        			{
	        				System.out.println("FAIL >>" + msg + " >> Actual: " + act + " :: Expected: " + exp);
	        				//Take screen shot
	        				Assert.assertFalse(false);
	        			}
	        }
	        
	        public final String GetTexts(WebElement el, String lbl)
			{
						String text = "";
						try
						{
							((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", el);
							text = el.getText();
							if (text.equals(""))
							{
								text = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].innerText;", el);
								System.out.println("Got text:<" + text + "> using JS from element: " + lbl);
							}
							else
							{
								System.out.println("Got text:<" + text + "> from element: " + lbl);
							}
						}
						catch (RuntimeException e)
						{
							System.out.println("Could not get text from element: " + lbl + " :: " + e);
							Assert.assertFalse(false);
						}
						return text;
			}
			
			  //Getting text from element
	        public String GetText(String eleXP)
	        {
	            return GetTexts(GetElement(eleXP), GetEleLbl(eleXP));
	        }
	        	 										
}
