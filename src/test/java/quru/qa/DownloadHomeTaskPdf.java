package quru.qa;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.*;

public class DownloadHomeTaskPdf {
    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/files/dkp.pdf";
        String expectedData = "Договор";
        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, containsText(expectedData));
    }
}
