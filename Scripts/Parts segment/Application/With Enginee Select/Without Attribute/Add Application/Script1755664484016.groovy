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

WebUI.callTestCase(findTestCase('Login/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('part search box/Enter part number2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Parts segment/Application/Without Enginee Select/With Attribute/Add Application/Page_BDDemoPMT/img_1'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/With Attribute/Add Application/Page_BDDemoPMT/img_1'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByLabel(findTestObject('Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/select__MainContent_drpVehicleType'), 
    'Car', false)

WebUI.waitForElementVisible(findTestObject('Parts segment/Application/With Enginee Select/With Attribute/Add Application/Page_BDDemoPMT/select__MainContent_drpVehicleType'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Parts segment/Application/With Enginee Select/With Attribute/Add Application/Page_BDDemoPMT/select__MainContent_drpVehicleType'), 
    '2', false)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/select__MainContent_drpMake'), 
    1)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/select__MainContent_drpModel'), 
    1)

WebUI.click(findTestObject('Object Repository/Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/input_You can choose either specific engine_d110b2'))

WebUI.click(findTestObject('Parts segment/Application/With Enginee Select/With Attribute/Add Application/Page_BDDemoPMT/input_Engine Not Required (All Engines)_chk9_0'))

WebUI.click(findTestObject('Parts segment/Application/With Enginee Select/With Attribute/Add Application/Page_BDDemoPMT/input_IncludeNonAces_MainContent_searchbtn'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/input_More Info_MainContent_GvApplications__613d0d'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/button_ACES_MainContent_btnacesattibues'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/input_Region_MainContent_dlDisplayColumnLis_a29b34'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/input_Sub Model_MainContent_dlDisplayColumn_303378'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/input_Ignition System Type_MainContent_dlDi_48be22'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/input_position_MainContent_dlDisplayColumnL_c8d079'))

WebUI.setText(findTestObject('Object Repository/Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/textarea_L4 982CC 60CID 1.0L 2.56 65.0 2.91_ccf76b'), 
    'Attribute remove')

WebUI.click(findTestObject('Object Repository/Parts segment/Application/With Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/input_Right_MainContent_imgSave'))

WebUI.waitForAlert(180)

// Get and print alert text
String actualAlertText = WebUI.getAlertText()

println('Alert Text: ' + actualAlertText)

// Expected text
String expectedAlertText = 'Appparts Added Successfully'

// Verify (strict match)
WebUI.verifyMatch(actualAlertText, expectedAlertText, false)

// Accept the alert
WebUI.acceptAlert()

