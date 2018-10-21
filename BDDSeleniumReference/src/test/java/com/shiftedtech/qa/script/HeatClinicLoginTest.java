package com.shiftedtech.qa.script;

import com.shiftedtech.qa.framework.HeatclinicScriptBase;
import org.junit.Test;

/**
 * Created by masihur on 7/2/17.
 */
public class HeatClinicLoginTest extends HeatclinicScriptBase{

    @Test
    public void validUserValidPassword01(){
        System.out.println("********* Test - validUserValidPassword ************");
        homePage().navigateToLoginPage();
        loginPage().login("iivaan@shiftedtech.com","shiftedtech");
        homePage().verifyMyAccountName("Iftekhar");
    }

    @Test
    public void validUserValidPassword02(){
        System.out.println("********* Test - validUserValidPassword ************");
        homePage().navigateToLoginPage();
        loginPage().login("mah123bub@gmail.com","mahbub123");
        homePage().verifyMyAccountName("Mahbub");
    }
}
