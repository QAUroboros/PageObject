package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormWithPageObjectsTests {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1980x1080";
        Configuration.holdBrowserOpen = true;
    }


    @Test
    void testForm() {
        registrationPage.openPage();
        registrationPage.setFirstName("Artem");
        registrationPage.setlastName("Krivoshein");
        registrationPage.setUserEmail("krivo6ein@gmail.com");
        registrationPage.setGender();
        registrationPage.setUserNumber("7078499942");
        registrationPage.setBirthDate ("30", "July" ,"2008");
        registrationPage.setSubjectsInput();
        registrationPage.setMusic.click();
        registrationPage.setUploadPicture();
        registrationPage.setScroll();
        registrationPage.setCurrentAddress();
        registrationPage.setState();
        sleep(500);
        registrationPage.setCity();
        registrationPage.setSubmit();


        //проверка значений
        registrationPage.setCheckForm();

    }

}