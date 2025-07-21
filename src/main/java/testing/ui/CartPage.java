package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    private CartPage() { }

    public static final Target TITLE_CART = Target.the("title cart")
            .located(By.xpath("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]"));

    public static final Target TITLE_PRODUCT_CART = Target.the("title producti")
            .located(By.id("com.saucelabs.mydemoapp.android:id/titleTV"));

}








