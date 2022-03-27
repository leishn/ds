package tests

import org.junit.Test
import pages.AmountPage
import pages.MainPage
import pages.OfferPage
import scenarios.OnboardingSkipper

class TestAddIncome : BaseTest() {

    @Test
    fun testAddIncome() {
        OnboardingSkipper(driver!!).skipWelcomeScreens()
        val mainPage = MainPage(driver!!)
        val amountPage = AmountPage(driver!!)

        mainPage.checkBalanceText("Balance \$0.00")
        mainPage.clickIncomeButton()
        amountPage.checkAmount("0")
        amountPage.inputAmount("155")
        amountPage.clickCategoryButton()
        amountPage.selectCategory("Salary")
        mainPage.checkIncomeAmountText("\$155.00")
        mainPage.checkBalanceText("Balance \$155.00")
    }

    @Test
    fun testProVersionAds() {
        OnboardingSkipper(driver!!).skipWelcomeScreens()
        val mainPage = MainPage(driver!!)
        val amountPage = AmountPage(driver!!)
        val offerPage = OfferPage(driver!!)

        mainPage.clickIncomeButton()
        amountPage.clickScheduleButton()
        offerPage.checkHeaderText("Become your own budgeting hero")
        offerPage.checkClaimButtonText("CLAIM MY OFFER")
        offerPage.clickCloseOfferButton()

        amountPage.inputAmount("1")
        amountPage.clickCategoryButton()
        amountPage.selectCategory("ADD")
        offerPage.checkHeaderText("Become your own budgeting hero")
        offerPage.checkClaimButtonText("CLAIM MY OFFER")
        offerPage.clickCloseOfferButton()
    }
}