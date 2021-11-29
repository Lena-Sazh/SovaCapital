package com.sovacapital.tests;

import com.sovacapital.helpers.DriverUtils;
import com.sovacapital.pages.MainPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.sovacapital.pages.MainPage.KEYWORD;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class SovaTests extends TestBase {

    @Test
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Open the Main Page")
    public void mainPageTest() {
        step("Open main page", () -> open(MainPage.URL));

        step("Search for Welcome", () -> $x("//*[@class='welcome']").isDisplayed());

        step("Page title should have text 'Sova Capital'", () -> {
            String expectedTitle = "Sova Capital";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @CsvSource({
            "News",
            "Key Facts",
            "Nominations",
            "Contact us"
    })

    @ParameterizedTest()
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Main Page information blocks are present")
    void infoBlocksArePresentTest(String tabName) {
        step("Open main page", () -> open(MainPage.URL));

        step("Select tab", () -> $$(byText(tabName)).first().click());
    }

    @CsvSource({
            "Who We Are",
            "What We Do",
            "Client & Counterparty Relations",
            "News",
            "Contacts"
    })

    @ParameterizedTest()
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Main Page tabs are present")
    void tabsArePresentTest(String tabName) {
        step("Open main page", () -> open(MainPage.URL));

        step("Select tab", () -> $$(byText(tabName)).first().click());
    }

    @CsvSource({
            "Research Portal",
            "Smart",
            "Sova Events"
    })

    @ParameterizedTest()
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Tabs for Portals are present")
    void tabsForPortalsArePresentTest(String tabName) {
        step("Open main page", () -> open(MainPage.URL));

        step("Select login button", () -> $(MainPage.loginButton).click());

        step("Check portal tab is enabled", () -> $$(byText(tabName)).first().isEnabled());
    }

    @Test
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Search by keyword")
    public void searchTest() {
        step("Open main page", () -> open(MainPage.URL));

        step("Search for Search button", () -> $(MainPage.searchButton).click());

        step("Input " + KEYWORD + " value", () -> $(MainPage.searchArea).setValue(KEYWORD).submit());

        step("Get search results", () -> $(MainPage.searchResults).doubleClick());

        step("Check if the article with " + KEYWORD + " is exist", () -> {
            String expectedTitle = "Sova Capital Wins the Best Boutique Prime Broker Category at the HFM Global European Services Awards 2021 | Sova Capital";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Tag("SMOKE")
    @Feature("Main Page")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://sovacapital.com/'", () ->
            open(MainPage.URL));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

}