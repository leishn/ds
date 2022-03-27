package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.junit.Assert
import org.openqa.selenium.support.FindBy

class OfferPage(driver: AppiumDriver<*>) : BasePage(driver) {

    @FindBy(id = "textViewTitle")
    private var offerHeader: MobileElement? = null

    @FindBy(id = "buttonPurchase")
    private var claimButton: MobileElement? = null

    @FindBy(id = "buttonClose")
    private var closeOfferButton: MobileElement? = null

    fun checkHeaderText(expected: String) {
        Assert.assertEquals(expected, offerHeader?.text)
    }

    fun checkClaimButtonText(expected: String) {
        Assert.assertEquals(expected, claimButton?.text)
    }

    fun clickCloseOfferButton() {
        closeOfferButton?.click()
    }
}