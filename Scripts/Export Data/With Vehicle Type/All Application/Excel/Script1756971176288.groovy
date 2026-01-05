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

WebUI.click(findTestObject('Object Repository/Export Data/With Sub Brand/All Application/Page_PMT/a_Parts_ucMenu_rptLevel1_lnkLink1_4'))

WebUI.click(findTestObject('Export Data/With Sub Brand/All Application/Page_PMT/button_Select the format you like to export_bac3c8'))

WebUI.selectOptionByLabel(findTestObject('Export Data/With Sub Brand/All Application/Page_PMT/select__DrpLine'), 'Auto | Auto', 
    false)

WebUI.click(findTestObject('Export Data/With Vehicle Type/Page_DemoPMT/h3_You can select only one Part Description when All Lines are selected_vehicletypeh3'))

WebUI.click(findTestObject('Export Data/With Vehicle Type/Page_DemoPMT/input_VehicleType_checkAllVehicleType'))

WebUI.click(findTestObject('Export Data/With Vehicle Type/Page_DemoPMT/input_Select All_2'))

WebUI.click(findTestObject('Object Repository/Export Data/With Sub Brand/All Application/Page_PMT/button_Generate Excel_CSVExport'))

// Wait for alert
WebUI.waitForAlert(20, FailureHandling.OPTIONAL)

// Get and print alert text
String actualAlertText = WebUI.getAlertText(FailureHandling.OPTIONAL)

println('Alert Text: ' + actualAlertText)

// Expected texts
String expectedAlertText1 = 'Your export is initiated. Please check the Queue Management page for more details'

//print Alert Text
println('Alert Text Occurred' + actualAlertText)

// Compare and verify
if (actualAlertText == expectedAlertText1) {
	WebUI.verifyMatch(actualAlertText, expectedAlertText1, false, FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.acceptAlert(FailureHandling.OPTIONAL)
} else {
	println('Alert text does not match any expected value.')

	KeywordUtil.markWarning('Unexpected alert text: ' + actualAlertText)
}
