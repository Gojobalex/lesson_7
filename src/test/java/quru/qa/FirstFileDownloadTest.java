package quru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

public class FirstFileDownloadTest {

    @Test
    void fileDownload() throws Exception {
        Selenide.open("https://github.com/Gojobalex/lesson_7/blob/master/Random_file.docx");
        File downloadedFile = $("#raw-url").download();
        String s = FileUtils.readFileToString(downloadedFile, "UTF-8");
        Assertions.assertTrue(s.contains("ЭКОНОМИЧЕСКИЙ ФАКУЛЬТЕТ"));
    }
}
