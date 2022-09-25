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

for (int i = 0; i < RemoveProduct.size(); i++) {
    switch (RemoveProduct[i]) {
        case 'Backpack':
            Mobile.scrollToText('Backpack')

            Mobile.tap(findTestObject('Home/List View/Remove/Backpack'), 0)

            break
        case 'Light':
            Mobile.scrollToText('Backpack')

            Mobile.tap(findTestObject('Home/List View/Remove/Light'), 0)

            break
        case 'Bolt':
            Mobile.scrollToText('Fleece')

            Mobile.tap(findTestObject('Home/List View/Remove/Bolt'), 0)

            break
        case 'Fleece':
            Mobile.scrollToText('Fleece')

            Mobile.tap(findTestObject('Home/List View/Remove/Fleece'), 0)

            break
        case 'Onesie':
            Mobile.scrollToText('All Rights')

            Mobile.tap(findTestObject('Home/List View/Remove/Onesie'), 0)

            break
        case 'Red':
            Mobile.scrollToText('All Rights')

            Mobile.tap(findTestObject('Home/List View/Remove/Red'), 0)

            break
        default:
            break
    }
}

