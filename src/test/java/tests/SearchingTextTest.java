package tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SearchResultPage;


public class SearchingTextTest extends BaseTest {

    @Test
    public void searchingHelloTest() {
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.openGooglePage();
        String actualText = searchResultPage.sendTextAndGetFirstSearchedText();
        Assertions.assertThat(actualText).contains("Hello, world!");
    }
}
