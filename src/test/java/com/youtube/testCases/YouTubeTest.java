package com.youtube.testCases;

import static org.hamcrest.MatcherAssert.assertThat;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.youtube.pages.Homepage;
import com.youtube.pages.SearchResult;
import com.youtube.testBase.TestBase;
import com.youtube.utils.TestUtility;

public class YouTubeTest extends TestBase {
	Homepage homepage;
	SearchResult searchResult;
	TestUtility testUtil;

	@BeforeClass(alwaysRun = true)
	public void setUp() throws InterruptedException {
		testUtil = new TestUtility();
		initialization();
		log.info("Application Launched Successfully");
		homepage = new Homepage();
		homepage.navigateToHomePage();
		Thread.sleep(5000);
	}

	@Test(priority = 1, enabled = true)
	public void verifyLogoDisplayedInHomePage(Method method) {
		extentTest = extent.startTest(method.getName());

		assertThat("home page logo not displayed", homepage.isLogoDisplayed());
	}

	@Test(priority = 2, enabled = true)
	public void verifyAllListedAppsDisplayed(Method method) throws InterruptedException {
		extentTest = extent.startTest(method.getName());
		homepage.youtubeApp();
		Thread.sleep(5000);
		List<String> expectedDropdownOptions = Arrays.asList("YouTube TV", "YouTube Music", "YouTube Kids",
				"Creator Academy", " YouTube for Artists");
		assertThat("dropdown did not displayed correctly",
				expectedDropdownOptions.containsAll(homepage.youtubePopUp()));
	}

	@Test(priority = 2, enabled = true)
	public void verifyUserIsAbleToSearchAndScrollTillEnd(Method method) throws InterruptedException {
		extentTest = extent.startTest(method.getName());
		searchResult = homepage.searchKeyword("bata drums");

		System.out.println("number of search results are : " + searchResult.getListOfVideoTitles().size());

		while (!searchResult.isFooterDisplayed()) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollTo(0, document.documentElement.scrollHeight);");
			Thread.sleep(5000);
			System.out.println("number of search results are : " + searchResult.getListOfVideoTitles().size());
		}
	}

}
