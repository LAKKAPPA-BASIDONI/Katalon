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
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebhookSiteLocator locator = new WebhookSiteLocator()

WebUI.openBrowser("")
WebUI.navigateToUrl("https://webhook.site/")
WebUI.click(locator.moreDropDownOption())
WebUI.click(locator.deleteAllRequest())
WebUI.acceptAlert()
String url12 = WebUI.getText(locator.whUrl())
System.out.println(" :::::: "+url12)

RequestObject request = locator.apiRequest(url12)
def response = WS.sendRequest(request)
String rawContent = WebUI.getText(locator.getRawContent())
KeywordUtil.logInfo(rawContent)
if(rawContent.contains("Lakkappa Basidoni")) {
	KeywordUtil.markPassed("body contains name")
}else {
	KeywordUtil.markPassed("body not contains name")
}




//WebUI.navigateToUrl(url12)
//WebUI.navigateToUrl("https://webhook.site/")
//WebUI.delay(2)
//boolean bool = WebUI.verifyElementVisible(findTestObject('Object Repository/WebhookSite_ObjectRepository/recentNotification'))
//System.out.println(" :::::: "+bool)
//
//String idText = WebUI.getText(findTestObject('Object Repository/WebhookSite_ObjectRepository/id_text'))
//KeywordUtil.logInfo("WEB HOOK ID TEXT : "+idText);
//String currentUrl = WebUI.getText(findTestObject('Object Repository/WebhookSite_ObjectRepository/current_url'))
//if(url12.contains(currentUrl)) {
//	KeywordUtil.markPassed("Both are same.")
//}else {
//	KeywordUtil.markFailed("Both are not same")
//}
////WebUI.closeBrowser()
//


