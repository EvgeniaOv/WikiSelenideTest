package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWiki {
//  задание 1: 1.$("h1 div") - поиск первого вложенного div внутри h1
//$("h1").$("div") - поиск сначла перевого h1, а  внем первого div

    //задание 2:
    @Test
    void shouldFindSelenideWiki() {
        //открыть страницу гитхаба в бразере
        open("https://github.com/");
        //в поисковой строке ввести Selenide кликнуть Ентер
        $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
        // перейти на проект Selenide
        //в части стринцы с названием Ul (по коду) с классом repo-list есть раздед а,
        // в котором есть прямая ссылка на переход в проект selenide. Кликаем на нее.
        $("ul.repo-list a[href='/selenide/selenide']").click();
        // клик на раздел Wiki
        $(byText("Wiki")).click();
        //на правой части экрана нажать Show more
        $(".js-wiki-more-pages-link").click();
        //в списке элементов страницы должно быть SoftAssertions. клик на страницу SoftAssertions
        $(byText("SoftAssertions")).click();
        //проверить, что внутри есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
    }
