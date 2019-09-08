package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() throws MalformedURLException {
        System.out.println("********************************************************************");
        System.out.println("*******************************START********************************");
        System.out.println("********************************************************************");
        System.out.println("Opening The Browser: Chrome");
        //local execution
        String path = System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\java\\driver\\chromedriver.exe");
        base.driver = new ChromeDriver();

    }

    @After
    public void TearDownTest(Scenario scenario) {

        if (scenario.isFailed()) {
            // Take Screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("********************************************************************");
        System.out.println("*******************************FINISH*******************************");


        base.driver.quit();
    }
}
