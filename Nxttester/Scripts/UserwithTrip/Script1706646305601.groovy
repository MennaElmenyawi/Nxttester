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

WebUI.navigateToUrl('https://qa-test-frontend-ce07bae316f3.herokuapp.com/')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Login  AWS/input_username'), 'nxttester')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  AWS/input_password'), 'kGBW32XHImoBdT1NVdO8Jg==')

WebUI.click(findTestObject('Object Repository/Page_Login  AWS/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Login  AWS/button_Skip (only for testing)'))

WebUI.click(findTestObject('Object Repository/Page_Events  AWS/div_Set Later Event 28-01-2024 162336'))

WebUI.click(findTestObject('Object Repository/Page_Home  AWS/div_Registration'))

WebUI.click(findTestObject('Object Repository/Page_Home  AWS/a_Attendees'))

WebUI.click(findTestObject('Object Repository/Page_Users  AWS/div_All Users'))

WebUI.click(findTestObject('Object Repository/Page_All Users - Users  AWS/span_Add User'))

WebUI.setText(findTestObject('Object Repository/Page_Create User - Users  AWS/input_firstName'), 'demo')

WebUI.setText(findTestObject('Object Repository/Page_Create User - Users  AWS/input_lastName'), 'demo')

WebUI.setText(findTestObject('Object Repository/Page_Create User - Users  AWS/input_title'), 'demo')

WebUI.click(findTestObject('Object Repository/Page_Create User - Users  AWS/div_First NameLast NameTitleOrganizationCon_36d33f'))

WebUI.setText(findTestObject('Object Repository/Page_Create User - Users  AWS/input_organization'), 'demo')

WebUI.setText(findTestObject('Object Repository/Page_Create User - Users  AWS/input_Input_root__fi0ZK'), '1245789632')

WebUI.setText(findTestObject('Object Repository/Page_Create User - Users  AWS/input_email'), 'demo@gmail.com')
WebUI.scrollToPosition(24, 25)

WebUI.click(findTestObject('Object Repository/Page_Create User - Users  AWS/button_Create'))

WebUI.click(findTestObject('Object Repository/Page_demo demo - Users  AWS/a_Attendees'))

WebUI.click(findTestObject('Object Repository/Page_Users  AWS/div_All Users'))

WebUI.click(findTestObject('Object Repository/Page_All Users - Users  AWS/span_Add Trip'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Trip - Users  AWS/select_Select an option.sss'), 
    'sss', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Trip - Users  AWS/select_Select an option.ffffffee'), 
    'ffff', true)

WebUI.click(findTestObject('Object Repository/Page_Create Trip - Users  AWS/div_SessionsVenueYou must have an entity to_863924'))
WebUI.scrollToPosition(24, 25)


WebUI.click(findTestObject('Object Repository/Page_Create Trip - Users  AWS/button_Create'))

WebUI.click(findTestObject('Object Repository/Page_All Users - Users  AWS/span_nxttester'))

WebUI.click(findTestObject('Object Repository/Page_All Users - Users  AWS/p_Logout'))

WebUI.closeBrowser()

