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

Mobile.tap(findTestObject('Home/List View/View Icon'), 0)

for (int i = 0; i < Products.size(); i++) {
    switch (Products[i]) {
        case 'Backpack':
            Mobile.tap(findTestObject('Home/List View/Add To Chart/Backpack'), 0)

            break
        case 'Light':
            Mobile.tap(findTestObject('Home/List View/Add To Chart/Light'), 0)

            break
        case 'Bolt':
            Mobile.tap(findTestObject('Home/List View/Add To Chart/Bolt'), 0)

            break
        case 'Fleece':
            Mobile.tap(findTestObject('Home/List View/Add To Chart/Fleece'), 0)

            break
        case 'Onesie':
            Mobile.scrollToText('All Rights')

            Mobile.scrollToText('2022')

            Mobile.tap(findTestObject('Home/List View/Add To Chart/Onesie'), 0)

            break
        case 'Red':
            Mobile.scrollToText('All Rights')

            Mobile.tap(findTestObject('Home/List View/Add To Chart/Red'), 0)

            break
    }
}

