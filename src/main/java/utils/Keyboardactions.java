package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


/**
 * Presses Down Arrow and Enter key after clicking the element.
 */
public class Keyboardactions {
    public static void pressDownArrowAndEnter(WebDriver driver, WebElement element) {
        element.click();
        new Actions(driver)
            .sendKeys(Keys.ARROW_DOWN)
            .sendKeys(Keys.ENTER)
            .perform();
    }  
        
        // Using CTRL+A + DELETE
    /**
     * Clears text in an input field using CTRL+A + DELETE keys.
     */
    public static void clearText(WebElement element) {
        element.click();  
        element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        element.sendKeys(Keys.DELETE);
        
        
    }
     
}

