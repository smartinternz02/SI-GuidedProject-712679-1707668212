package com.katalon.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.testobject.TestObject;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI;

public class KeywordElement {
    
    @Keyword
    public boolean CheckDropElementKatalon(TestObject object, String option) {
        boolean flag = false;
        WebElement element = WebUI.findWebElement(object);
        
        Select ddl = new Select(element);
        
        for (WebElement ele : ddl.getOptions()) {
            if (ele.getText().equals(option)) {
                System.out.println("Element exists");
                flag = true;
                break; // Once found, no need to continue the loop
            } else {
                System.out.println("Element does not exist");
            }
        }
        return flag;
    }
}
