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

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Pies Description/Add Pies Description/Page_BDDemoPMT/img'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Pies Description/Add Pies Description/Page_BDDemoPMT/img'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Pies Description/Add Pies Description/Page_BDDemoPMT/select_Enter Long Description (DES) first_d_7e7635'), 
    10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/Pies Description/Add Pies Description/Page_BDDemoPMT/select_Enter Long Description (DES) first_d_7e7635'), 
    1)

WebUI.setText(findTestObject('Object Repository/Parts segment/Pies Description/Add Pies Description/Page_BDDemoPMT/textarea_Select_note-codable'), 
    'Testing the webpage in katalon')

WebUI.setText(findTestObject('Object Repository/Parts segment/Pies Description/Add Pies Description/Page_PMT/input_Description Sequence_txtDes'), 
    '1234', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Pies Description/Add Pies Description/Page_PMT/select_Language (Code)_drpLanguageCode'), 
    'CV', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Pies Description/Add Pies Description/Page_BDDemoPMT/input_No-Override_piesbtnSave'))

WebUI.click(findTestObject('Object Repository/Parts segment/Pies Description/Add Pies Description/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

