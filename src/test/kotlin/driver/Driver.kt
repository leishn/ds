package driver

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import java.util.concurrent.TimeUnit

open class Driver {
    var driver: AppiumDriver<MobileElement>? = null

    fun initDriver(url: URL, capabilities: DesiredCapabilities) {
        driver = AndroidDriver(url, capabilities)
        driver!!.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
    }

}