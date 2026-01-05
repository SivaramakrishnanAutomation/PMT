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

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Extended Info/Add Extended Info/Page_BDDemoPMT/img'), 
    10)

WebUI.click(findTestObject('Parts segment/Extended Info/Add Extended Info/Page_BDDemoPMT/img'))

WebUI.waitForElementVisible(findTestObject('Parts segment/Extended Info/Add Extended Info/Page_BDDemoPMT/select__drpcodedesc'), 
    10)

WebUI.selectOptionByIndex(findTestObject('Parts segment/Extended Info/Add Extended Info/Page_BDDemoPMT/select__drpcodedesc'), 
    1)

WebUI.waitForElementVisible(findTestObject('Parts segment/Extended Info/Add Extended Info/Page_BDDemoPMT/select__drpEXPIDATA'), 
    10)

WebUI.selectOptionByIndex(findTestObject('Parts segment/Extended Info/Add Extended Info/Page_BDDemoPMT/select__drpEXPIDATA'), 
    1)

WebUI.waitForElementVisible(findTestObject('Parts segment/Extended Info/Add Extended Info/Page_BDDemoPMT/select__Drplanguage'), 
    10)

WebUI.selectOptionByIndex(findTestObject('Parts segment/Extended Info/Add Extended Info/Page_BDDemoPMT/select__Drplanguage'), 
    1)

WebUI.click(findTestObject('Object Repository/Parts segment/Extended Info/Add Extended Info/Page_BDDemoPMT/button__btnSave_Exd'))

WebUI.click(findTestObject('Object Repository/Parts segment/Extended Info/Add Extended Info/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

