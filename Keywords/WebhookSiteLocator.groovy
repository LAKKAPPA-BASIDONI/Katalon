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
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class WebhookSiteLocator {
	
	public TestObject moreDropDownOption() {
		return findTestObject('Object Repository/WebhookSite_ObjectRepository/more_dropdownOption')
	}
	
	public TestObject deleteAllRequest() {
		return findTestObject('Object Repository/WebhookSite_ObjectRepository/option_deleteAllRequest')
	}
	
	public TestObject whUrl() {
		return findTestObject('Object Repository/WebhookSite_ObjectRepository/url_wh')
	}
	
	public TestObject getRawContent() {
		return findTestObject('Object Repository/WebhookSite_ObjectRepository/text_RawContrent')
	}
	
	public RequestObject apiRequest(String url) {
		return findTestObject('Object Repository/APIRepository/fourth',['url':url])
	}
}
