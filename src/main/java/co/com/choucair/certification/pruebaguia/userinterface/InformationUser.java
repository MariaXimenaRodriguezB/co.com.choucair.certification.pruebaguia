package co.com.choucair.certification.pruebaguia.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InformationUser extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("Input First Name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Input Lastname").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Input Email").located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("Input Date of birth / Month").located(By.id("birthMonth"));
    public static final Target INPUT_MONTHOPTION = Target.the("Input Date of birth / MonthOption").located(By.xpath("(//option[@label=\"March\"])"));
    public static final Target INPUT_DAY= Target.the("Input Date of birth / Day").located(By.id("birthDay"));
    public static final Target INPUT_DAYOPTION = Target.the("Input Date of birth / DayOption").located(By.xpath("(//option[@label=\"13\"])"));
    public static final Target INPUT_YEAR = Target.the("Input Date of birth / Year").located(By.id("birthYear"));
    public static final Target INPUT_YEAROPTION = Target.the("Input Date of birth / YearOption").located(By.xpath("(//option[@label=\"1996\"])"));
    public static final Target CLICK_CONTINUE = Target.the("Button Continue").located(By.xpath("(//i[@class=\"material-icons\"])"));
    public static final Target INPUT_CITY = Target.the("Input City").located(By.id("city"));
    public static final Target INPUT_POSTAL = Target.the("Input Postal").located(By.id("zip"));
    public static final Target CLICK_CONTINUEB = Target.the("Button Continue").located(By.xpath("(//a[@class=\"btn btn-blue pull-right\"])"));
    public static final Target INPUT_DEVICE = Target.the("Input Device").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]"));
    public static final Target INPUT_DEVICEB = Target.the("Input DeviceOptions").located(By.xpath("(//input[@placeholder=\"Select Brand\"])"));
    public static final Target INPUT_MODEL = Target.the("Input Model").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]"));
    public static final Target INPUT_MODELB = Target.the("Input ModelOptions").located(By.xpath("(//input[@placeholder=\"Select a Model\"])"));
    public static final Target INPUT_SO = Target.the("Input SO").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]"));
    public static final Target INPUT_SOB = Target.the("Input SOoptions").located(By.xpath("(//input[@placeholder=\"Select OS\"])[2]"));
    public static final Target CLICK_CONTINUEC = Target.the("Button Continue").located(By.xpath("(//a[@class=\"btn btn-blue pull-right\"])"));
    public static final Target INPUT_PASSWORD = Target.the("Input password").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Input confirmpassword").located(By.id("confirmPassword"));
    public static final Target CHECKOUT_CONSENT = Target.the("Button Continue").located(By.xpath("(//span[@class=\"checkmark signup-consent__checkbox signup-consent__checkbox--highlight\"])[1]"));
    public static final Target CHECKOUT_CONSENTB = Target.the("Button Continue").located(By.xpath("(//span[@class=\"checkmark signup-consent__checkbox error\"])[1]"));
    public static final Target CHECKOUT_CONSENTC = Target.the("Button Continue").located(By.xpath("(//span[@class=\"checkmark signup-consent__checkbox error\"])"));
    public static final Target CLICK_COMPLETE = Target.the("Button Complete").located(By.id("laddaBtn"));
    //public static final Target NAME_MESSAGE = Target.the("Message create new user").located(By.xpath("(//h1[contains(text(),\"Welcome to the world's largest community of freelance software testers!\")]);");
    public static final Target NAME_MESSAGE = Target.the("Message create new user").located(By.xpath("(//h1[contains(text(),\"Welcome to the world's largest community of freelance software testers!\")])"));

}



