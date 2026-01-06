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

WebUI.click(findTestObject('Object Repository/Master/Product Line/add product line/Page_BDDemoPMT/a_Time 045247 AM_ucMenu_rptLevel1_lnkLink1_0'))

WebUI.click(findTestObject('Object Repository/Master/Product Line/add product line/Page_BDDemoPMT/a_Brand Master_ucMenu_rptLevel1_rptLevel2_0_47c4f4'))

WebUI.click(findTestObject('Object Repository/Master/Product Line/add product line/Page_BDDemoPMT/div_Edit Product Line_btnadd_new'))

WebUI.setText(findTestObject('Object Repository/Master/Product Line/add product line/Page_BDDemoPMT/input__txt_linecode'), 
    'Auto')

WebUI.click(findTestObject('Object Repository/Master/Product Line/add product line/Page_BDDemoPMT/i_Save_fas fa-save'))

WebUI.click(findTestObject('Object Repository/Master/Product Line/add product line/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

WebUI.setText(findTestObject('Object Repository/Master/Product Line/add product line/Page_BDDemoPMT/input_Generate URI_glowing-border'), 
    'Auto')

