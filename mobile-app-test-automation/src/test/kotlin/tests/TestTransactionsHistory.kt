package tests

import org.junit.Test
import pages.MainPage
import pages.TransactionsHistoryPage
import scenarios.AddSalaryIncome
import scenarios.OnboardingSkipper

class TestTransactionsHistory : BaseTest() {

    @Test
    fun testPaymentsAppearsInHistory() {
        val mainPage = MainPage(driver!!)
        val transactionsHistory = TransactionsHistoryPage(driver!!)

        OnboardingSkipper(driver!!).skipWelcomeScreens()
        AddSalaryIncome(driver!!).addSalaryIncome("100")
        AddSalaryIncome(driver!!).addSalaryIncome("500")

        mainPage.openTransactionsHistory()
        transactionsHistory.checkTransactionsCategoryWholeAmount("\$600.00")
        transactionsHistory.expandCategory()
        transactionsHistory.checkAmountByIndex(0, "\$500.00")
        transactionsHistory.checkAmountByIndex(1, "\$100.00")
    }
}