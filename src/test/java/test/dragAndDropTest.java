package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class dragAndDropTest {
    @Test

    void dragAndDrop(){
        //открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //поменять местами элемент А и элемент В
        $("#column-a").dragAndDropTo($("#column-b"));
        //проверка  что в древе первым элементом стоит Элемент с текстом В
        $$("#columns > div").get(0).shouldHave(text("B"));
        //проверка  что в древе вторым элементом стоит Элемент с текстом А
        $$("#columns > div").get(1).shouldHave(text("A"));

    }
}
