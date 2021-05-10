package turbonomicInterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.SanusartReactSelectPage;
import utilities.Driver;

public class QuestionThree {

	
	
	
	
	@Test
	public void sanusartTest() {
		
		Driver.getDriver().get("https://sanusart.github.io/react-dropdown-select/");
		SanusartReactSelectPage page = new SanusartReactSelectPage();
		page.clickClear();
		page.clickDropDown();
		page.clickOptionsByOrder(1);
		page.clickOptionsByOrder(2);
	
		Assert.assertEquals("true",page.optionsIsSelectedByOrder(1));
		Assert.assertEquals("true",page.optionsIsSelectedByOrder(2));
		page.clickDropDownClose();
		page.clickClear();
		Driver.closeBrowserSession();
		
		
	}

}
