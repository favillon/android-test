package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {

    private ProductPage() { }

    public static final Target ADD_TO_CARD_BTN = Target.the("btn add cart")
            .located(By.id("com.saucelabs.mydemoapp.android:id/cartBt"));

    public static final Target VIEW_CARD_BTN = Target.the("btn view cart")
            .located(By.id("com.saucelabs.mydemoapp.android:id/cartIV"));


}








