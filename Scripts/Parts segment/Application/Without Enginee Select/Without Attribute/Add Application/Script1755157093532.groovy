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

WebUI.waitForElementVisible(findTestObject('Parts segment/Application/Without Enginee Select/With Attribute/Add Application/Page_BDDemoPMT/img_1'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/With Attribute/Add Application/Page_BDDemoPMT/img_1'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/select__MainContent_drpVehicleType'), 
    'Car', false)

WebUI.waitForElementVisible(findTestObject('Parts segment/Application/With Enginee Select/With Attribute/Add Application/Page_BDDemoPMT/select__MainContent_drpVehicleType'), 
    20, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Parts segment/Application/With Enginee Select/With Attribute/Add Application/Page_BDDemoPMT/select__MainContent_drpVehicleType'), 
    '2', false)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/select__MainContent_drpMake'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/select__MainContent_drpModel'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/input_IncludeNonAces_MainContent_searchbtn'))

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/input_More Info_MainContent_GvApplications__613d0d'))

WebUI.setText(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/textarea_ALL ENGINES_MainContent_GvApplicat_b57c46'), 
    'Automation')

WebUI.click(findTestObject('Object Repository/Parts segment/Application/Without Enginee Select/Without Attribute/Add Application/Page_BDDemoPMT/input_Show Non AcesAttributes_MainContent_b_290c8a'))

WebUI.waitForAlert(180)

WebUI.acceptAlert()

WebUI.delay(2)

