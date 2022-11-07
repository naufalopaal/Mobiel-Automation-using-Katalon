import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegisterMobile {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
@Given("User launch apps")
public void user_launch_apps() {
    // Write code here that turns the phrase above into concrete actions
    Mobile.startApplication(GlobalVariable.app_path, true)
}

@When("User click Akun button")
public void user_click_Akun_button() {
    // Write code here that turns the phrase above into concrete actions
    Mobile.tap(findTestObject('Object Repository/Register/android.widget.ImageView'), 0)
}

@When("User click Masuk button")
public void user_click_Masuk_button() {
    // Write code here that turns the phrase above into concrete actions
    Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Masuk'), 0)
}

@When("User click Daftar button")
public void user_click_Daftar_button() {
    // Write code here that turns the phrase above into concrete actions
    Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Daftar'), 0)
}

@When("User input name (.*)")
public void user_input_name_Testing(String name) {
    // Write code here that turns the phrase above into concrete actions
    Mobile.setText(findTestObject('Register/android.widget.EditText - Masukkan nama lengkap'), name, 0)
}

@When("User input email (.*)")
public void user_input_email_rajafredi_gmail_com(String email) {
    // Write code here that turns the phrase above into concrete actions
    Mobile.setText(findTestObject('Register/android.widget.EditText - Masukkan email'), email, 0)
}

@When("User input password (.*)")
public void user_input_password_qwerty(String password) {
    // Write code here that turns the phrase above into concrete actions
    Mobile.setText(findTestObject('Register/android.widget.EditText - Masukkan password'), password, 0)
}

@When("User click Daftar button create")
public void user_click_Daftar_button_create() {
    // Write code here that turns the phrase above into concrete actions
    Mobile.tap(findTestObject('Register/android.widget.Button - Daftar'), 0)
}

@Then("Successfully created")
public void successfully_created() {
    // Write code here that turns the phrase above into concrete actions
    WebUI.delay(4)
}

}