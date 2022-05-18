package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PatientPage  extends PageObject {
        public static final Target PACIENT_LINK = Target.the("link to create a patient").located(By.xpath("//a[@href='addPatient']"));
        public static final Target NAME_INPUT = Target.the("where do we write the name of the patient").located(By.name("name"));
        public static final Target LAST_NAME_INPUT = Target.the("where do we write the last name of the patient").located(By.name("last_name"));
        public static final Target NUMBER_INPUT = Target.the("where do we write the phone of the patient").located(By.name("telephone"));
        public static final Target DOCUMENT_TYPE_SELECT = Target.the("where do we select the type of the document of the patient").located(By.name("identification_type"));
        public static final Target DOCUMENT_INPUT = Target.the("where do we write the document of the patient").located(By.name("identification"));
        public static final Target MEDICINE_CHECK = Target.the("to check if is prepaid medicine").located(By.name("prepaid"));
        public static final Target SAVE_BUTTON = Target.the("button to save the information").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
        public static final Target CAPTION = Target.the("message of created").located(By.xpath("//h3[contains(text(), 'Guardado')]"));
}
