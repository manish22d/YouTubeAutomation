package com.youtube.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.youtube.constants.Constants;
import com.youtube.testBase.TestBase;

public class Homepage extends TestBase {

	@FindBy(xpath = "//div[@id='start']//a[@id='logo']/div/yt-icon[@id='logo-icon']")
	WebElement logo;

	@FindBy(xpath = "//input[@id='search']")
	WebElement search;

	@FindBy(xpath = "//*[@id='search-icon-legacy']")
	WebElement searchButton;
	
	@FindBy(xpath = "//div[@id='container']/div[@id='end']//yt-icon-button[@id='button']/button[@id='button' and @aria-label='YouTube apps']")
	WebElement apps;

	@FindBy(xpath = "//ytd-popup-container//div[@id='container']")
	WebElement appsPop;

	@FindBy(xpath = "//ytd-popup-container//div[@id='container']//div[@id='items']//a//yt-formatted-string[@id='label']")
	List<WebElement> appsMenu;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public boolean isLogoDisplayed() {
		new WebDriverWait(driver, Constants.EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(logo));
		return logo.isDisplayed();
	}

	public void navigateToHomePage() {
		new WebDriverWait(driver, Constants.EXPLICIT_WAIT).until(ExpectedConditions.elementToBeClickable(logo));
		logo.click();
	}

	public SearchResult searchKeyword(String keyword) {
		new WebDriverWait(driver, Constants.EXPLICIT_WAIT).until(ExpectedConditions.elementToBeClickable(search));
		search.sendKeys(keyword);
		searchButton.click();
		
		return new SearchResult();
	}

	public void youtubeApp() {
		new WebDriverWait(driver, Constants.EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(apps));
		apps.click();
	}

	public List<String> youtubePopUp() {
		new WebDriverWait(driver, Constants.EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(appsPop));
		return appsMenu.stream().map(ele -> ele.getText()).collect(Collectors.toList());
	}

}
