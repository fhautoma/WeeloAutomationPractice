package co.com.weelo.tasks;

import co.com.weelo.userinterfaces.EveningDresses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AgregarVestidoACarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(EveningDresses.RESULT_DRESS), Click.on(EveningDresses.BUTTON_ADD));
        actor.attemptsTo(WaitUntil.the(EveningDresses.QUANTITY, isClickable()).forNoMoreThan(10).seconds());
    }

    public static AgregarVestidoACarrito agregar(){
        return Tasks.instrumented(AgregarVestidoACarrito.class);
    }
}