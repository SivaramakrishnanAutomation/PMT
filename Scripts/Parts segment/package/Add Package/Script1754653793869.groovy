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

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/package/Add Package/Page_BDDemoPMT/img'), 10)

WebUI.click(findTestObject('Object Repository/Parts segment/package/Add Package/Page_BDDemoPMT/img'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/package/Add Package/Page_BDDemoPMT/select_Required_drpPackageUom'), 
    10)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/package/Add Package/Page_BDDemoPMT/select_Required_drpPackageUom'), 
    1)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_BDDemoPMT/input_Required_txtQtyPackage'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Recommended_txtPackageGTIN'), 
    '11111111111122', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Electronic Product Code_txtElectronic'), 
    'ttttttttttttttttttttttttttt', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Recommended_txtBarCode'), 
    'BBBB', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Orderable Package_txtorderpackage'), 
    '1', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Stacking Factor_txtStacking'), 
    '2', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/select_Inner Qty UOM_drpQtyUOm'), 
    'AS', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Weight Variance_txtWeightvar'), 
    '4', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Inner Qty_txtQty'), '12', 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Merchandising Height_txtHeight'), 
    '150', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Merchandising Width_txtWidth'), 
    '150', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Merchandising Length_txtLength'), 
    '3', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Shipping Height_txtShippingHeight'), 
    '3', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Shipping Width_txtShippingWidth'), 
    '3', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Shipping Length_txtShippingLength'), 
    '3', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/select_UOM Of Dimension_drpUomDimension'), 
    'IN', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/select_UOM for Weight_drpUomWeight'), 
    'GT', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Weight Per Package_txtWeight'), 
    '5', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/package/Add Package/Page_PMT/input_Dimensional Weight_txtDimensional'), 
    '6', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/package/Add Package/Page_BDDemoPMT/input_Dimensional Weight_btnSavePkg'))

WebUI.click(findTestObject('Object Repository/Parts segment/package/Add Package/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

WebUI.click(findTestObject('Object Repository/Parts segment/package/Add Package/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

