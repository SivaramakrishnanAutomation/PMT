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

WebUI.waitForElementVisible(findTestObject('Parts segment/Application/Edit new application/Page_EcatPMT/select_Notes_MainContent_drpsearchnotes'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Parts segment/Application/Edit new application/Page_EcatPMT/select_Notes_MainContent_drpsearchnotes'), 
    'Katalon', false)

WebUI.click(findTestObject('Parts segment/Application/Edit new application/Page_EcatPMT/input_Type_MainContent_btnsearch'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/With Attribute/Edit Application/Page_BDDemoPMT/input_Validate_appartsedit_btn'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/With Attribute/Edit Application/Page_BDDemoPMT/button_ACES_MainContent_btnacesattibues'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/With Attribute/Edit Application/Page_BDDemoPMT/input_Region_MainContent_dlDisplayColumnLis_a29b34'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/With Attribute/Edit Application/Page_BDDemoPMT/input_Sub Model_MainContent_dlDisplayColumn_303378'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/With Attribute/Edit Application/Page_BDDemoPMT/input_position_MainContent_dlDisplayColumnL_c8d079'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/With Attribute/Edit Application/Page_BDDemoPMT/input_Right_MainContent_imgupdate'))

WebUI.waitForAlert(60)

WebUI.acceptAlert()

