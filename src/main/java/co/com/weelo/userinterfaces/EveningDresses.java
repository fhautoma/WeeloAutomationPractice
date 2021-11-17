package co.com.weelo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EveningDresses {
    public static final Target RESULT_DRESS = Target.the("Resultado de búsqueda")
            .locatedBy("//*[contains(@title, 'Printed Dress') and (@class = 'replace-2x img-responsive')]");

    public static final Target BUTTON_ADD = Target.the("Resultado de búsqueda")
            .locatedBy("//*[@title='Add to cart']");

    public static final Target QUANTITY = Target.the("Resultado de búsqueda")
            .locatedBy("//span[@id='layer_cart_product_quantity']");
}