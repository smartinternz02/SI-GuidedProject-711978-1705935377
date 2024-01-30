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

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Page_Amazon.com. Spend less. Smile more/a_Your Account'))

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Page_Your Account/span_Hello, sign in'))

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Page_Amazon Sign-In/a_Create your Amazon account'))

WebUI.setText(findTestObject('Object Repository/Amazon_Page_OR/Page_Amazon Registration/input_customerName'), 'Anushka')

WebUI.setText(findTestObject('Object Repository/Amazon_Page_OR/Page_Amazon Registration/input_email'), 'as9406@srmist.edu.in')

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Page_OR/Page_Amazon Registration/input_password'), '8ZgfNRUUPmQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Page_OR/Page_Amazon Registration/input_passwordCheck'), 
    '8ZgfNRUUPmQ=')

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Page_Amazon Registration/inputcontinue'))

WebUI.setText(findTestObject('Object Repository/Amazon_Page_OR/Page_Authentication required/input_code'), '620235')

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Page_Authentication required/input_a-button-input'))

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Page_Authentication required/span_US 1'))

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Page_Authentication required/a_India 91'))

WebUI.setText(findTestObject('Object Repository/Amazon_Page_OR/Page_Authentication required/input_cvf_phone_num'), '9871429420')

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Page_Authentication required/input_cvf_action'))

WebUI.setText(findTestObject('Object Repository/Amazon_Page_OR/Page_Authentication required/input_code_1'), '746783')

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Page_Authentication required/input_cvf_action'))

WebUI.closeBrowser()

