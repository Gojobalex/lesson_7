package quru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class XlsFileDownload {

    @Test
    void xlsDownload() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream(("Book_list.xlsx"));
        XLS xlsFile = new XLS(stream);
        Assertions.assertEquals("Достоевский",xlsFile.excel.getSheetAt(1).getRow(2).getCell(1).getStringCellValue());
    }
}
