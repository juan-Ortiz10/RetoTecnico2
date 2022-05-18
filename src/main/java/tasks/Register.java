package tasks;

import model.Persona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import userinterface.DoctorPage;
import userinterface.PatientPage;

import java.util.List;

public class Register implements Task {

    private List<Persona> personas;

    public Register(List<Persona> personas) {
        this.personas = personas;
    }

    public static Register newPersonWithThe(List<Persona> data) {
        return Tasks.instrumented(Register.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(personas.get(0).getTipo().equals("Doctor"))
                .andIfSo(Click.on(DoctorPage.DOCTOR_LINK),
                        Enter.theValue(personas.get(0).getNombre()).into(DoctorPage.NAME_INPUT),
                        Enter.theValue(personas.get(0).getApellidos()).into(DoctorPage.LAST_NAME_INPUT),
                        Enter.theValue(personas.get(0).getTelefono()).into(DoctorPage.NUMBER_INPUT),
                        SelectFromOptions.byVisibleText(personas.get(0).getTipoDocumento()).from(DoctorPage.DOCUMENT_TYPE_SELECT),
                        Enter.theValue(personas.get(0).getNumeroDocumento()).into(DoctorPage.DOCUMENT_INPUT),
                        Click.on(DoctorPage.SAVE_BUTTON))
                .otherwise(Click.on(PatientPage.PACIENT_LINK),
                        Enter.theValue(personas.get(0).getNombre()).into(PatientPage.NAME_INPUT),
                        Enter.theValue(personas.get(0).getApellidos()).into(PatientPage.LAST_NAME_INPUT),
                        Enter.theValue(personas.get(0).getTelefono()).into(PatientPage.NUMBER_INPUT),
                        SelectFromOptions.byVisibleText(personas.get(0).getTipoDocumento()).from(PatientPage.DOCUMENT_TYPE_SELECT),
                        Enter.theValue(personas.get(0).getNumeroDocumento()).into(PatientPage.DOCUMENT_INPUT),
                        Click.on(PatientPage.MEDICINE_CHECK),
                        Click.on(PatientPage.SAVE_BUTTON)));
    }
}
