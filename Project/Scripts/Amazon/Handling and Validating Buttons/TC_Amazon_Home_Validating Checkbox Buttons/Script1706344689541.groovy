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

WebUI.openBrowser('')


WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Amazon_Page_OR/Validating Buttons/Validating Checbox/Page_Amazon.com. Spend less. Smile more/searchDropdown'), 'Books', false)

WebUI.setText(findTestObject('Object Repository/Amazon_Page_OR/Validating Buttons/Validating Checbox/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 'Da Vinci Code')

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Validating Buttons/Validating Checbox/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))
unchecked = WebUI.verifyElementNotChecked(findTestObject('Object Repository/Amazon_Page_OR/Validating Buttons/Validating Checbox/Page_Amazon.com  da vinci code/span_Kindle Unlimited Eligible')
,10)

if (unchecked == true) {

	System.out.println("element not checked")
	
	WebUI.check(findTestObject('Object Repository/Amazon_Page_OR/Validating Buttons/Validating Checbox/Page_Amazon.com  da vinci code/span_Kindle Unlimited Eligible'))
	WebUI.delay(5)
	
	System.out.println("element checked")

}

WebUI.delay(3)

WebUI.closeBrowser()








