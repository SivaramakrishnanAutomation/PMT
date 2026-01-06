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

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/img'), 10)

WebUI.click(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/img'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select__drpShippingScope'), 
    10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select__drpShippingScope'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select__drpBulk'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select__drpRegCountry'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select__drpTransportMethod'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select__drpRegulated'), 
    1)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_Recommended_txtShippingName'), 
    'Apa', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_Recommended_txtHazMaterialDesc'), 
    'chemicals', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_UN  NA ID Code_txtUN'), 
    '123456', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_Recommended_txtShippingName'), 
    'Apa', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select_Language_drpLanguageCode'), 
    'EN', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select_WHMIS Code_drpWHMISCode'), 
    'D.3.B', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_Hazardous Placard Notation_txtHazPlac_1b9ab4'), 
    '1234567890', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_WHMIS Free Text_txtWHMISFree'), 
    'MEPZ', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_Recommended_txtHazMaterialCodeQualifier'), 
    '1', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select_Packing Group Code_drpPackingGroup'), 
    'III', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select_Hazardous Class_drpHazardousClass'), 
    '4.2', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_Regulations Exemption Code_txtReguExemption'), 
    '123456', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select_Recommended_drpHazardousMaterial'), 
    '8', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_Outer Package Label_txtOuterPackage'), 
    'Apa', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_Description_txtDescription'), 
    'Export', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_Text Message_txtMessage'), 
    'Apa', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/select_Hazardous Material Label Code_drpMat_e4c667'), 
    '4.2', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/input_Hazardous Material Label Code_btnsave_5d61d9'))

WebUI.click(findTestObject('Object Repository/Parts segment/Hazardous Material/Page_PMT/button_Successfully Hazardous Material Save_2ea55f'))

