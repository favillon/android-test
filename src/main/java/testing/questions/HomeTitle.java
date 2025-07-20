package testing.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import testing.ui.HomePage;

public class HomeTitle {
    public static Question<String> is() {
        return actor -> Text.of(HomePage.HOME_TITLE).answeredBy(actor);
    }
}
