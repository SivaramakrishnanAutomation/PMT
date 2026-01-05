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

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/img'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/img'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/h3_Digital Asset_ui-id-1'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/h3_Digital Asset_ui-id-1'))

WebUI.uploadFile(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/input_Please select one or more files to upload_fuImage'), 
    'C:\\Katalon Assets Files\\katalon Digital asset img\\red.jpg')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/select__drpAssetType'), 
    1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/select_File Type_drpFileType'), 
    'JPG', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/input_File Size_txtFileSize'), 
    '5', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/input_File Path_txtFilePath'), 
    'red.jpg', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/input_URI_txturl'), 
    '-', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/input_Asset ID_txtAssetID'), 
    'red', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/select_Representation_drpRepresentation'), 
    'A', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/input_Resolution_drpResolution1'), 
    '1080p', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/select_Orientation View_drpOrientationView'), 
    'NUL', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/select_Color Mode_drpColorCode'), 
    'RGB', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/select_Background_drpBGColor'), 
    'WHI', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/input_Sort By_txtSortBy'), 
    '1234', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/select_Watermark_drpWatermark'), 
    '1', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/select_Callout_drpCallOutField'), 
    'Yes', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/div_Modified Date_btnSave_digital'))

WebUI.click(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/button__swal2-confirm swal2-styled'))

WebUI.click(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/button__swal2-confirm swal2-styled'))

WebUI.setText(findTestObject('Object Repository/Parts segment/Digital Asset/Add Digital Asset/Page_PMT/input_Delete_glowing-border'), 
    'red')

