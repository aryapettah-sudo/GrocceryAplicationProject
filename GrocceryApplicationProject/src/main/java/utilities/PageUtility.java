package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	

	public void selectDropdownWithValue(WebElement element, String value) {

		Select object = new Select(element);
		object.selectByValue(value);
	}
	
	public void selectDropdownWithDeselectAll(WebElement element, String value) {
			
			Select object = new Select(element);
			object.deselectAll();
		}
		
		public void selectDropDownWithVisibleText(WebElement element, String value) {
			
			Select object = new Select(element);
			object.selectByVisibleText(value);
		}
		
		public void selectDropDownByIndex(WebElement element, int index) {
			
			Select object = new Select(element);
			object.selectByIndex(index);
		}
		
		public void  selectDropDownWithGetOption(WebElement element, String value) {
				Select object = new Select(element);
				object.getOptions();			
		}

		public void selectDragDropWithText(WebElement element, String text) {
			  Select object=new Select(element);
			  object.deselectByVisibleText(text);
		  }
			
		}
	