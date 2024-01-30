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
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Wishlist/Page_Amazon.com. Spend less. Smile more/input_a-button-input'))
WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_Page_OR/Wishlist/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    'search-alias=stripbooks-intl-ship', true)

WebUI.setText(findTestObject('Object Repository/Amazon_Page_OR/Wishlist/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'The book thief')

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Wishlist/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Wishlist/Page_Amazon.com  The book thief/span_The Book Thief'))

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Wishlist/Page_The Book Thief Markus Zusak 9780375842_51997c/span_Quantity1'))

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Wishlist/Page_The Book Thief Markus Zusak 9780375842_51997c/a_4'))

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Wishlist/Page_The Book Thief Markus Zusak 9780375842_51997c/input_submit.add-to-cart'))

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Wishlist/Page_Amazon.com Shopping Cart/a_Go to Cart'))

WebUI.click(findTestObject('Object Repository/Amazon_Page_OR/Wishlist/Page_Amazon.com Shopping Cart/span_Subtotal (4 items)'))
WebUI.delay(2)

WebUI.closeBrowser()

