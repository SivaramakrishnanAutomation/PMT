import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Login/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('part search box/Enter part number2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Parts segment/Part/Delete Parts/Page_BDDemoPMT/input_Close Out_button_delete'))

// Wait for alert
WebUI.waitForAlert(20)

// Get and print alert text
String actualAlertText = WebUI.getAlertText()

println('Alert Text: ' + actualAlertText)

// Expected texts
String expectedAlertText1 = 'All associated information with this part, like application, interchange, description, etc., will also be removed. If this part is added as a substitute for any other parts, the same will also be removed. Do you want to continue the part deletion?'

// Compare and verify
if (actualAlertText == expectedAlertText1) {
    WebUI.verifyMatch(actualAlertText, expectedAlertText1, false)
} else {
    println('Alert text does not match any expected value.')

    KeywordUtil.markWarning('Unexpected alert text: ' + actualAlertText)
}

// Accept the alert
WebUI.acceptAlert()


// Wait for alert
WebUI.waitForAlert(20)

// Get and print alert text
String actualAlertText001 = WebUI.getAlertText()

println('Alert Text: ' + actualAlertText001)

// Expected texts
String expectedAlertText001 = 'Successfully Deleted.   Part # - TestingAutomation'

// Compare and verify
if (actualAlertText001 == expectedAlertText001) {
	WebUI.verifyMatch(actualAlertText001, expectedAlertText001, false)
} else {
	println('Alert text does not match any expected value.')

	KeywordUtil.markWarning('Unexpected alert text: ' + actualAlertText001)
}

// Accept the alert
WebUI.acceptAlert()
