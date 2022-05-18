package tasks;

import model.Cita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SchedulePage;

import java.util.List;

public class Schedule implements Task {

    private List<Cita> citas;

    public Schedule(List<Cita> citas) {
        this.citas = citas;
    }

    public static Schedule anAppointment(List<Cita> data) {
        return Tasks.instrumented(Schedule.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SchedulePage.SCHEDULE_LINK),
                Enter.theValue(citas.get(0).getDiaCita()).into(SchedulePage.DATE_INPUT),
                Enter.theValue(citas.get(0).getDocumentoPaciente()).into(SchedulePage.DOCUMENT_PATIENT_INPUT),
                Enter.theValue(citas.get(0).getDocumentoDoctor()).into(SchedulePage.DOCUMENT_DOCTOR_INPUT),
                Enter.theValue(citas.get(0).getObservaciones()).into(SchedulePage.TEXTAREA_OBSERVATIONS),
                Click.on(SchedulePage.SAVE_BUTTON));
    }
}
