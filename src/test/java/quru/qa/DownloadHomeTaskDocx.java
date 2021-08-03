package quru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DownloadHomeTaskDocx {
    @Test
    void docxFileDownload() throws IOException {
        Configuration.downloadsFolder = "downloads";
        Selenide.open("https://github.com/Gojobalex/lesson_7/blob/master/TextFile.docx");
        File downloadFile = $(byText("View raw")).download();
        String fileContent = FileUtils.readFileToString(downloadFile, StandardCharsets.UTF_8);
        assertThat(fileContent, containsString("Текстовый файл"));
    }
}
