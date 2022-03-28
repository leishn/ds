package tests

import org.junit.Test
import pages.MainPage
import pages.OfferPage
import scenarios.OnboardingSkipper

class TestAddCurrencies : BaseTest() {

    @Test
    fun testAddCurrencies() {
        OnboardingSkipper(driver!!).skipWelcomeScreens()
        val mainPage = MainPage(driver!!)
        val offerPage = OfferPage(driver!!)

        mainPage.checkBalanceText("Balance \$0.00")
        mainPage.clickSettingsButton()
        mainPage.clickCurrenciesButton()
        offerPage.checkHeaderText("Become your own budgeting hero")
        offerPage.checkClaimButtonText("CLAIM MY OFFER")
        offerPage.clickCloseOfferButton()
    }
}