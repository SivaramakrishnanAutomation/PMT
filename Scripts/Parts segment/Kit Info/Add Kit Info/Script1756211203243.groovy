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

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/img'), 
    10)

WebUI.click(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/img'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input_Component Part_txtCpartNumber'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input_Component Part_txtCpartNumber'), 
    'Testing', FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/select__drpDescCode'), 1)

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input__txtdescription'), 
    'abdc', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/div__field_20'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input__txtdescription'), 
    'Testing', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input_SubBrand ID_txtSbrandId'), 
    '1234', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input_SubBrand Label_txtSbrandLabel'), 
    'BBBB', FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/select__drpQtyuom'), 1)

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input__txtqtykit'), '1')

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input_Component Brand ID_drpCbrandID'), 
    'Test-Rite', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/div_concat(id(, , ui-id-10, , ))_ui-id-10'), 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/select__drpLanguageCode'), 
    1)

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input_Sequence Code_txtSeqCode'), 
    '1234', FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/select_Component Qualifier ID_drpCqalifierID'), 
    1, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/select__drpSoldSeperately'), 
    1)

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input_Component Part Terminology ID_drpComp_aae017'), 
    'Engine Coolant Water Housing Cover ', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/div_Test-Rite (DSDK)_ui-id-22'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input__btnSaveKit'))

WebUI.click(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/button_Kit Info Added Successfully_swal2-co_bbb501'))

WebUI.setText(findTestObject('Object Repository/Parts segment/Kit Info/Add Kit Info/Page_BDDemoPMT/input_Action_glowing-border'), 
    'Testing')

