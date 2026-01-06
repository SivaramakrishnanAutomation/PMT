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

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/img'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/img'))

WebUI.waitForElementNotClickable(findTestObject('Object Repository/Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/div_Custom Category_btnadd_new'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/div_Custom Category_btnadd_new'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/select_No Record Found_Channel_Add4'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/input_No Record Found_Category1_Add4'), 
    'Test')

WebUI.click(findTestObject('Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/input_No Record Found_save_ImageButton4'))

not_run: WebUI.waitForElementClickable(findTestObject('Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/input_No Record Found_save_ImageButton4'), 
    20)

not_run: WebUI.waitForElementClickable(findTestObject('Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/input_No Record Found_save_ImageButton4'), 
    20)

WebUI.click(findTestObject('Object Repository/Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

WebUI.setText(findTestObject('Object Repository/Parts segment/Custom Category/Add Custom Category/Page_BDDemoPMT/input_Action_glowing-border'), 
    'Test')

