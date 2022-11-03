package co.com.choucair.certification.pruebaguia.tasks;

import co.com.choucair.certification.pruebaguia.userinterface.InformationUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;


public class FormInformation implements Task {
    public static FormInformation onThePage() {
        return Tasks.instrumented(FormInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Maria").into(InformationUser.INPUT_FIRSTNAME),
                Enter.theValue("Rodriguez").into(InformationUser.INPUT_LASTNAME),
                Enter.theValue("sasazes@hotmail.com").into(InformationUser.INPUT_EMAIL),
                Click.on(InformationUser.INPUT_MONTH),
                Click.on(InformationUser.INPUT_MONTHOPTION),
                Click.on(InformationUser.INPUT_DAY),
                Click.on(InformationUser.INPUT_DAYOPTION),
                Click.on(InformationUser.INPUT_YEAR),
                Click.on(InformationUser.INPUT_YEAROPTION),
                Click.on(InformationUser.CLICK_CONTINUE),
                Enter.theValue("Neiva").into(InformationUser.INPUT_CITY),
                SendKeys.of(Keys.ARROW_DOWN).into(InformationUser.INPUT_CITY),
                SendKeys.of(Keys.ENTER).into(InformationUser.INPUT_CITY),
                Enter.theValue("057").into(InformationUser.INPUT_POSTAL),
                Click.on(InformationUser.CLICK_CONTINUEB),
                Click.on(InformationUser.INPUT_DEVICE),
                SendKeys.of("Xiaomi").into(InformationUser.INPUT_DEVICEB),
                SendKeys.of(Keys.ENTER).into(InformationUser.INPUT_DEVICEB),
                Click.on(InformationUser.INPUT_MODEL),
                SendKeys.of("Redmi Note 8").into(InformationUser.INPUT_MODELB),
                SendKeys.of(Keys.ENTER).into(InformationUser.INPUT_MODELB),
                Click.on(InformationUser.INPUT_SO),
                SendKeys.of("Android 11").into(InformationUser.INPUT_SOB),
                SendKeys.of(Keys.ENTER).into(InformationUser.INPUT_SOB),
                Click.on(InformationUser.CLICK_CONTINUEC),
                Enter.theValue("hDH*&75ENl22").into(InformationUser.INPUT_PASSWORD),
                Enter.theValue("hDH*&75ENl22").into(InformationUser.INPUT_CONFIRMPASSWORD),
                Click.on(InformationUser.CHECKOUT_CONSENT),
                Click.on(InformationUser.CHECKOUT_CONSENTB),
                Click.on(InformationUser.CHECKOUT_CONSENTC),
                Click.on(InformationUser.CLICK_COMPLETE)
        );


    }
}
