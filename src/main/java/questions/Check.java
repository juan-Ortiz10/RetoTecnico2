package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.PatientPage;

public class Check implements Question<Boolean> {

    private String caption;

    public Check(String caption) {
        this.caption = caption;
    }

    public static Check saveSuccess(String message) {
        return new Check(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(PatientPage.CAPTION).viewedBy(actor).asString().equals(caption);
    }
}
