package quru.qa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class DownloadSelenideFile {
    @Test
    void selenideFileDownload() throws FileNotFoundException {
        Selenide.open("https://github.com/selenide/selenide/blob/master/README.md");
        $("#raw-url").download();
    }
}
