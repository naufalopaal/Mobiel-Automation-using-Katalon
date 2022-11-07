import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication(GlobalVariable.app_path, true)


Mobile.tap(findTestObject('Object Repository/Register/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Daftar'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Masukkan nama lengkap'), 0)

Mobile.setText(findTestObject('Register/android.widget.EditText - Masukkan nama lengkap'), 'Opal', 0)

Mobile.tap(findTestObject('Register/android.widget.EditText - Masukkan email'), 0)

Mobile.setText(findTestObject('Register/android.widget.EditText - Masukkan email'), 'naufalhisyamff@gmail.com', 0)

Mobile.tap(findTestObject('Register/android.widget.EditText - Masukkan password'), 0)

Mobile.setText(findTestObject('Register/android.widget.EditText - Masukkan password'), '1q2w3e4r5t', 0)

Mobile.tap(findTestObject('Register/android.widget.EditText - Contoh 08123456789'), 0)

Mobile.setText(findTestObject('Register/android.widget.EditText - Contoh 08123456789'), '08987654321', 0)

Mobile.tap(findTestObject('Register/android.widget.EditText - Masukkan kota'), 0)

Mobile.setText(findTestObject('Register/android.widget.EditText - Masukkan kota'), 'Jakarta', 0)

Mobile.tap(findTestObject('Register/android.widget.EditText - Masukkan alamat'), 0)

Mobile.setText(findTestObject('Register/android.widget.EditText - Masukkan alamat'), 'Jalan aja dulu, jadian belakangan', 
    0)

Mobile.tap(findTestObject('Register/android.widget.Button - Daftar'), 0)

WebUI.delay(4)

