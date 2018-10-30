package tests;

import core.SetUp;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DoodlePage;
import pages.GooglePage;

public class GooglePageTest extends SetUp {

    private GooglePage googlePage;
    private DoodlePage doodlePage;

    @BeforeClass
    private void run() {
        googlePage = openGooglePage();
    }

    @Test
    private void shouldTypeInGoogle() {
        googlePage.typeInSearchEngine("Co nowego u Morawieckiego");
        googlePage.clearSearchEngine();
        czekaj();
    }




}
