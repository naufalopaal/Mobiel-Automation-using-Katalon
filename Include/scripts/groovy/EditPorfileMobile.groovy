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



class EditPorfileMobile {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User laucnh Profile Page")
	public void user_laucnh_Profile_Page() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.callTestCase(findTestCase('login/LoginMobile - Positive'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User click edit button")
	public void user_click_edit_button() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.tap(findTestObject('Edit_Profile_Positive/android.widget.EditButton'), 0)
	}

	@When("User click Nama")
	public void user_click_Nama() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.tap(findTestObject('Object Repository/TestEdit/android.widget.ImageView (2)'), 0)

	}

	@When("User clear Nama")
	public void user_clear_Nama() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.clearText(findTestObject('Object Repository/TestEdit/TestEdit2/android.widget.EditText - Binar 04'), 0)
	}

	@When("User input Nama (.*)")
	public void user_input_Nama_Binar(String nama) {
		// Write code here that turns the phrase above into concrete actions
		Mobile.setText(findTestObject('Object Repository/TestEdit/TestEdit2/android.widget.EditText - Nama'), nama, 0)
	}

	@When("User click Simpan")
	public void user_click_Simpan() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.tap(findTestObject('Edit_Profile_Positive/android.widget.TombolSimpan'), 0)
	}

	@When("User click NomorHP")
	public void user_click_NomorHP() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.tap(findTestObject('Object Repository/TestEdit/android.widget.ImageView (3)'), 0)

	}

	@When("User clear NomorHP")
	public void user_clear_NomorHP() {
		// Write code here that turns the phrase above into concrete actions
		Mobile.clearText(findTestObject('Object Repository/TestEdit/TestEdit2/android.widget.EditText - 08976543210'), 0)
	}


	@When("User input NomorHP (.*)")
	public void user_input_NomorHP_nomorhp(String nomorhp) {
		// Write code here that turns the phrase above into concrete actions
		Mobile.setText(findTestObject('Object Repository/TestEdit/TestEdit2/android.widget.EditText - Nomor HP'), nomorhp,
				0)
	}

	@When("User click Simpan{int}")
	public void user_click_Simpan(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		Mobile.tap(findTestObject('Edit_Profile_Positive/android.widget.TombolSimpan'), 0)
	}


	@Then("Page show successfully")
	public void page_show_successfully() {
		// Write code here that turns the phrase above into concrete actions
		WebUI.delay(3)
		Mobile.closeApplication()
	}
}