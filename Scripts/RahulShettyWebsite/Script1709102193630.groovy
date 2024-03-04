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

'Open  browser'
WebUI.openBrowser('')

'navigate to "https://rahulshettyacademy.com/client/"'
WebUI.navigateToUrl('https://rahulshettyacademy.com/client/')

'Enter user name'
WebUI.setText(findTestObject('Object Repository/RahulShettyWebsite_OR/Login_page/inputuserEmail'), 'anshika@gmail.com')

'Enter password'
WebUI.setEncryptedText(findTestObject('Object Repository/RahulShettyWebsite_OR/Login_page/inputuserPassword'), 'VhOGoIbq1ebZ2Sfaadxugg==')

'Click on Sign in button'
WebUI.click(findTestObject('Object Repository/RahulShettyWebsite_OR/Login_page/input_login'))

'Cart first product in product list'
WebUI.click(findTestObject('Object Repository/RahulShettyWebsite_OR/Shoping_page/button_AddToCart'))

'Click on cart button'
WebUI.click(findTestObject('Object Repository/RahulShettyWebsite_OR/Shoping_page/button_Cart'))

'Verify cart product Element is visible'
WebUI.waitForElementVisible(findTestObject('Object Repository/RahulShettyWebsite_OR/Shoping_page/Cart_page/h3_ZARA_COAT_3'), 0)

'Close browser'
WebUI.closeBrowser()

