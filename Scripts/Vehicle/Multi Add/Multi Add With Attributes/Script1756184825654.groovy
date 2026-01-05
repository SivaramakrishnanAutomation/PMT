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

WebUI.click(findTestObject('Object Repository/Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/a_XML_ucMenu_rptLevel1_lnkLink1_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/button_Vehicle Data_MainContent_Button1'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/select_Product Line_MainContent_drpProductLine'), 
    'Auto | Auto', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/select_Vehicle  Equipment Type_MainContent__4985d0'), 
    '2', true)

WebUI.selectOptionByIndex(findTestObject('Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/select_Make_MainContent_drpMake'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/select_Model_MainContent_drpModel'), 
    1)

WebUI.click(findTestObject('Object Repository/Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/input_Include Holes_MainContent_btn_search'))

WebUI.click(findTestObject('Object Repository/Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/input_Delete_MainContent_GVData_chkActivee1_0'))

WebUI.click(findTestObject('Object Repository/Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/button_EditView_MainContent_btnacesattibues'))

WebUI.click(findTestObject('Object Repository/Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/input_Region_MainContent_dlDisplayColumnLis_a29b34'))

WebUI.click(findTestObject('Object Repository/Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/input_Sub Model_MainContent_dlDisplayColumn_303378'))

WebUI.selectOptionByLabel(findTestObject('Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/select__MainContent_ddlpline'), 
    'Auto | Auto', false)

WebUI.click(findTestObject('Object Repository/Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/button_MfrLabel_MainContent_btnAdd'))

WebUI.click(findTestObject('Object Repository/Vehicle/Multi Add/Multi Add With Attributes/Page_BDDemoPMT/button_TestingAutomation_MainContent_imgSave'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

