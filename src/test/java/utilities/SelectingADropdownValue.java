package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectingADropdownValue {
	
	    public void selectByIndex(WebElement element, int index) {
		Select drop= new Select(element);
		drop.selectByIndex(index);
		}
		
		public void selectByValue(WebElement element, String value) {
		Select drop= new Select(element);
		drop.selectByValue(value);
		}

		public void selectByVisibleText(WebElement element, String text) {
		if(text != ""){
		Select drop= new Select(element);
		drop.selectByVisibleText(text);
		}
		}


}
