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

WebUI.click(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/a_Equipment_ucMenu_rptLevel1_lnkLink1_3'))

WebUI.click(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/div_Recommended_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/input__txtTealpartno'), 'TestingAutomation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/select__drpTealProductCategory'), 
    '66', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/select__drpTealproductsubcategory'), 
    '1096', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/select__drpTealpartdesc'), 
    '38924', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/select__drp_TealProductline'), 
    '27', true)

WebUI.setText(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/input__txttealbrandmaster'), 'AGS')

WebUI.click(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/div_Please ensure no blank column(s) are le_03889e'))

WebUI.setText(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/input__txtsuffix'), 'K')

WebUI.selectOptionByValue(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/select_Web Category_drpTealwebcategory'), 
    '75', true)

WebUI.click(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/input_Web Sub Category_btnTealsave'))

WebUI.click(findTestObject('Object Repository/Teal parts/Add parts/Page_TealpartsPMT/button__swal2-confirm swal2-styled'))

