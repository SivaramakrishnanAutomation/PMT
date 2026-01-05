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

WebUI.click(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/a_Parts_ucMenu_rptLevel1_lnkLink1_4'))

WebUI.click(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/button_ACES with QDB Codes_ACESwithRawNotes'))

WebUI.selectOptionByLabel(findTestObject('Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/select__DrpLine'), 
    'Auto | Auto', false)

WebUI.click(findTestObject('Export Data/With Make/Page_DemoPMT/h3_Car_Makeh3'))

WebUI.click(findTestObject('Export Data/With Make/Page_DemoPMT/input_Make_checkAllMake'))

WebUI.click(findTestObject('Export Data/With Make/Page_DemoPMT/input_Select All_196'))

WebUI.click(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces with QDB Code/XML/Page_EcatPMT/span_ACES Header Info_ui-accordion-header-i_110dfa'))

WebUI.setText(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/input__CompanyName'), 
    'Aces Xml', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/input__CompanyContact'), 
    '1234567890', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/p__field_20'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/input__DocumentTitle'), 
    'dvsd', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_BDDemoPMT/input__EffectiveDate'), 
    '20102002', FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_BDDemoPMT/select__SubmissionType'), 
    1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/p_( CA-Canada , MX-Mexico , US-United State_ebf116'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/input__SenderCompany'), 
    'sdcs', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/input__SenderContact'), 
    '0987654321', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/input__SenderPhone'), 
    '1122334455', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/button_Generate CSV_XMLExport'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Export Data/Only Test Line Select/Aces With Raw Notes/XML/Page_EcatPMT/button_(You can download the records with o_3ecba3'), 
    FailureHandling.STOP_ON_FAILURE)


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