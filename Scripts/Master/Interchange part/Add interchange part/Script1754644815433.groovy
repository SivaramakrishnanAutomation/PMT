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

WebUI.click(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/a_Time 025047 PM_ucMenu_rptLevel1_lnkLink1_0'))

WebUI.click(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/a_Interchange Name_ucMenu_rptLevel1_rptLeve_369344'))

WebUI.click(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/div_Edit Interchange_btnadd_new'))

WebUI.click(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/span__select2-drp_CompetitorAdd-container'))

WebUI.setText(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/input_Please ensure no blank column(s) are _b2847e'), 
    'TestingAutomation')

WebUI.sendKeys(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/input_Please ensure no blank column(s) are _b2847e'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/input_Required_txt_CompetitorPartno'), 
    'TestingAutomation')

WebUI.click(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/div_----Select----_save_btn_new_add'))

WebUI.click(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/button__swal2-confirm swal2-styled'))

WebUI.click(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/span_Competitor Name_select2-drpCompetitor1_82bf11'))

WebUI.setText(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/input_Please ensure no blank column(s) are _b2847e'), 
    'TestingAutomation')

WebUI.sendKeys(findTestObject('Object Repository/Master/interchange part/Add interchange part/Page_PMT/input_Please ensure no blank column(s) are _b2847e'), 
    Keys.chord(Keys.ENTER))

