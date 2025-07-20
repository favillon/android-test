package testing.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import testing.ui.HomePage;

public class LogoutOption {
    public static Question<String> is() {

        return actor -> Text.of(HomePage.DASHBOARD_TEXT_LOGOUT).answeredBy(actor);
    }
}
