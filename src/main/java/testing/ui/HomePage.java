package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    private HomePage() { }

    public static final Target HAMBURGER_MENU = Target.the("boton hamburgesa")
        .located(By.id("com.saucelabs.mydemoapp.android:id/menuIV"));

    public static final Target HOME_TITLE = Target.the("title podructs")
            .located(By.id("com.saucelabs.mydemoapp.android:id/productTV"));

    public static final Target DASHBOARD_TEXT = Target.the("text login")
        .located(By.xpath("//android.widget.TextView[@content-desc='Login Menu Item']"));

    public static final Target DASHBOARD_TEXT_LOGOUT = Target.the("text logout")
        .located(By.xpath("//android.widget.TextView[@content-desc='Logout Menu Item']"));

    public static final Target SELECTOR_PRODUCT = Target.the("select product")
        .located(By.xpath ("//*[@text='Sauce Labs Backpack']/preceding-sibling::android.widget.ImageView"));
}