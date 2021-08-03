package quru.qa;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.zip.ZipInputStream;

public class ZipDownloadTest {
    @Test
    void simpeZipTest() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream(("zip/arhive.zip"));
        ZipInputStream zip = new ZipInputStream(stream);

    }
}
