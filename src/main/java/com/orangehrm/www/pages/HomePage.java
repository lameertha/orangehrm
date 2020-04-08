package com.orangehrm.www.pages;

import com.orangehrm.www.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By contactSalesLink= By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]");
    By free30DaysTrialLink=By.xpath("//a[contains(@class,'btn-orange trial-btn pulse')]");

    public void setContactSalesLink(){
        clickOnElement(contactSalesLink);
    }
    public void setFree30DaysTrialLink(){
        clickOnElement(free30DaysTrialLink);
    }
}
