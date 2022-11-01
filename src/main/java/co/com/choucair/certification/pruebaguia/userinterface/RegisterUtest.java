package co.com.choucair.certification.pruebaguia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUtest extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("the button 'JOIN TODAY' is used create new user").located(By.className("unauthenticated-nav-bar__sign-up"));
}
