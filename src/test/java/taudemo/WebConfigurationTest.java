package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;


@TestInstance(PER_CLASS)

public class WebConfigurationTest {

    private final BrowserGetter browserGetter= new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll(){

        driver=browserGetter.getDriver();
    }
    @AfterAll
    public void afterAll(){

        driver.quit();
    }
    @Test
    public void justATest(){
        driver.get("https://www.example.com");
        assertEquals("Example Domain",driver.getTitle());



    }

}
