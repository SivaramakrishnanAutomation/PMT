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
    'Testing', false)

WebUI.click(findTestObject('Parts segment/Application/Edit new application/Page_EcatPMT/input_Type_MainContent_btnsearch'))

WebUI.click(findTestObject('Parts segment/Application/delete new application/Page_DemoPMT/input_View QDB_chk_appparts Testing'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/With Enginee Select/With Attribute/Delete Application/Page_BDDemoPMT/input_Edit_apppartdelete'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

