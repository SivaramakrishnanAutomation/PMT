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

//WebUI.click(findTestObject('Object Repository/Master/interchange part/Delete Interchange Part/Page_BDDemoPMT/a_Time 051950 AM_ucMenu_rptLevel1_lnkLink1_0'))

//WebUI.click(findTestObject('Object Repository/Master/interchange part/Delete Interchange Part/Page_BDDemoPMT/a_Interchange Name_ucMenu_rptLevel1_rptLeve_369344'))

WebUI.click(findTestObject('Object Repository/Master/interchange part/Delete Interchange Part/Page_BDDemoPMT/span_Competitor Name_select2-drpCompetitor1_82bf11'))

WebUI.setText(findTestObject('Object Repository/Master/interchange part/Delete Interchange Part/Page_BDDemoPMT/input_concat(id(, , select2-drpCompetitor1-_abc99d'), 
    'testingAutomation')

WebUI.sendKeys(findTestObject('Object Repository/Master/interchange part/Delete Interchange Part/Page_BDDemoPMT/input_concat(id(, , select2-drpCompetitor1-_abc99d'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Master/interchange part/Delete Interchange Part/Page_BDDemoPMT/input_Action_glowing-border'), 
    'TestingAutomations')

WebUI.click(findTestObject('Object Repository/Master/interchange part/Delete Interchange Part/Page_BDDemoPMT/img'))

WebUI.click(findTestObject('Object Repository/Master/interchange part/Delete Interchange Part/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

WebUI.click(findTestObject('Object Repository/Master/interchange part/Delete Interchange Part/Page_BDDemoPMT/button__swal2-confirm swal2-styled'))

