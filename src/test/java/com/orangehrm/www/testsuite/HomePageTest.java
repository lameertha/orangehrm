package com.orangehrm.www.testsuite;

import com.orangehrm.www.pages.HomePage;
import com.orangehrm.www.testbase.TestBase;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage=new HomePage();
    @Test
    public void verifyUserCanNavigateToContactSalesPage(){
        homePage.setContactSalesLink();
    }
    @Test
    public void verifyUserCanNavigateToFree30DaysTrialPage(){
        homePage.setFree30DaysTrialLink();
    }
}
