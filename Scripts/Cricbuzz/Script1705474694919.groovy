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
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebElement as Keys

CricbuzzKwd cricbuzz = new CricbuzzKwd()

	cricbuzz.open()
	//cricbuzz.navigateToScoreCard()
	cricbuzz.playerInformationCollect("teamA")
	cricbuzz.playerInformationCollect("teamB")
	cricbuzz.printPlayerInformation()
	cricbuzz.chooseBatsman(4)
	cricbuzz.chooseBowler(4)
	cricbuzz.chooseWicketKeeper(1)
	cricbuzz.chooseAllrounder(2)
	cricbuzz.playing11Team()
	cricbuzz.close()
/*ksjd
 * navigate to cricbuzz url
 * open the up comming maches  select latest one and verify teams name 
 * goto squad menu and collect team 11 information for both team
 * predict best playing 11 player.
 */
	
/*df
 * Jenkins pipelin script.
 * 
 * pipeline{
 * agent any
 * 		stages{
 * 			stage('checkout'){
 * 				steps{
 * 					deleteDir();
 * 					checkout([
 * 							$class : 'GITSCM',
 * 							branch : [[name: 'main']],
 * 							userRemoteConfigs: [[ url:'git hub repository url']]
 * 					})
 * 			}
 * 			stage('TEST'){
 * 				steps{
 *                  bat """   """
 *                  	}
 *                  }
 * }
 * }
 */
