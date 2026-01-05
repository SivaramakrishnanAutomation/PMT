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

WebUI.click(findTestObject('Object Repository/part Search box/Page_BDDemoPMT/a_Equipment_ucMenu_rptLevel1_lnkLink1_3'))

WebUI.setText(findTestObject('Object Repository/part Search box/Page_BDDemoPMT/input_Search By_txtsearchpartno'), 'ExportTesting001')

WebUI.waitForPageLoad(10)

WebUI.sendKeys(findTestObject('Object Repository/part Search box/Page_BDDemoPMT/input_Search By_txtsearchpartno'), Keys.chord(
        Keys.ENTER))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Parts segment/Part/Delete Parts/Page_BDDemoPMT/input_Close Out_button_delete'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.waitForPageLoad(5)

