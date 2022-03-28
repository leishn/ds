package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.support.FindBy

class TransactionsHistoryPage(val driver: AppiumDriver<*>) : BasePage(driver) {

    @FindBy(id = "transaction_group_header")
    private var transactionGroup: MobileElement? = null

    fun checkTransactionsCategoryWholeAmount(expectedAmount: String) {
        val categoryAmount = transactionGroup?.findElement(By.id("textViewWholeAmount"))
        Assert.assertEquals(expectedAmount, categoryAmount?.text)
    }

    fun expandCategory() {
        transactionGroup?.click()
    }

    fun checkAmountByIndex(index: Int, expectedAmount: String) {
        val amounts = driver.findElements(By.id("textViewTransactionAmount"))
        Assert.assertEquals(expectedAmount, amounts[index]?.text)
    }
}