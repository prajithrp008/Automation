


package Saucepath;

import java.io.IOException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Saucepath1 {
    WebDriver driver;

    // Locators for Registration Page
    @FindBy(xpath = "/html/body/header/nav/div[2]/a[3]") // "Sign Up" button
    WebElement signupButton;

    @FindBy(xpath = "//*[@id=\"name\"]") // Name input field
    WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"signupEmail\"]") // Email input field
    WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"password\"]") // Password input field
    WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"registerButton\"]") // Submit button
    WebElement submitButton;

    @FindBy(xpath = "/html/body/div/div/div/div/a[2]") // "Start using ilovepdf" button
    WebElement startButton;

    @FindBy(xpath = "/html/body/header/nav/div[1]/ul[2]/li/span") // Mouse hover to "All PDF Tools"
    WebElement mousehover1;

    @FindBy(xpath = "/html/body/header/nav/div[1]/ul[1]/li[4]/span") // Mouse hover to "Convert PDF"
    WebElement mousehover2;

    @FindBy(xpath = "/html/body/header/nav/div[1]/ul[1]/li[3]/a") // Compress PDF button
    WebElement compressPdfButton;

    @FindBy(xpath = "//*[@id=\"pickfiles\"]") // Select PDF file button (input element)
    WebElement selectPdfInput;

    @FindBy(xpath = "//*[@id=\"processTaskTextBtn\"]") // Compress selected PDF button
    WebElement compressss;

    @FindBy(xpath = "//*[@id=\"pickfiles\"]") // Download compress
    WebElement downloadcom;

    @FindBy(xpath = "/html/body/header/nav/div[1]/ul[1]/li[2]/a") // Split PDF button
    WebElement splitButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[4]/a/span") // Select PDF file for splitting
    WebElement selectSplitPdfFile;

    @FindBy(xpath = "//*[@id=\"processTask\"]") // Split the selected PDF file
    WebElement splitted;

    @FindBy(xpath = "//*[@id=\"pickfiles\"]") // Download split PDF file
    WebElement downloadsplit;

    @FindBy(xpath = "/html/body/header/nav/div[1]/ul[1]/li[1]/a") // Merge PDF button
    WebElement merge;

    @FindBy(xpath = "//*[@id=\"pickfiles\"]") // Select PDF file for merge
    WebElement selmer;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/div/a/svg") // Add one more file
    WebElement Add;

    public Saucepath1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to click the Sign-Up button on the home page
    public void clickSignup() {
        signupButton.click();
    }

    // Method to enter user details
    public void enterDetails(String name, String email, String password) {
        nameInput.clear();
        nameInput.sendKeys(name);

        emailInput.clear();
        emailInput.sendKeys(email);

        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    // Method to submit the form
    public void submitForm() {
        submitButton.click();
    }

    // Method to click the "Start using ilovepdf" button
    public void clickStartButton() {
        startButton.click();
    }

    // Method to hover over "All PDF Tools"
    public void hoverOverAllPDFTools() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mousehover1).perform();
    }

    // Method to hover over "Convert PDF"
    public void hoverOverCONVERTPDF() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mousehover2).perform();
    }

    // Method to click "Compress PDF"
    public void compress() {
        compressPdfButton.click();
    }

    // Method to upload the file
    public void uploadPdf(String filePath) {
        try {
            WebElement fileUploadInput = driver.findElement(By.xpath("//input[@type='file']"));
            fileUploadInput.sendKeys(filePath);
            System.out.println("File uploaded successfully: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File upload failed: " + e.getMessage());
        }
    }

    // Scroll to make the element visible
    public void scrollToCompressButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", compressss);
        try {
            Thread.sleep(500); // Optional delay to stabilize UI
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Wait for the button to be clickable
    public void waitForCompressButtonToBeClickable() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(compressss));
    }

    // Force click using JavaScript if needed
    public void forceClickCompressButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", compressss);
    }

    // Enhanced method to handle compress click
    public void compresstp() {
        try {
            scrollToCompressButton();
            waitForCompressButtonToBeClickable();
            forceClickCompressButton();
            System.out.println("Compress button clicked successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to click compress button: " + e.getMessage());
        }
    }

    public void dowCom() {
        downloadcom.click();
    }

    // Split PDF
    public void clickSplit() {
        splitButton.click();
    }

    // Automatically select PDF file for splitting
    public void selectSplitPdfFile() {
        try {
            WebElement fileUploadInput = driver.findElement(By.xpath("//input[@type='file']")); // Locate file input element
            String filePath = "D:\\groot.pdf"; // Define the file path
            fileUploadInput.sendKeys(filePath); // Upload the file
            System.out.println("PDF file selected for splitting: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to upload PDF file for splitting: " + e.getMessage());
        }
    }

    // Trigger the split process
    public void triggerSplit() {
        try {
            WebElement splitButton = driver.findElement(By.xpath("//*[@id='processTask']")); // Split button
            splitButton.click(); // Click the split button to start the process
            System.out.println("PDF split started.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to start the split process: " + e.getMessage());
        }
    }

    public void dowspl() {
        downloadsplit.click();
    }

    // Merge PDF
    public void mergeee() {
        merge.click();
    }

    // Select PDF file for merging
    public void selectMergePdfFile() {
        try {
            WebElement fileUploadInput = driver.findElement(By.xpath("//input[@type='file']")); // Locate file input element
            String filePath = "D:\\groot.pdf"; // Define the file path
            fileUploadInput.sendKeys(filePath); // Upload the file
            System.out.println("PDF file selected for merging: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to upload PDF file for merging: " + e.getMessage());
        }
    }

    // Method to click "Add one more file" and select a PDF file
    public void addMoreFile(String filePath) {
        try {
            Add.click(); // Click the "Add one more file" button

            WebElement fileUploadInput = driver.findElement(By.xpath("//input[@type='file']")); // Locate file input element
            fileUploadInput.sendKeys(filePath); // Provide the file path for uploading
            System.out.println("Additional file added successfully: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to add additional file: " + e.getMessage());
        }
    }
}

