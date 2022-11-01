package co.com.choucair.certification.pruebaguia.tasks;

import co.com.choucair.certification.pruebaguia.userinterface.RegisterUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegisterUser implements Task {
    public static RegisterUser onThePage() {
        return Tasks.instrumented(RegisterUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterUtest.REGISTER_BUTTON));

    }
}
