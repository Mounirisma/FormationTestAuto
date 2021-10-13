package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;


@TestInstance(PER_CLASS)

public class SeleniumTest {

    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver webDriver;

    @BeforeAll
    public void beforAll() {

        webDriver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void aferAll() {

        webDriver.quit();
    }

    @Test
    public void openTheComPageAndCheckTheTitle() {
        String expectedComTitle = "Example Domain";
        webDriver.get("https://www.example.com");
        assertEquals(expectedComTitle, webDriver.getTitle());

    }

    @Test
    public void openTheOrgAndCheckTheTitle() {
        String expectedOrgTitle = "Example Domain";
        webDriver.get("https://www.example.com");
        assertEquals(expectedOrgTitle, webDriver.getTitle());

    }

}
