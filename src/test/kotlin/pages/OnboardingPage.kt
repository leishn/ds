package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.junit.Assert
import org.openqa.selenium.support.FindBy

class OnboardingPage(driver: AppiumDriver<*>) : BasePage(driver) {

    @FindBy(id = "textViewHeader")
    private var header: MobileElement? = null

    @FindBy(id = "buttonContinue")
    private var continueButton: MobileElement? = null

    fun checkContinueButtonText(expected: String) {
        Assert.assertEquals(expected,continueButton?.text)
    }

    fun clickContinueButton() {
        continueButton?.click()
    }
}