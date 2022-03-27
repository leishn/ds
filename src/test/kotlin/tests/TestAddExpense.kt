package tests

import org.junit.Test
import pages.AmountPage
import pages.MainPage
import scenarios.OnboardingSkipper

class TestAddExpense : BaseTest() {

    @Test
    fun testAddExpenseFromZero() {
        OnboardingSkipper(driver!!).skipWelcomeScreens()
        val mainPage = MainPage(driver!!)
        val amountPage = AmountPage(driver!!)

        mainPage.checkBalanceText("Balance \$0.00")
        mainPage.clickExpenseButton()
        amountPage.checkAmount("0")
        amountPage.inputAmount("300")
        amountPage.clickCategoryButton()
        amountPage.selectCategory("Car")
        mainPage.checkExpenceAmountText("\$300.00")
        mainPage.checkBalanceText("Balance -\$300.00")
    }

    @Test
    fun testQuickAddExpense() {
        OnboardingSkipper(driver!!).skipWelcomeScreens()
        val mainPage = MainPage(driver!!)
        val amountPage = AmountPage(driver!!)

        mainPage.clickFoodIcon()
        amountPage.checkAmount("0")
        amountPage.inputAmount("300")
        amountPage.checkProceedCategoryText("ADD 'FOOD'")
        amountPage.clickCategoryButton()
    }
}