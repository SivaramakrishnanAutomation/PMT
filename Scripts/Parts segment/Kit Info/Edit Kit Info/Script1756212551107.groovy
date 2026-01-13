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

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/img'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/img'))

WebUI.click(findTestObject('Object Repository/Parts segment/Kit Info/Edit Kit Info/Page_BDDemoPMT/input_image'))

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Edit Kit Info/Page_BDDemoPMT/input_Component Part_txtCpartNumber'), 
    'Testing Automation')

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Edit Kit Info/Page_BDDemoPMT/input__txtdescription'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/Parts segment/Kit Info/Edit Kit Info/Page_BDDemoPMT/input__btnSaveKit'))

WebUI.click(findTestObject('Object Repository/Parts segment/Kit Info/Edit Kit Info/Page_BDDemoPMT/button_Kit Info Updated Successfully_swal2-_fd75b2'))

