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

WebUI.callTestCase(findTestCase('Common_TCs/Launch_Application'), [('appURL') : GlobalVariable.APPLICATION_URL], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test_Modules/Login/Common/Login'), [('userName') : 'John Doe', ('passWord') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test_Modules/MakeAppointment/Common/MakeAppointment'), [('facility') : facility, ('program') : program
        , ('re_Admission') : re_Admission, ('visit_Date') : visit_date, ('comment') : comment], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/MakeAppointment/h2_Appointment Confirmation'), GlobalVariable.WAIT_GLOBAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/MakeAppointment/h2_Appointment Confirmation'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/MakeAppointment/p_Facility'), facility)

WebUI.verifyElementText(findTestObject('Object Repository/MakeAppointment/p_Readmission'), re_Admission)

WebUI.verifyElementText(findTestObject('Object Repository/MakeAppointment/p_Program'), program)

WebUI.verifyElementText(findTestObject('Object Repository/MakeAppointment/p_VisitDate'), visit_date)

WebUI.verifyElementText(findTestObject('Object Repository/MakeAppointment/p_Comment'), comment)

WebUI.click(findTestObject('Object Repository/MakeAppointment/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/MakeAppointment/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/MakeAppointment/a_History'))

WebUI.waitForElementVisible(findTestObject('Object Repository/MakeAppointment/p_Facility'), GlobalVariable.WAIT_GLOBAL)

WebUI.verifyElementText(findTestObject('Object Repository/MakeAppointment/p_Facility'), facility)

WebUI.verifyElementText(findTestObject('Object Repository/MakeAppointment/p_Readmission'), re_Admission)

WebUI.verifyElementText(findTestObject('Object Repository/MakeAppointment/p_Program'), program)

WebUI.verifyElementText(findTestObject('Object Repository/MakeAppointment/p_Comment'), comment)

WebUI.closeBrowser()

