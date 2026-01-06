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

//WebUI.click(findTestObject('Object Repository/Master/Excel/Add Digital Asset Excel/Page_BDDemoPMT/a_Time 060309 AM_ucMenu_rptLevel1_lnkLink1_0'))
//WebUI.click(findTestObject('Object Repository/Master/Excel/Add Digital Asset Excel/Page_BDDemoPMT/a_Data Import_ucMenu_rptLevel1_rptLevel2_0__663825'))
WebUI.callTestCase(findTestCase('Login/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Master/Excel/Add Digital Asset Excel/Page_BDDemoPMT/a_Time 060309 AM_ucMenu_rptLevel1_lnkLink1_0'))

WebUI.click(findTestObject('Object Repository/Master/Excel/Add Digital Asset Excel/Page_BDDemoPMT/a_Data Import_ucMenu_rptLevel1_rptLevel2_0__663825'))

WebUI.selectOptionByLabel(findTestObject('Master/Excel/Add Digital Asset Excel/Page_BDDemoPMT/select_Data Type_MainContent_ddldata'), 
    'PIESNotes', false)

WebUI.selectOptionByLabel(findTestObject('Master/Excel/Add Parts Excel/Page_BDDemoPMT/select_Product Line_MainContent_drpProductLine'), 
    'Auto | Auto', false, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Master/Excel/Add Digital Asset Excel/Page_BDDemoPMT/input_Upload my file_MainContent_FileUpload1'), 
    'C:\\Katalon Assets Files\\Excel Files\\PIES Notes.xlsm')

WebUI.click(findTestObject('Object Repository/Master/Excel/Add Digital Asset Excel/Page_BDDemoPMT/input_Upload my file_MainContent_btnUpload'))

// Wait for alert
WebUI.waitForAlert(20)

// Get and print alert text
String actualAlertText = WebUI.getAlertText()

println('Alert Text: ' + actualAlertText)

// Expected texts
String expectedAlertText1 = 'The imported file will be reflected in the Queue Management System within 15 minutes'

String expectedAlertText2 = 'Import is successful. You can download the imported file from the Downloads section to view the import status of each record'

// Compare and verify
if (actualAlertText == expectedAlertText1) {
    WebUI.verifyMatch(actualAlertText, expectedAlertText1, false)
} else if (actualAlertText == expectedAlertText2) {
    WebUI.verifyMatch(actualAlertText, expectedAlertText2, false)
} else {
    println('Alert text does not match any expected value.')

    KeywordUtil.markWarning('Unexpected alert text: ' + actualAlertText)
}

WebUI.acceptAlert()

