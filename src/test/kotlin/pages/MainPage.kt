package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.support.FindBy

class MainPage(val driver: AppiumDriver<*>) : BasePage(driver) {

    @FindBy(id = "overflow")
    private var settingsButton: MobileElement? = null

    @FindBy(id = "currency_panel")
    private var currenciesButton: MobileElement? = null

    @FindBy(id = "income_amount_text")
    private var incomeAmount: MobileElement? = null

    @FindBy(id = "expense_amount_text")
    private var expenseAmount: MobileElement? = null

    @FindBy(id = "balance_amount")
    private var balance: MobileElement? = null

    @FindBy(id = "income_button")
    private var incomeButton: MobileElement? = null

    @FindBy(id = "expense_button")
    private var expenseButton: MobileElement? = null

    fun clickSettingsButton() {
        settingsButton?.click()
    }

    fun clickCurrenciesButton() {
        currenciesButton?.click()
    }

    fun clickFoodIcon() {
        val icons = driver.findElements(By.className("android.widget.ImageView"))
        icons[0].click()
    }

    fun checkIncomeAmountText(expected: String) {
        Assert.assertEquals(expected, incomeAmount?.text)
    }

    fun checkExpenceAmountText(expected: String) {
        Assert.assertEquals(expected, expenseAmount?.text)
    }

    fun checkBalanceText(expected: String) {
        Assert.assertEquals(expected, balance?.text)
    }

    fun openTransactionsHistory() {
        balance?.click()
    }

    fun clickIncomeButton() {
        incomeButton?.click()
    }

    fun clickExpenseButton() {
        expenseButton?.click()
    }
}