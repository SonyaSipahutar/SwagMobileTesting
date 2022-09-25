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

WebUI.callTestCase(findTestCase('Authentication/TC - Login'), [(Username) : Username, (Password) : Password], FailureHandling.OPTIONAL)

if (Mobile.verifyElementExist(findTestObject('Authentication/Login/android.view.ViewGroup (1)'), 0, FailureHandling.OPTIONAL)) {
    if (ListView == 'Yes') {
        WebUI.callTestCase(findTestCase('Home/TC - Add To Cart (List View)'), [(Products) : [Products]], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('Home/TC - Remove (List View)'), [(RemoveProduct) : [RemoveProduct]], FailureHandling.STOP_ON_FAILURE)
    } else {
        WebUI.callTestCase(findTestCase('Home/TC - Add To Cart'), [(Products) : [Products]], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('Home/TC - Remove'), [(RemoveProduct) : [RemoveProduct]], FailureHandling.STOP_ON_FAILURE)
    }
    
    if (Sort == 'Yes') {
        WebUI.callTestCase(findTestCase('Home/TC - Sorting'), [(SortType) : ''], FailureHandling.STOP_ON_FAILURE)
    }
    
    WebUI.callTestCase(findTestCase('Cart/TC - Checkout'), [(FirstName) : FirstName, (LastName) : LastName, (ZIP) : ZIP], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Authentication/TC - Logout'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementExist(findTestObject('Authentication/Login/Error Username Password'), 0, FailureHandling.STOP_ON_FAILURE)) {
    print('Username and Password Wrong')
} else if (Mobile.verifyElementExist(findTestObject('Authentication/Login/Alert'), 0, FailureHandling.STOP_ON_FAILURE)) {
    print('User is locked out')
}

