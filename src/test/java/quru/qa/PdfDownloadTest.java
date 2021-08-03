package quru.qa;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PdfDownloadTest {

    @Test
    void junitTest() throws IOException {
        Selenide.open("https://github.com/Gojobalex/lesson_7/blob/master/Book_list.xlsx");
        File pdfDownload = $("#raw-url").download();
        PDF parsePDF = new PDF(pdfDownload);
        assertThat(new String(parsePDF.text)).contains("Договор купли-продажи транспортного средства");
    }
}
