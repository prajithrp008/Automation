package Saucetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Sauce.Saucedemo;
import Saucepath.Saucepath1;

import java.io.IOException;

public class Saucetest1 extends Saucedemo {

    @Test
    public void testRegistrationAndHover() throws InterruptedException, IOException {
        Saucepath1 registrationPage = new Saucepath1(driver);

        // Step 1: Click the "Sign Up" button
        registrationPage.clickSignup();
        Thread.sleep(2000); // Wait for registration form to load

        // Step 2: Fill out the registration form
        String name = "John Doe";
        String email = "hjrp00ah7777777gagagart55ajh@example.com";
        String password = "securepassword123";

        registrationPage.enterDetails(name, email, password);
        Thread.sleep(1000); // Optional wait to visually verify

        // Step 3: Submit the registration form
        registrationPage.submitForm();
        Thread.sleep(3000); // Wait for navigation or confirmation

        // Step 4: Click the "Start using ilovepdf" button
        registrationPage.clickStartButton();
        Thread.sleep(2000); // Wait for the next page to load

        // Step 5: Hover over "All PDF Tools"
        registrationPage.hoverOverAllPDFTools();
        Thread.sleep(2000); // Wait to see hover effect (optional)

        registrationPage.hoverOverCONVERTPDF();
        Thread.sleep(2000);

        // Step 6: Click the "Compress PDF" button
        registrationPage.compress();
        Thread.sleep(2000); // Wait for the Compress page to load

        // Step 7: Upload the file
        String filePath = "D:\\groot.pdf"; // Path to the PDF file
        registrationPage.uploadPdf(filePath);
        Thread.sleep(5000); // Wait to see the upload in progress

        // Handle the popup if it appears
        try {
            WebElement popupCloseButton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
            popupCloseButton.click(); // Close the popup
            Thread.sleep(1000); // Allow the UI to stabilize
        } catch (Exception e) {
            System.out.println("Popup not detected or already dismissed.");
        }

        // Step 8: Wait before clicking the "Compress PDF" button
        Thread.sleep(5000); // Ensure the file is fully uploaded and UI updates

        // Compress the file
        registrationPage.compresstp();
        Thread.sleep(5000); // Wait for the compression to complete (ensure compression process is finished)
        
        // Download the compressed file
        registrationPage.dowCom();
        Thread.sleep(2000);

        // Step 9: Click the "Split" button
        registrationPage.clickSplit();
        Thread.sleep(2000); // Wait for the Split page to load

        // Step 10: Automatically select the PDF file for splitting
        registrationPage.selectSplitPdfFile();
        Thread.sleep(2000); // Wait for the PDF to be selected

        // Step 11: Trigger the split process
        registrationPage.triggerSplit();
        Thread.sleep(5000); // Wait for the split process to complete
        
        // Download the split file
        registrationPage.dowspl();
        Thread.sleep(2000);
        
        // Step 12: Click the "Merge" button
        registrationPage.mergeee();
        Thread.sleep(2000); // Wait for the Merge page to load

        // Step 13: Select files for merging
        registrationPage.selectMergePdfFile();  // Make sure you select a PDF to merge
        Thread.sleep(2000); // Wait for the file selection

        // Step 14: Trigger the merge process (this step was missing previously)
        WebElement mergeButton = driver.findElement(By.xpath("//*[@id=\"processTask\"]"));
        mergeButton.click();
        Thread.sleep(5000); // Wait for the merging process to complete
    }
}
