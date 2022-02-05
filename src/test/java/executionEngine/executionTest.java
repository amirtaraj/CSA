package executionEngine;

import ExcelUtility.ReadExcelSheet;
import junit.framework.TestCase;
import keywordDriven.ActionKeywords;

public class executionTest extends TestCase{
    public static void main(String[] args) {
        try {
            ReadExcelSheet rs = new ReadExcelSheet();
            rs.readExcelData(4);
            ActionKeywords ak = new ActionKeywords();
            ak.openBrowser();
            ak.navigate();
            ak.enterEmail();
            ak.enterPassword();
            ak.clickSignIn();
            ak.gotoAccountPage();
            Thread.sleep(5000); //for demo
            ak.newAccountCreate();
            Thread.sleep(5000); //for demo
            //ak.logout();
            ak.closeBrowser();
            System.out.println("Test executed successfully");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
