
	package genericUtilityOrLib;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class SeleniumUtility {

		WebDriver driver = null;
		Actions act = null;
		Select s = null;
		
		/**
		 * this is generic method for implicit wait
		 * @param particularSeconds
		 */
		public void implicit(WebDriver driver,int particularSeconds)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
		
		}
		
		/**
		 * this is generic methods to maximize window
		 */
		public void maximizeWindow(WebDriver driver)
		{
			driver.manage().window().maximize();
		
		}
		
	//--------------------------Actions class generic function---------------------------------------------/
		/**
		 * this is generic method to right click on an element
		 */
		public void rightClickOnAnElement(WebDriver driver,WebElement elemenet)
		{
			act = new Actions(driver);
			act.contextClick(elemenet).perform();
		}

		/**
		 * this is generic method to  click on an element
		 */
		public void clickOnAnElement(WebDriver driver,WebElement elemenet)
		{
			act = new Actions(driver);
			act.click(elemenet).perform();
		}
		
		/**
		 * this is generic method to  drag and drop an element
		 * @param src
		 * @param target
		 */
		public void dragAndDropAnElement(WebDriver driver,WebElement src, WebElement target)
		{
			act = new Actions(driver);
			act.dragAndDrop(src, target).perform();
		}
		
		/**
		 * this is generic method to  drag and drop a pointer
		 * @param src
		 * @param xOffSet
		 * @param yOffSet
		 */
		public void dragAPointer(WebDriver driver,WebElement src, int xOffSet, int yOffSet)
		{
			act = new Actions(driver);
			act.dragAndDropBy(src, xOffSet, yOffSet).perform();
		}
		
		/**
		 * this is generic method to  perform scroll down operation
		 * @param element
		 */
		public void scrollToParticularElement(WebDriver driver,WebElement element)
		{
			act = new Actions(driver);
			act.scrollToElement(element).perform();
		}
		
		/**
		 * this is generic method to mouse cursor to a particular element
		 */
		public void moveCursorToAnElement(WebDriver driver,WebElement element)
		{
			act = new Actions(driver);
			act.moveToElement(element).perform();
		}
		
		/**
		 * this is generic method to hold an element
		 */
		public void holdAnElement(WebDriver driver,WebElement element)
		{
			act = new Actions(driver);
			act.clickAndHold(element).perform();
		}
		
		/**
		 *  this is generic method to release an element
		 * @param element
		 */
		public void releaseAnElement(WebDriver driver,WebElement element)
		{
			act = new Actions(driver);
			act.release(element).perform();
		}
		
	//-----------------------Select class generic function---------------------------------/
		/**
		 * this is a generic method to select an options based on index
		 * @param element
		 * @param indexNum
		 */
		
		public void selectElementByIndex(WebDriver driver,WebElement element, int indexNum)
		{
			s = new Select(element);
			s.selectByIndex(indexNum);
		}
		
		/**
		 * this is a generic method to select an options based on visible text
		 * @param element
		 * @param text
		 */
		public void selectElementByVisibleText(WebDriver driver,WebElement element, String text)
		{
			s = new Select(element);
			s.selectByVisibleText(text);
		}
		
		/**
		 * this is a generic method to select an options based on value
		 * @param element
		 * @param value
		 */
		public void selectElementByValue(WebDriver driver,WebElement element, String value)
		{
			s = new Select(element);
			s.selectByValue(value);
		}
		
		/**
		 * this is a generic method to de-select an options based on index
		 * @param element
		 * @param indexNum
		 */
		public void deSelectElementByIndex(WebDriver driver,WebElement element, int indexNum)
		{
			s = new Select(element);
			s.deselectByIndex(indexNum);
		}
		
		/**
		 * this is a generic method to de-select an options based on visible text
		 * @param element
		 * @param text
		 */
		public void deSelectElementByVisibleText(WebDriver driver,WebElement element, String text)
		{
			s = new Select(element);
			s.deselectByVisibleText(text);
		}
		
		/**
		 * this is a generic method to de-select an options based on value
		 * @param element
		 * @param value
		 */
		public void deSelectElementByValue(WebDriver driver,WebElement element, String value)
		{
			s = new Select(element);
			s.deselectByValue(value);
		}
		
		/**
		 * this is a generic method to de-select all the options
		 * @param element
		 */
		public void deselectAllOptions(WebDriver driver,WebElement element)
		{
			s = new Select(element);
			s.deselectAll();
		}
		
		/**
		 * this is a generic method to fetch selected options
		 * @param element
		 * @return
		 */
		public List<WebElement> fetchAllSelectedOptions(WebElement element)
		{
			s = new Select(element);
			List<WebElement> all = s.getAllSelectedOptions();
					return all;
		}
		
		/**
		 * this is a generic method to fetch all options
		 * @param element
		 * @return
		 */
		public List<WebElement> fetchAllOptions(WebElement element)
		{
			s = new Select(element);
			List<WebElement> all = s.getOptions();
					return all;
		}
		
		//----------------------------Alert----------------------------------------------------/
		/**
		 * this is a generic method to accept the alert
		 */
		public void acceptAlert()
		{
			driver.switchTo().alert().accept();
		}
		
		/**
		 * this is a generic method to dismiss the alert
		 */
		public void dismissAlert()
		{
			driver.switchTo().alert().dismiss();
		}
		//----------------------------Frame----------------------------------------------------/

		/**
		 * this is a generic method to switch frame based on child index
		 */
		public void switchToChildFrame(int childFrameIndex)
		{
			driver.switchTo().frame(childFrameIndex);
		}

		public void get(String string) {
			// TODO Auto-generated method stub
			
		}
	}
