package tests

import org.junit.Test
import pages.MainPage
import pages.OfferPage
import pages.OnboardingPage

class TestGetStarted : BaseTest() {

    @Test
    fun onboarding() {
        val onboarding = OnboardingPage(driver!!)
        val offer = OfferPage(driver!!)
        val main = MainPage(driver!!)

        onboarding.checkContinueButtonText("GET STARTED")
        onboarding.clickContinueButton()
        onboarding.checkContinueButtonText("AMAZING")
        onboarding.clickContinueButton()
        onboarding.checkContinueButtonText("I’M READY")
        onboarding.clickContinueButton()
        offer.clickCloseOfferButton()

        main.checkBalanceText("Balance \$0.00")
    }
}