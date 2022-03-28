package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.support.FindBy

class AmountPage(var driver: AppiumDriver<*>) : BasePage(driver) {

    @FindBy(id = "schedule")
    private var scheduleButton: MobileElement? = null

    @FindBy(id = "icon")
    private var paymentTypeButton: MobileElement? = null

    @FindBy(id = "amount_text")
    private var amountText: MobileElement? = null

    @FindBy(id = "buttonKeyboardClear")
    private var clearButton: MobileElement? = null

    @FindBy(id = "textViewNote")
    private var noteTextView: MobileElement? = null

    @FindBy(id = "buttonKeyboardPlus")
    private var plusButton: MobileElement? = null

    @FindBy(id = "buttonKeyboardMinus")
    private var minusButton: MobileElement? = null

    @FindBy(id = "buttonKeyboardMultiply")
    private var multiplyButton: MobileElement? = null

    @FindBy(id = "buttonKeyboardDivide")
    private var divideButton: MobileElement? = null

    @FindBy(id = "buttonKeyboardEquals")
    private var equalsButton: MobileElement? = null

    @FindBy(id = "buttonKeyboardDot")
    private var dotButton: MobileElement? = null

    @FindBy(id = "keyboard_action_button")
    private var proceedCategory: MobileElement? = null

    fun inputAmount(amount: String) {
        for (num in amount) {
            if (num == '.') {
                dotButton?.click()
            }
            else {
                driver.findElement(By.id("buttonKeyboard$num")).click()
            }
        }
    }

    fun checkAmount(expected: String) {
        Assert.assertEquals(expected, amountText?.text)
    }

    fun clickScheduleButton() {
        scheduleButton?.click()
    }

    fun clickClearButton() {
        clearButton?.click()
    }

    fun clickPlusButton() {
        plusButton?.click()
    }

    fun clickMinusButton() {
        minusButton?.click()
    }

    fun clickMultiplyButton() {
        multiplyButton?.click()
    }

    fun clickDivideButton() {
        divideButton?.click()
    }

    fun clickEqualsButton() {
        equalsButton?.click()
    }

    fun clickCategoryButton() {
        proceedCategory?.click()
    }

    fun checkProceedCategoryText(expected: String) {
        Assert.assertEquals(expected, proceedCategory?.text)
    }

    fun selectCategory(category: String) {
        val categoriesList = driver.findElements(By.id("textCategoryName"))
        categoriesList.find { it.text == category }?.click()
    }

    fun addNewCategory() {
        proceedCategory?.click()
    }
}