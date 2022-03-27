package scenarios

import io.appium.java_client.AppiumDriver
import pages.OfferPage
import pages.OnboardingPage

class OnboardingSkipper(private val driver: AppiumDriver<*>){

    fun skipWelcomeScreens() {
        val onboarding = OnboardingPage(driver)
        val offer = OfferPage(driver)

        repeat(3) {
            onboarding.clickContinueButton()
        }

        offer.clickCloseOfferButton()
    }
}