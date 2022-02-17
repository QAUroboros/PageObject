package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


public class RegistrationFormWithPageObjectsTests {

    RegistrationPage registrationPage = new RegistrationPage();
    String firstName = "Artem";
    String lastName = "Krivoshein";
    String userEmail = "krivo6ein@gmail.com";
    String gender = "Male";
    String userNumber = "7078499942";
    String day = "30";
    String month = "July";
    String year = "2012";
    String subject = "Maths";
    String hobbies = "Music";
    String picture = "1.jpg";
    String address = "Kazakhstan";
    String state = "NCR";
    String citiez = "Delhi";

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1980x1080";
        Configuration.holdBrowserOpen = true;
    }


    @Test
    void testForm() {
        registrationPage.openPage();
        registrationPage.setFirstName(firstName);
        registrationPage.setlastName(lastName);
        registrationPage.setUserEmail(userEmail);
        registrationPage.setGender(gender);
        registrationPage.setUserNumber(userNumber);
        registrationPage.setBirthDate(day, month, year);
        registrationPage.setSubjectsInput(subject);
        registrationPage.setMusic.click();
        registrationPage.setUploadPicture(picture);
        registrationPage.setScroll();
        registrationPage.setCurrentAddress(address);
        registrationPage.setState(state);
        registrationPage.setCity(citiez);
        registrationPage.setSubmit();

        //проверка значений
        registrationPage.setCheckForm("Student Name", firstName + lastName);
        registrationPage.setCheckForm("Student Email", userEmail);
        registrationPage.setCheckForm("Gender", gender);
        registrationPage.setCheckForm("Mobile", userNumber);
        registrationPage.setCheckForm("Date of Birth", day + month + year);
        registrationPage.setCheckForm("Subjects", subject);
        registrationPage.setCheckForm("Hobbies", hobbies);
        registrationPage.setCheckForm("Picture", picture);
        registrationPage.setCheckForm("Address", address);
        registrationPage.setCheckForm("State and City", state + citiez);


    }

}