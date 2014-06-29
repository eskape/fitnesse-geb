package pages

import geb.Page
import org.openqa.selenium.Keys

class GoogleHomePage extends Page {
    static url = "http://www.google.com/?complete=0"
    static at = { title == "Google" }
    static content = {
        searchField { $("input[name=q]") }
    }

    void submitForm() {
        searchField << Keys.ENTER
        browser.page GoogleResultsPage
    }

    void search(String searchTerm) {
        searchField.value searchTerm
        submitForm()
    }
}

class GoogleResultsPage extends Page {
    static at = { waitFor { title.contains("Google") } }
    static content = {
        results(wait: true) { $("#rso div.srg li.g") }
        result { index -> results[index] }
        resultLink { index -> result(index).find("a") }
    }
}

