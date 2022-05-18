package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SchedulePage extends PageObject {
    public static final Target SCHEDULE_LINK = Target.the("link to schedule an appointment").located(By.xpath("//a[@href='appointmentScheduling']"));
    public static final Target DATE_INPUT = Target.the("where do we write the date of the appointment").located(By.id("datepicker"));
    public static final Target DOCUMENT_PATIENT_INPUT = Target.the("where do we write the document number of the patient").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del paciente']"));
    public static final Target DOCUMENT_DOCTOR_INPUT = Target.the("where do we write the document number of the doctor").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del doctor']"));
    public static final Target TEXTAREA_OBSERVATIONS = Target.the("where do we write the observations of the appointment").located(By.xpath("//textarea[@class='form-control']"));
    public static final Target SAVE_BUTTON = Target.the("button to save the information").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
}
