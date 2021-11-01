package com.sovacapital.pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public static final String URL = "https://sovacapital.com/";
    public static final String searchButton = ".btn-search";
    public static final String searchArea = ".form-control-search";
    public static final String searchResults = ".searchwp-live-search-result";
    public static final String KEYWORD = "Best Boutique Prime Broker";


    String loginButton = ".btn-login";
    String defaultButton = ".login_popup_wrap";

    public MainPage openMainPage() {
        open(URL);
        return this;
    }

    public void selectTab(String tabName) {
        $$(byText(tabName)).first().click();
    }

    public void selectLoginTab(String tabName) {
        $(loginButton).click();
        $(defaultButton).isEnabled();
    }

}
