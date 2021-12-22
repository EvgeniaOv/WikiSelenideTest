package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWiki {

    @Test
    void shouldFindSelenideWiki() {
       //открыть страницу гитхаба в бразере
        open("https://github.com/");

        //в поисковой строке ввести Selenide кликнуть Ентер
        $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
        //клик на раздел Wiki
        $(byText("Wikis")).click();



        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

        sleep(5000);
    }
}
