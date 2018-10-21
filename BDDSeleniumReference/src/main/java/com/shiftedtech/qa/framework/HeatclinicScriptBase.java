package com.shiftedtech.qa.framework;

import com.shiftedtech.qa.framework.pages.HeatClinicHomePage;
import com.shiftedtech.qa.framework.pages.HeatClinicLoginPage;

/**
 * Created by masihur on 7/2/17.
 */
public class HeatclinicScriptBase extends ScriptBase {
    private HeatClinicHomePage homePage = null;
    private HeatClinicLoginPage loginPage = null;

    public HeatClinicHomePage homePage() {
        if(homePage == null){
            homePage = new HeatClinicHomePage(getDriver());
        }
        return homePage;
    }

    public HeatClinicLoginPage loginPage() {
        if(loginPage == null){
            loginPage = new HeatClinicLoginPage(getDriver());
        }
        return loginPage;
    }
}
