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
    private SelenideElement mainHeader = $(".main-header"), firstNameInput = $("#firstName"), lastNameInput = $("#lastName"), userEmailInput = $("#userEmail"), userNumberInput = $("#userNumber"), genterWrapper = $("#genterWrapper"), dateOfBirthInput = $("#dateOfBirthInput"), subjectsInput = $("#subjectsInput"), uploadPicture = $("#uploadPicture"), ScrollSubmit = $("#submit"), currentAddress = $("#currentAddress"), State = $("#react-select-3-input"), City = $("#react-select-4-input"), buttonSibmit = $("#submit"), resultTable = $(".table-responsive");
    public static SelenideElement setMusic = $(byText("Music"));

    //actions
    public RegistrationPage openPage() {
        open("/automation-practice-form");
        mainHeader.shouldHave(text("Practice Form"));
        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationPage setlastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setUserEmail(String userEmail) {
        userEmailInput.setValue(userEmail);
        return this;
    }

    public RegistrationPage setGender(String gender) {
        genterWrapper.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage setUserNumber(String userNumber) {
        userNumberInput.setValue(userNumber);
        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubjectsInput(String subject) {
        subjectsInput.click();
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage setUploadPicture(String picture) {
        uploadPicture.uploadFromClasspath(picture);
        return this;
    }

    public RegistrationPage setScroll() {
        ScrollSubmit.scrollTo();
        return this;
    }

    public RegistrationPage setCurrentAddress(String address) {
        currentAddress.click();
        currentAddress.setValue(address);
        return this;
    }

    public RegistrationPage setState(String state) {
        State.doubleClick();
        State.setValue(state).pressEnter();
        return this;
    }

    public RegistrationPage setCity(String citiez) {
        City.doubleClick();
        City.setValue(citiez).pressEnter();
        return this;
    }

    public RegistrationPage setSubmit() {
        buttonSibmit.click();
        return this;
    }

    //Проверки
    public RegistrationPage setCheckForm(String key, String value) {
        resultTable.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }

}

