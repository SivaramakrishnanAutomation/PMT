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

WebUI.click(findTestObject('part Search box/Page_BDDemoPMT/a_Equipment_ucMenu_rptLevel1_lnkLink1_3'))

WebUI.click(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_BDDemoPMT/div_Recommended_btnAdd'))

WebUI.selectOptionByLabel(findTestObject('Parts segment/Part/Add parts/Page_BDDemoPMT/select__drpProductCategoryAdd'), 'TestingAutomation', 
    false)

WebUI.selectOptionByLabel(findTestObject('Parts segment/Part/Add parts/Page_BDDemoPMT/select__drpPartDescriptionAdd'), 'ExportTesting001', 
    false)

WebUI.selectOptionByLabel(findTestObject('Parts segment/Part/Add parts/Page_BDDemoPMT/select__drpproductline'), 'Auto | Auto', 
    false)

WebUI.setText(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_BDDemoPMT/textarea__MainContent_txtPart'), 
    'ExportTesting001')

WebUI.setText(findTestObject('Parts segment/Part/Add parts/Page_PMT/input__MainContent_Suffix'), 'K', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Part/Add parts/Page_BDDemoPMT/input_Close Out_btnSave'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

