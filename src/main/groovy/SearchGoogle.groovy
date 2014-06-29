import geb.Browser
import pages.GoogleHomePage
import pages.GoogleResultsPage


class SearchGoogle {

    def searchString
    def searchResult

    def firstSearchResult() {
        return searchResult
    }


    def execute() {
        Browser.drive() {
            to GoogleHomePage
            search searchString
            at GoogleResultsPage
            searchResult = resultLink(0).text()
        }

    }
}
