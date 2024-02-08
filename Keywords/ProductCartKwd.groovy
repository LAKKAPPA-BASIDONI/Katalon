import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ProductCartKwd {

	ProductCartLocator pcl = new ProductCartLocator()

	def goto1() {
		WebUI.openBrowser("https://rahulshettyacademy.com/client")
	}

	def login(String email, String password) {
		WebUI.setText(pcl.useremail(), email ) //"anshika@gmail.com"
		WebUI.setText(pcl.password(), password)  //"Iamking@000"
		WebUI.click(pcl.login())
	}

	def cartProduct() {
		WebUI.click(pcl.firstProduct())
	}

	def validateProduct() {
		WebUI.click(pcl.cartMenu())
		if( WebUI.verifyElementVisible(pcl.productName())) 
			KeywordUtil.markPassed("product is added to cart section.")
		else KeywordUtil.markFailed("product not added to cart section.")
	}

	def close() {
		WebUI.closeBrowser()
	}
}
