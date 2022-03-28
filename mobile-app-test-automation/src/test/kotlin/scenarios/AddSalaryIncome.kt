package scenarios

import io.appium.java_client.AppiumDriver
import pages.AmountPage
import pages.MainPage

class AddSalaryIncome(private val driver: AppiumDriver<*>){

    fun addSalaryIncome(amount: String) {
        val mainPage = MainPage(driver)
        val amountPage = AmountPage(driver)

        mainPage.clickIncomeButton()
        amountPage.inputAmount(amount)
        amountPage.clickCategoryButton()
        amountPage.selectCategory("Salary")
    }
}