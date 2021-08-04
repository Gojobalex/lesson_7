package quru.qa;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextFromPath;

public class TxtFileTests {
    @Test
    void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/files/1.txt";
        String expectedData = "project";

        String actualData = readTextFromPath(txtFilePath);
        assertThat(actualData, containsString(expectedData));
    }
    @Test
    void txtTest2() throws IOException {
        String txtFilePath = "./src/test/resources/files/1.txt";
        String expectedData = "project";

        String actualData = readTextFromPath(txtFilePath);
        assertThat(actualData, containsString(expectedData));
    }
    @Test
    void txtTest3() throws IOException {
        String txtFilePath = "./src/test/resources/files/1.txt";
        String expectedData = "project";

        String actualData = readTextFromPath(txtFilePath);
        assertThat(actualData, containsString(expectedData));
    }
    @Test
    void txtTest4() throws IOException {
        String txtFilePath = "./src/test/resources/files/1.txt";
        String expectedData = "project";

        String actualData = readTextFromPath(txtFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
