package co.com.weelo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://automationpractice.com/index.php")

public class HomePageYourLogo extends PageObject {
    public  static final Target DRESSES = Target.the("Seccion dresses")
            .locatedBy("//*[@id='block_top_menu']/ul/li[2]/a");

    public  static final Target EVENING_DRESSES = Target.the("Subsección Evening dresses")
            .locatedBy("//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a");
}
