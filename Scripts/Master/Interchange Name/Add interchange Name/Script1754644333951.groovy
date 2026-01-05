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

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Master/interchange name/Add interchange name/Page_BDDemoPMT/a_Time 120238 AM_ucMenu_rptLevel1_lnkLink1_0'))

WebUI.click(findTestObject('Object Repository/Master/interchange name/Add interchange name/Page_BDDemoPMT/a_Interchange Related_ucMenu_rptLevel1_rptL_4ba551'))

WebUI.click(findTestObject('Object Repository/Master/interchange name/Add interchange name/Page_BDDemoPMT/div_Edit Interchange Details_btnadd_new'))

WebUI.setText(findTestObject('Object Repository/Master/interchange name/Add interchange name/Page_BDDemoPMT/input__txt_CompetitorName'), 
    'TestingAutomation')

WebUI.setText(findTestObject('Object Repository/Master/interchange name/Add interchange name/Page_BDDemoPMT/input_Interchange Brand Name_txt_Competitor_4ade17'), 
    'AGS')

WebUI.click(findTestObject('Object Repository/Master/interchange name/Add interchange name/Page_BDDemoPMT/div_concat(id(, , ui-id-2, , ))_ui-id-2'))

WebUI.click(findTestObject('Object Repository/Master/interchange name/Add interchange name/Page_BDDemoPMT/div_BBCW_save_btn_new_add'))

WebUI.click(findTestObject('Object Repository/Master/interchange name/Add interchange name/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

WebUI.setText(findTestObject('Object Repository/Master/interchange name/Add interchange name/Page_BDDemoPMT/input_Action_glowing-border'), 
    'TestingAutomation')

