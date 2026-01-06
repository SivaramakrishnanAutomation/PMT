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

WebUI.click(findTestObject('Object Repository/Master/part description/Add Part Description/Page_PMT/a_Time 124156 PM_ucMenu_rptLevel1_lnkLink1_0'))

WebUI.click(findTestObject('Object Repository/Master/part description/Add Part Description/Page_PMT/a_Vendor Master_ucMenu_rptLevel1_rptLevel2__fb766f'))

WebUI.click(findTestObject('Object Repository/Master/part description/Add Part Description/Page_PMT/div_Edit Part Description_btnadd_new'))

WebUI.selectOptionByLabel(findTestObject('Master/part description/Add Part Description/Page_BDDemoPMT/select__drpProductCategoryAdd'), 
    'TestingAutomation', true)

WebUI.setText(findTestObject('Object Repository/Master/part description/Add Part Description/Page_PMT/input__txtPartDescription'), 
    'TestingAutomation')

WebUI.selectOptionByIndex(findTestObject('Master/part description/Add Part Description/Page_BDDemoPMT/select_Equivalent Aces Part Terminology Name_drpAcesPartTerminology'), 
    1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Master/part description/Add Part Description/Page_PMT/div_ADD_save_btn_new_add'))

WebUI.click(findTestObject('Object Repository/Master/part description/Add Part Description/Page_PMT/button_Please select Equivalent ACES Termin_74b4de'))

