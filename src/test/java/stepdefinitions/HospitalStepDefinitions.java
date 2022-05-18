package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.Cita;
import model.Persona;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Check;
import tasks.OpenUp;
import tasks.Register;
import tasks.Schedule;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class HospitalStepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que Carlos necesita registrar un nuevo doctor$")
    public void queCarlosNecesitaRegistrarUnNuevoDoctor(){
        theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @Dado("^que Carlos necesita registrar un nuevo paciente$")
    public void queCarlosNecesitaRegistrarUnNuevoPaciente() {
        theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @Cuando("^el realiza el registro del mismo en el aplicativo de Administracion de Hospitales$")
    public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministracionDeHospitales(List<Persona> data){
        theActorInTheSpotlight().attemptsTo(Register.newPersonWithThe(data));
    }

    @Entonces("^el verifica que se presente en pantalla el mensaje (.*)$")
    public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(String message){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Check.saveSuccess(message)));
    }

    @Dado("^que Carlos necesita asistir al medico$")
    public void queCarlosNecesitaAsistirAlMedico(){
        theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @Cuando("^el realiza el agendamiento de una Cita$")
    public void elRealizaElAgendamientoDeUnaCita(List<Cita> data){
        theActorInTheSpotlight().attemptsTo(Schedule.anAppointment(data));
    }
}
