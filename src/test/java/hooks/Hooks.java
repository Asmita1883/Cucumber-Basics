package hooks;

import io.cucumber.java.*;

public class Hooks {

    @Before ("@Prod")
    public void prodScenario (){
        System.out.println("Execute only for Prod scenario");
    }

    @Before (order = 1)
    public void launchBrowser(Scenario scenario) {
        System.out.println("Scenario: " + scenario.getName());
        System.out.println("******Launching Browser********");
    }
@Before (order = 2)
    public void maximizeBrowser() {
        System.out.println("******Maximizing Browser******");
    }
    @After (order = 1)
    public void quitBrowser (){
        System.out.println("******Quit Browser********");
    }
    @After (order = 2)
    public void clearCache (){
        System.out.println("******Clearing cache********");
    }
}
