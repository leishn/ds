package tests

import driver.Driver
import io.appium.java_client.remote.MobileCapabilityType
import org.junit.After
import org.junit.Before
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

open class BaseTest : Driver() {
    @Before
    fun setup() {
        val serverAddress = URL("http://127.0.0.1:4723/wd/hub")
        val capabilities = DesiredCapabilities()
        // Setting all required capabilities
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel")
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android")
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0")
        // Emulator's UDID
        // To get UDID open terminal and run 'adb devices'
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554")
        capabilities.setCapability("appPackage", "com.monefy.app.lite")
        capabilities.setCapability("appActivity", "com.monefy.activities.main.MainActivity_")

        initDriver(serverAddress, capabilities)
    }

    @After
    fun tearDown() {
        driver?.quit()
    }
}