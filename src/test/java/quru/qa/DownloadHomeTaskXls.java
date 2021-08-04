package quru.qa;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;
import static utils.Files.getXls;

public class DownloadHomeTaskXls {
    @Test
    void pdfTestAssert() throws IOException {
        String xlsFilePath = "./src/test/resources/files/Book_list.xlsx";
        String expectedData = "Достоевский";
        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));
    }
    @Test
    void pdfTestgetClass() throws IOException {
        String xlsFilePath = "./src/test/resources/files/Book_list.xlsx";
        String expectedData = "Пушкин";
        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(3).getCell(1).toString();
        assertThat(xls, XLS.containsText(expectedData));
    }
}
