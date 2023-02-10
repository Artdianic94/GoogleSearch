package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchResultPage;


public class SearchingTextTest extends BaseTest {
    SearchResultPage searchResultPage;
    @Test
    public void searchingHelloTest() {
        searchResultPage = new SearchResultPage(driver);
        searchResultPage.openPage();
        String actualResult = searchResultPage.getSearchingText();
        System.out.println(actualResult);
        boolean actText = actualResult.contains("Hello, world!");
        Assert.assertTrue(actText);
    }
}
