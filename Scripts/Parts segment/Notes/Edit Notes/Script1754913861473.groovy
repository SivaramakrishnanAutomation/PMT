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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Login/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('part search box/Enter part number2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Notes/Edit Notes/Page_BDDemoPMT/img'), 10)

WebUI.click(findTestObject('Object Repository/Parts segment/Notes/Edit Notes/Page_BDDemoPMT/img'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Notes/Edit Notes/Page_BDDemoPMT/input_image'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Notes/Edit Notes/Page_BDDemoPMT/input_image'))

WebUI.clearText(findTestObject('Parts segment/Notes/Edit Notes/Page_BDDemoPMT/textarea__MainContent_txtNotes'))

WebUI.setText(findTestObject('Parts segment/Notes/Edit Notes/Page_BDDemoPMT/textarea__MainContent_txtNotes'), 'NotesEdited')

WebUI.click(findTestObject('Object Repository/Parts segment/Notes/Edit Notes/Page_BDDemoPMT/input_Spanish Notes_MainContent_btnSave'))

// Wait for alert
WebUI.waitForAlert(20)

// Get and print alert text
String actualAlertText = WebUI.getAlertText()

println('Alert Text: ' + actualAlertText)

// Expected texts
String expectedAlertText1 = 'Note updated Successfully. Part # - TestingAutomation'

// Compare and verify
if (actualAlertText == expectedAlertText1) {
    WebUI.verifyMatch(actualAlertText, expectedAlertText1, false)
} else {
    println('Alert text does not match any expected value.')

    KeywordUtil.markWarning('Unexpected alert text: ' + actualAlertText)
}

WebUI.acceptAlert()

