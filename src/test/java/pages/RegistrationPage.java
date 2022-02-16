package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.devtools.v85.input.Input;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationPage {
//components
    CalendarComponent calendarComponent = new CalendarComponent();


    //Locator
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");
    SelenideElement userEmailInput = $("#userEmail");
    SelenideElement userNumberInput = $("#userNumber");
    public static SelenideElement setMusic = $(byText("Music"));

//actions
public void openPage(){
    open("/automation-practice-form");
    $(".main-header").shouldHave(text("Practice Form"));
}

public void setFirstName(String firstName){
    firstNameInput.setValue(firstName);
}

public void setlastName(String lastName){
    lastNameInput.setValue(lastName);
}

public void setUserEmail(String userEmail){
    userEmailInput.setValue(userEmail);
}

public void setGender(){
    $("#genterWrapper").$(byText("Male")).click();
}

    public void setUserNumber(String userNumber) {
        userNumberInput.setValue(userNumber);
    }

    public void setBirthDate (String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
    }

    public void setSubjectsInput(){
        $("#subjectsInput").click();
        $("#subjectsInput").setValue("m").pressEnter();
    }


public void setUploadPicture(){
    $("#uploadPicture").uploadFromClasspath("1.jpg");
}
    public void setScroll(){
        $("#submit").scrollTo();

    }
    public void setCurrentAddress(){
        $("#currentAddress").click();
        $("#currentAddress").setValue("Kazakhstan");
    }

    public void setState(){
        $("#react-select-3-input").doubleClick();
        $("#react-select-3-input").setValue("N").pressEnter();
    }
    public void setCity(){
        $("#react-select-4-input").doubleClick();
        $("#react-select-4-input").setValue("D").pressEnter();
    }
    public void setSubmit(){
        $("#submit").click();
    }

//Проверки
    public void setCheckForm(){
        $(".table-responsive").shouldHave(text("Artem Krivoshein"),
                text("krivo6ein@gmail.com"), text("Male"), text("7078499942"), text("08 March,2022"),
                text("Maths"), text("Music"), text("1.jpg"), text("Kazakhstan"), text("NCR Delhi"));
    }


}

