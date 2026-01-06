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

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/price/Add price/Page_BDDemoPMT/img'), 10)

WebUI.click(findTestObject('Object Repository/Parts segment/price/Add price/Page_BDDemoPMT/img'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/price/Add price/Page_BDDemoPMT/select__drpPriceType'), 
    10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/price/Add price/Page_BDDemoPMT/select__drpPriceType'), 
    1)

WebUI.setText(findTestObject('Object Repository/Parts segment/price/Add price/Page_BDDemoPMT/input__txtPriceSheet'), '1234')

WebUI.setText(findTestObject('Object Repository/Parts segment/price/Add price/Page_BDDemoPMT/input__txtPrice'), '100')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/price/Add price/Page_BDDemoPMT/select__drpPriceUOM'), 
    1)

WebUI.setText(findTestObject('Object Repository/Parts segment/price/Add price/Page_PMT/input_Price Break Quantity_txtPriceBreak'), 
    '12', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/price/Add price/Page_PMT/select_Price Break Quantity UOM_drpPriceBreak'), 
    'AS', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/price/Add price/Page_PMT/input_Price Type Description_txtPriceType'), 
    'Testing', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/price/Add price/Page_PMT/select_Currency Code_drpCurrencyCode'), 
    'USD', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/price/Add price/Page_PMT/input_Price Multiplier_txtPriceMulti'), 
    '12', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/price/Add price/Page_BDDemoPMT/input_Price Multiplier_btnpriSave'))

WebUI.click(findTestObject('Object Repository/Parts segment/price/Add price/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

