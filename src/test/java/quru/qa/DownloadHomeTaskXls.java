package quru.qa;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.*;

public class DownloadHomeTaskXls {
    @Test
    void xlsTestAssert() throws IOException {
        String xlsFilePath = "./src/test/resources/files/Book_list.xlsx";
        String expectedData = "Достоевский";
        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));
    }
    @Test
    void xlsTestgetClass() throws IOException {
        String xlsFilePath = "./src/test/resources/files/Book_list.xlsx";
        String expectedData = "Пушкин";
        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(3).getCell(1).toString();
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void xlsxTestgetClass() throws IOException {
        String xlsFilePath = "./src/test/resources/files/Book_list.xlsx";
        String expectedData = "Толстой";

        String actualData = readXlsxFromPath(xlsFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
