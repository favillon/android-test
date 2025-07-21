package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    private CartPage() { }

    public static final Target TITLE_CART = Target.the("title cart")
        .located(By.xpath("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]"));

    public static final Target TITLE_PRODUCT_CART = Target.the("title product")
        .located(By.id("com.saucelabs.mydemoapp.android:id/titleTV"));

    public static final Target PROCEED_CHECKOUT_BTN = Target.the("proceed to checkout btn")
        .located(By.id("com.saucelabs.mydemoapp.android:id/cartBt"));
}








