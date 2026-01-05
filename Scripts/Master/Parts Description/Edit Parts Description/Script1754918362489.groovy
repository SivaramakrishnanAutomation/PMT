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

WebUI.click(findTestObject('Object Repository/Master/part description/Edit Parts Description/Page_BDDemoPMT/a_Time 061956 AM_ucMenu_rptLevel1_lnkLink1_0'))

WebUI.click(findTestObject('Object Repository/Master/part description/Edit Parts Description/Page_BDDemoPMT/a_Vendor Master_ucMenu_rptLevel1_rptLevel2__5603b8'))

WebUI.selectOptionByLabel(findTestObject('Master/part description/Edit Parts Description/Page_BDDemoPMT/select_Category_drpProductCategory'), 
    'TestingAutomation', true)

WebUI.setText(findTestObject('Object Repository/Master/part description/Edit Parts Description/Page_BDDemoPMT/input_Action_glowing-border'), 
    'TestingAutomation')

WebUI.click(findTestObject('Object Repository/Master/part description/Edit Parts Description/Page_BDDemoPMT/img'))

WebUI.setText(findTestObject('Object Repository/Master/part description/Edit Parts Description/Page_BDDemoPMT/input__txtPartDescription'), 
    'TestingAutomations')

WebUI.click(findTestObject('Object Repository/Master/part description/Edit Parts Description/Page_BDDemoPMT/div_Save  Close_save_btn_new_edit'))

WebUI.click(findTestObject('Object Repository/Master/part description/Edit Parts Description/Page_BDDemoPMT/button_Please select Equivalent ACES Termin_74b4de'))

WebUI.waitForPageLoad(10)

