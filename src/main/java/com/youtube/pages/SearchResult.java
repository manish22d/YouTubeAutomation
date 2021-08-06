package com.youtube.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.youtube.constants.Constants;
import com.youtube.testBase.TestBase;

public class SearchResult extends TestBase {

	@FindBy(xpath = "//div[@id='start']//a[@id='logo']/div/yt-icon[@id='logo-icon']")
	WebElement logo;

	@FindBy(xpath = "//ytd-video-renderer//a[@id='video-title']")
	List<WebElement> videoTitle;

	@FindBy(xpath = "//ytd-item-section-renderer/div[@id='contents']/ytd-message-renderer/yt-formatted-string[@id='message']")
	WebElement endOfResultMsg;

	public SearchResult() {
		PageFactory.initElements(driver, this);
	}

	public List<String> getListOfVideoTitles() {
		new WebDriverWait(driver, Constants.EXPLICIT_WAIT).until(ExpectedConditions.elementToBeClickable(logo));
		return videoTitle.stream().map(ele -> ele.getText()).collect(Collectors.toList());
	}

	public boolean isFooterDisplayed() {
		new WebDriverWait(driver, Constants.EXPLICIT_WAIT).until(ExpectedConditions.elementToBeClickable(logo));
		try {
			return endOfResultMsg.isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("under catch");
			return false;
		}
	}

}
