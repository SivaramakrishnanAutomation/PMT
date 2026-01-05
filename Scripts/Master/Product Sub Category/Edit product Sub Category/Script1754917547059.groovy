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

WebUI.click(findTestObject('Master/Product sub category/Add Product Sub Category/Page_BDDemoPMT/a_Time 052303 AM_ucMenu_rptLevel1_lnkLink1_0'))

WebUI.click(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/a_Product Category_ucMenu_rptLevel1_rptLeve_257b89'))

WebUI.click(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/span_Category_select2-drpProductCategory1-c_cb83b2'))

WebUI.setText(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/input_concat(id(, , select2-drpProductCateg_be94ed'), 
    'TestingAutomation')

WebUI.sendKeys(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/input_concat(id(, , select2-drpProductCateg_be94ed'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/img'))

WebUI.setText(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/input__txt_subcategory'), 
    'TestingAutomations')

WebUI.click(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/div_Save_save_btn_new_edit'))

WebUI.click(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

WebUI.click(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/span_Category_select2-drpProductCategory1-c_cb83b2'))

WebUI.setText(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/input_concat(id(, , select2-drpProductCateg_be94ed'), 
    'TestingAutomation')

WebUI.sendKeys(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/input_concat(id(, , select2-drpProductCateg_be94ed'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Master/Product sub category/Edit Product Sub Category/Page_BDDemoPMT/input_Action_glowing-border'), 
    'TestingAutomations')

