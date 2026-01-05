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

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/img'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/img'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/span_This is the custom brand label for the_1ac308'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/span_This is the custom brand label for the_1ac308'))

WebUI.setText(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/input_Testing_Automation  Testing_Ecat  Tes_d885ae'), 
    'TestingAutomation')

WebUI.sendKeys(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/input_Testing_Automation  Testing_Ecat  Tes_d885ae'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/input_Testing_Automation  Testing_Ecat  Tes_d885ae'), 
    'TestingAutomation', false)

WebUI.setText(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/input__txtCompetitorPartno1'), 
    'TestingAutomation')

WebUI.click(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/div_concat(id(, , ui-id-5, , ))_ui-id-5'))

WebUI.setText(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/input_SubBrand AAIAID_txtSubBrandAAIAID'), 
    'DXWM')

WebUI.setText(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_PMT/input_Recommended_txtInterchangeNotes'), 
    'Testing', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_PMT/input_Internal Notes_txtInternalNotes'), 
    'Testing', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_PMT/select_Language_drpLanguage'), 
    'EN', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_PMT/input_VMRS Brand ID_txtVMRSBrandID'), 
    'BBBBB', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_PMT/input_ReferenceItem_txtReferenceItem'), 
    '1234', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_PMT/select_Item Equivalent UOM_drpItemEquivalentUOM'), 
    'AS', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_PMT/select_Quality Grade Level_drpQualityGradeLevel'), 
    'O', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_PMT/input_Interchange Quantity_txtInterchangeQuantity'), 
    '1', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_PMT/select_Interchange Quantity UOM_drpIntercha_f14083'), 
    'AS', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Parts segment/Interchange/Add Interchange/Page_PMT/input_SubBrand Label_txtSubBrandLabel'), 
    'Poly-Armour', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/input_No-Override_btnSaveInter'))

WebUI.click(findTestObject('Object Repository/Parts segment/Interchange/Add Interchange/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

