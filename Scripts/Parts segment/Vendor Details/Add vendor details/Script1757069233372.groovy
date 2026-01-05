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

WebUI.click(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/img'))

WebUI.selectOptionByLabel(findTestObject('Parts segment/Vendor Details/Add/Page_TealpartsPMT/select__drpVendorLineCode'), 
    'TES | TES', false)

WebUI.setText(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/input__txtVendorSKU'), 
    'TestingAutomation')

WebUI.setText(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/input_Vendor Cost_txtVendorcost'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/input_Vendor Core Cost_txtVendorcorecost'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/input_Vendor List Cost_txtVendorlistcost'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/input_This field represents the cumulative _7f5329'), 
    '1')

WebUI.selectOptionByLabel(findTestObject('Parts segment/Vendor Details/Add/Page_TealpartsPMT/select_WareHouse Location_drpWarehouse'), 
    'CHENaI', false)

WebUI.setText(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/input_This field represents the individual _e32f04'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/select_ReOrder_txtWarehouseorder'), 
    'Y', true)

WebUI.setText(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/input_Lead Time_txtLeadTime'), 
    '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/select_Core on Hand_txtcoreonhand'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/input_Low Stock_txtLowStock'), 
    '1')

WebUI.click(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/input_Low Stock_btnvenSave'))

WebUI.click(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/button__swal2-confirm swal2-styled'))

WebUI.setText(findTestObject('Object Repository/Parts segment/Vendor Details/Add/Page_TealpartsPMT/input_Low Stock_glowing-border'), 
    'testing')

