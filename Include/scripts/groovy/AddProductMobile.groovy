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



class AddProductMobile {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
@Given("User login using registered account")
public void user_login_using_registered_account() {
    // Write code here that turns the phrase above into concrete actions
    WebUI.callTestCase(findTestCase('login/LoginMobile - Positive'), [:], FailureHandling.STOP_ON_FAILURE)
}

@When("User click Add button")
public void user_click_Add_button() {
    // Write code here that turns the phrase above into concrete actions
    Mobile.tap(findTestObject('Object Repository/Add Product/android.widget.ImageButton'), 0)
}

@When("User input Nama (.*) Produk")
public void user_input_Nama_Vape_Produk(String nama) {
    // Write code here that turns the phrase above into concrete actions
    Mobile.setText(findTestObject('Object Repository/Add Product/android.widget.EditText - Nama Produk'), nama, 0)
}

@When("User input Harga (.*) Produk")
public void user_input_Harga_Produk(String harga) {
    // Write code here that turns the phrase above into concrete actions
    Mobile.setText(findTestObject('Object Repository/Add Product/android.widget.EditText - Rp 0,00 (1)'), harga, 0)
}

@When("User choose Kategori Elektronik")
public void user_choose_Kategori_Elektronik(String kategori) {
    // Write code here that turns the phrase above into concrete actions
    Mobile.tap(findTestObject('Object Repository/Add Product/android.widget.Spinner - Pilih Kategori'), kategori, 0)
	Mobile.tap(findTestObject('Object Repository/Add Product/android.view.ViewGroup'), 0)
	Mobile.hideKeyboard()
	
}

@When("User input Lokasi (.*)")
public void user_input_Lokasi_lokasi(String lokasi) {
    // Write code here that turns the phrase above into concrete actions
    Mobile.setText(findTestObject('Object Repository/Add Product/android.widget.EditText - Lokasi Produk'), lokasi, 
    0)
}

@When("User input Deskripsi Testing (.*)")
public void user_input_Deskripsi_Testing(String deskripsi) {
    // Write code here that turns the phrase above into concrete actions
    Mobile.setText(findTestObject('Object Repository/Add Product/android.widget.EditText - Contoh Barang bagus mantap'), deskripsi, 
    0)

}

@When("User click Terbitkan button")
public void user_click_Terbitkan_button() {
    // Write code here that turns the phrase above into concrete actions
    Mobile.tap(findTestObject('Object Repository/Add Product/android.widget.Button - Terbitkan'), 0)
}

@Then("Product successfully added")
public void product_successfully_added() {
    // Write code here that turns the phrase above into concrete actions
    WebUI.delay(4)
	Mobile.closeApplication()
}
}
