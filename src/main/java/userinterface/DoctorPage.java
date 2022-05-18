package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DoctorPage extends PageObject {
    public static final Target DOCTOR_LINK = Target.the("link to create a doctor").located(By.xpath("//a[@href='addDoctor']"));
    public static final Target NAME_INPUT = Target.the("where do we write the name of the doctor").located(By.id("name"));
    public static final Target LAST_NAME_INPUT = Target.the("where do we write the last name of the doctor").located(By.id("last_name"));
    public static final Target NUMBER_INPUT = Target.the("where do we write the phone of the doctor").located(By.id("telephone"));
    public static final Target DOCUMENT_TYPE_SELECT = Target.the("where do we select the type of the document of the doctor").located(By.id("identification_type"));
    public static final Target DOCUMENT_INPUT = Target.the("where do we write the document of the doctor").located(By.id("identification"));
    public static final Target SAVE_BUTTON = Target.the("button to save the information").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
}
