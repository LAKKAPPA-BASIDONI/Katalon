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

TestData data = findTestData(GlobalVariable.dataFiles)
String email = data.getValue("USEREMAIL", 1)
String password = data.getValue("PASSWORD", 1)
ProductCartKwd product = new ProductCartKwd()
product.goto1()
product.login(email, password)
product.cartProduct()
product.validateProduct()
WebUI.back()
for(int i=1; i<10;i++) {
	def nnmm= WebUI.getText(findTestObject('Object Repository/ProductCart_ObjectRepository/checkbox_label',[id:i]))
	System.out.println(nnmm)
}

WebUI.back()
for(int i=1; i<10;i++) {
	WebUI.waitForElementVisible(findTestObject('Object Repository/ProductCart_ObjectRepository/checkbox_label',[id:i]), 20)
	WebUI.check(findTestObject('Object Repository/ProductCart_ObjectRepository/input_checkbox',[id:i]))
	WebUI.delay(1)
	
}
//product.close()


