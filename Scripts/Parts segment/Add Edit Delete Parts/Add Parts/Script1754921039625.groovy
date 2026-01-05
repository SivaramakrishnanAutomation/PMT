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

WebUI.click(findTestObject('Object Repository/part Search box/Page_BDDemoPMT/a_Equipment_ucMenu_rptLevel1_lnkLink1_3'))

WebUI.click(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_BDDemoPMT/div_Recommended_btnAdd'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_BDDemoPMT/select__drpProductCategoryAdd'), 
    'TestingAutomation', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_BDDemoPMT/select__drpPartDescriptionAdd'), 
    'TestingAutomation', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_BDDemoPMT/select__drpproductline'), 
    'Auto | Auto', false)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_BDDemoPMT/textarea__MainContent_txtPart'), 
    'TestingAutomation')

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input__MainContent_Suffix'), 'K', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_Parts Manufacture_MainContent_txtManufacture'), 
    'Test-Rite', FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_Parts Manufacture_MainContent_txtManufacture'), 
    Keys.chord(Keys.ENTER), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_UNSPSC Code_MainContent_txtvnspsc'), 
    '12345678', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input__MainContent_Suffix'), 'K', 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_Core_MainContent_ChkCore'), FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/select_Recommended_drpGTINQualifier'), 
    'EN', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_Recommended_MainContent_txtGTIN'), 
    '12345678900987', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_Weight Per Application_MainContent_txtWeight'), 
    '12', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/select_Qty Qualifier_drpQtyQualifier'), 
    'REQ', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_Recommended_MainContent_txtQty'), 
    '1', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_Recommended_MainContent_txtMinQty'), 
    '12', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/select_Recommended_drpMinQtyUOM'), 
    'AS', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/td'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_COO Code_MainContent_txtCountryOrigin'), 
    '12', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Parts segment/Part/Add parts/Page_BDDemoPMT/input_Brand_txtbrandmasterid'), 'AGS', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Parts segment/Part/Add parts/Page_PMT/div_concat(id(, , ui-id-2, , ))_ui-id-2'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_Effective Date_MainContent_txtSupercededate'), 
    '', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_PMT/input_Brand_txtbrandmasterid'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_BDDemoPMT/input_Close Out_btnSave'))

WebUI.click(findTestObject('Parts segment/Part/Add parts/Page_PMT/button__swal2-confirm swal2-styled'), FailureHandling.OPTIONAL)

WebUI.waitForAlert(10)

WebUI.acceptAlert()

