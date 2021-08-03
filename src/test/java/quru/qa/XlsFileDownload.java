package quru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class XlsFileDownload {

    @Test
    void xlsDownload(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream((""));
        XLS xlsFile = new XLS(stream);
        xlsFile.excel.

    }
}
