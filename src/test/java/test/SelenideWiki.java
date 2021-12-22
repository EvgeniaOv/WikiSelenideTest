package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byLinkText;
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
        //в списке элементов страницы должно быть SoftAssertions. клик на страницу SoftAssertions
        $(byLinkText("SoftAssertions")).shouldBe(visible).click();
        //проверить, что внутри есть пример кода для JUnit5
        $("#wiki-content"). shouldHave(text("Using JUnit5 extend test class:"));
    }
}
