package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageElements {

    private LoginPageElements() {
    }

    public static final Target LOGIN_TITLE = Target.the("title de login")
        .located(By.xpath("//android.widget.TextView[@text='Login']"));

    public static final Target USERNAME_INPUT = Target.the("username input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/nameET"));

    public static final Target PASSWORD_INPUT = Target.the("password input")
        .located(By.id("com.saucelabs.mydemoapp.android:id/passwordET"));

    public static final Target LOGIN_BUTTON = Target.the("login button")
        .located(By.id("com.saucelabs.mydemoapp.android:id/loginBtn"));

    public static final Target TEXT_USER_LOCKED = Target.the("message locked")
        .located(By.id(" com.saucelabs.mydemoapp.android:id/passwordErrorTV"));
}
