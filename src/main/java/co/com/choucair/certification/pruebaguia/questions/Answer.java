package co.com.choucair.certification.pruebaguia.questions;

import co.com.choucair.certification.pruebaguia.userinterface.InformationUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer (String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameMessage = Text.of(InformationUser.NAME_MESSAGE).viewedBy(actor).asString();
        if (question.equals(nameMessage)){
            result = true;
        }else {
            result = false;
        }
        System.out.println(nameMessage);
        return result;
    }
}
