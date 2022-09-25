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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.tap(findTestObject('Object Repository/Cart/Checkout/Cart Icon'), 0)

Mobile.scrollToText('CHECKOUT')

Mobile.tap(findTestObject('Object Repository/Cart/Checkout/Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/Cart/Checkout/First Name'), FirstName, 0)

Mobile.setText(findTestObject('Object Repository/Cart/Checkout/Last Name'), LastName, 0)

Mobile.setText(findTestObject('Object Repository/Cart/Checkout/ZIP'), ZIP, 0)

Mobile.tap(findTestObject('Object Repository/Cart/Checkout/Continue'), 0)

Mobile.scrollToText('FINISH')

Mobile.tap(findTestObject('Object Repository/Cart/Checkout/Finish'), 0)

Mobile.tap(findTestObject('Object Repository/Cart/Checkout/Back Home'), 0)

