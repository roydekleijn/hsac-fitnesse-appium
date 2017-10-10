package nl.hsac.fitnesse.fixture.util.mobile.element;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.SearchContext;

import java.net.URL;


public class HsacIOSElement extends IOSElement {
    @Override
    protected void setFoundBy(SearchContext foundFrom, String locator, String term) {
        if (foundFrom instanceof IOSDriver) {
            URL url = ((IOSDriver) foundFrom).getRemoteAddress();
            super.setFoundBy(new DummyContext("IOSDriver on: " + url), locator, term);
        } else {
            super.setFoundBy(foundFrom, locator, term);
        }
    }
}