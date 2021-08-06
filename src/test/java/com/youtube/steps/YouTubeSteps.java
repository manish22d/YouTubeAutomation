package com.youtube.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

import com.youtube.pages.Homepage;
import com.youtube.pages.SearchResult;
import com.youtube.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YouTubeSteps extends TestBase {

	Homepage homepage;
	SearchResult searchResult;

	@Given("^I want to perform test on YouTube$")
	public void i_want_to_perform_test_on_YouTube() {
		if (driver == null)
			initialization();
	}

	@When("^user navigates to YouTube homepage$")
	public void user_navigates_to_YouTube_homepage() throws InterruptedException {
		homepage = new Homepage();
		homepage.navigateToHomePage();
		Thread.sleep(5000);
	}

	@Then("^verify YouTube logo displayed correctly$")
	public void verify_YouTube_logo_displayed_correctly() {
		assertThat("home page logo not displayed", homepage.isLogoDisplayed());
	}

	@Then("^verify YouTube apps dropdown displayed all options$")
	public void verify_YouTube_apps_dropdown_displayed_all_options(List<String> expectedDropdownOptions) throws InterruptedException {
		homepage.youtubeApp();
		Thread.sleep(5000);
		System.out.println(expectedDropdownOptions);
		System.out.println(homepage.youtubePopUp());
		System.out.println(homepage.youtubePopUp().size());
		System.out.println(expectedDropdownOptions.containsAll(homepage.youtubePopUp()));
		assertThat("dropdown did not displayed correctly", expectedDropdownOptions.containsAll(homepage.youtubePopUp()));
	}

	@When("^user perform search in YouTube homepage$")
	public void user_perform_search_in_YouTube_homepage(List<String> searchKey) {
		searchResult = homepage.searchKeyword(searchKey.get(0));

	}

	@Then("^verify search result displayed correctly$")
	public void verify_search_result_displayed_correctly() {
		System.out.println("number of search results are : " + searchResult.getListOfVideoTitles().size());

	}

	@Then("^verify user is able to scroll till end of page using infinite scrolling$")
	public void verify_user_is_able_to_scroll_till_end_of_page_using_infinite_scrolling()  throws InterruptedException{
		while (!searchResult.isFooterDisplayed()) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollTo(0, document.documentElement.scrollHeight);");
			Thread.sleep(5000);
			System.out.println("number of search results are : " + searchResult.getListOfVideoTitles().size());
		}
	}

}
